import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of test cases
        int t = sc.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < t; i++) {
            // Input the ticket as a string
            String ticket = sc.next();
            
            // Calculate sum of first three digits
            int sum1 = (ticket.charAt(0) - '0') + (ticket.charAt(1) - '0') + (ticket.charAt(2) - '0');
            
            // Calculate sum of last three digits
            int sum2 = (ticket.charAt(3) - '0') + (ticket.charAt(4) - '0') + (ticket.charAt(5) - '0');
            
            // Output the result based on comparison of sums
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}

