import java.util.Scanner;

public class FindUniqueIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            // Read the length of the array
            int n = scanner.nextInt();
            int[] arr = new int[n];

            // Fill the array with inputs
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            // Check for the unique element
            int uniqueIndex = findUniqueIndex(arr);
            System.out.println(uniqueIndex + 1); // +1 because the output should be 1-based index
        }

        scanner.close();
    }

    // Method to find the index of the unique element
    public static int findUniqueIndex(int[] arr) {
        // If the first element is different from the second and third, it must be the unique one
        if (arr[0] != arr[1] && arr[0] != arr[2]) {
            return 0;
        }

        // If the first element is not unique, search for the unique element in the rest of the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return i;
            }
        }

        // Default return, though it shouldn't reach here based on the problem constraints
        return -1;
    }
}
