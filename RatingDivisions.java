import java.util.Scanner;

public class RatingDivisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading number of test cases
        int t = scanner.nextInt();

        // Processing each test case
        for (int i = 0; i < t; i++) {
            int rating = scanner.nextInt();

            // Determining the division based on the rating
            if (rating >= 1900) {
                System.out.println("Division 1");
            } else if (rating >= 1600 && rating <= 1899) {
                System.out.println("Division 2");
            } else if (rating >= 1400 && rating <= 1599) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
        
        // Closing the scanner to avoid resource leak
        scanner.close();
    }
}
