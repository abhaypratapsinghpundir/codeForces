
import java.util.*;

public class luckynumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();  // Use long for large numbers (up to 1018)
        System.out.println(isNearlyLucky(n) ? "YES" : "NO");
        in.close();
    }
    
    public static boolean isNearlyLucky(long n) {
        int luckyDigitCount = 0;
        
        // Count the lucky digits (4 or 7)
        while (n > 0) {
            long last = n % 10;
            if (last == 4 || last == 7) {
                luckyDigitCount++;
            }
            n /= 10;
        }
        
        // Check if the count of lucky digits is a lucky number (4 or 7)
        return luckyDigitCount == 4 || luckyDigitCount == 7;
    }
}
