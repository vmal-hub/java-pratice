// GitLab Contributions Tracker (Java Version)
// This Java application fetches contribution data from a GitLab project and outputs it to an Excel file.

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;

public class GitlabContributionsTracker {
    private static final String GITLAB_API_URL = "https://gitlab.com/api/v4";
    private static final String PRIVATE_TOKEN = "<YOUR_ACCESS_TOKEN>"; // Replace with your GitLab access token
    private static final String PROJECT_ID = "<YOUR_PROJECT_ID>"; // Replace with your GitLab project ID
    private static final int DAYS = 30;

    public static void main(String[] args) throws IOException {
        Map<String, Map<String, Integer>> stats = new HashMap<>();

        String sinceDate = java.time.ZonedDateTime.now().minusDays(DAYS).toString();

        processEndpoint(stats, "/repository/commits", "author_name", sinceDate, "commits");
        processEndpoint(stats, "/merge_requests", "author.username", sinceDate, "merge_requests");
        processEndpoint(stats, "/issues", "author.username", sinceDate, "issues");

        exportToExcel(stats);
    }

    private static void processEndpoint(Map<String, Map<String, Integer>> stats, String endpoint, String userField, String since, String fieldKey) throws IOException {
        String urlStr = GITLAB_API_URL + "/projects/" + PROJECT_ID + endpoint + "?created_after=" + since + "&per_page=100";

        while (urlStr != null) {
            HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
            conn.setRequestProperty("Private-Token", PRIVATE_TOKEN);

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
            reader.close();

            JSONArray data = new JSONArray(json.toString());
            for (int i = 0; i < data.length(); i++) {
                JSONObject obj = data.getJSONObject(i);
                String user = userField.contains(".") ? extractNestedField(obj, userField) : obj.optString(userField);
                if (!user.isEmpty()) {
                    stats.putIfAbsent(user, new HashMap<>());
                    Map<String, Integer> userStats = stats.get(user);
                    userStats.put(fieldKey, userStats.getOrDefault(fieldKey, 0) + 1);
                }
            }

            urlStr = null; // Simplified: skipping pagination for brevity
        }
    }

    private static String extractNestedField(JSONObject obj, String path) {
        String[] parts = path.split("\\.");
        JSONObject current = obj;
        for (int i = 0; i < parts.length - 1; i++) {
            if (current.has(parts[i])) {
                current = current.optJSONObject(parts[i]);
            } else {
                return "";
            }
        }
        return current != null ? current.optString(parts[parts.length - 1], "") : "";
    }

    private static void exportToExcel(Map<String, Map<String, Integer>> stats) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Contributions");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("Username");
        header.createCell(1).setCellValue("Commits");
        header.createCell(2).setCellValue("Merge Requests");
        header.createCell(3).setCellValue("Issues");

        int rowNum = 1;
        for (String user : stats.keySet()) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(user);
            row.createCell(1).setCellValue(stats.get(user).getOrDefault("commits", 0));
            row.createCell(2).setCellValue(stats.get(user).getOrDefault("merge_requests", 0));
            row.createCell(3).setCellValue(stats.get(user).getOrDefault("issues", 0));
        }

        FileOutputStream fileOut = new FileOutputStream("gitlab_contributions.xlsx");
        workbook.write(fileOut);
        fileOut.close();
        workbook.close();

        System.out.println("Excel report generated: gitlab_contributions.xlsx");
    }
}

