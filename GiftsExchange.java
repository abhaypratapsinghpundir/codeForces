import java.util.Scanner;

public class GiftsExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of friends
        int n = scanner.nextInt();

        // Create an array to store the gift giver information
        int[] p = new int[n];

        // Read the gift givers' information
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }

        // Create an array to store the result
        int[] result = new int[n];

        // Find out who gave the gift to each friend
        for (int i = 0; i < n; i++) {
            // The friend who received a gift from friend i is stored in p[i]-1
            result[p[i] - 1] = i + 1;
        }

        // Output the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        
        scanner.close();
    }
}
