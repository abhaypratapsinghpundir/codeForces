import java.util.Scanner;

public class MaxGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            // The maximum possible GCD for a range of 1 to n
            // is always n / 2 for the pair (n, n/2)
            System.out.println(n / 2);
        }

        scanner.close();
    }
}
