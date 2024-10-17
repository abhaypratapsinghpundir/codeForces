import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            long x = scanner.nextLong(); // Value of x
            long y = scanner.nextLong(); // Value of y
            long n = scanner.nextLong(); // Value of n
            
            // Find the maximum k such that 0 <= k <= n and k % x == y
            long k = ((n - y) / x) * x + y;
            
            System.out.println(k);
        }
        
        scanner.close();
    }
}
