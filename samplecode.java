import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Get input from user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Print sorted numbers
        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

