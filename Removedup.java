public class RemoveDuplicatesBasic {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 2, 5, 6, 3, 7};
        int n = arr.length;

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Remove duplicates
        System.out.print("\nArray after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] already appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, print it
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


