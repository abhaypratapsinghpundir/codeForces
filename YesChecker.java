import java.util.Scanner;

public class YesChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int t = scanner.nextInt();
        scanner.nextLine();  // Consume the newline after the integer input

        for (int i = 0; i < t; i++) {
            // Read the string for the current test case
            String s = scanner.nextLine();

            // Check if the string equals "YES" in a case-insensitive manner
            if (s.equalsIgnoreCase("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
