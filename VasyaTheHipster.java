import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of red and blue socks
        int a = sc.nextInt(); // red socks
        int b = sc.nextInt(); // blue socks
        
        // Calculate the number of days he can wear different socks
        int differentDays = Math.min(a, b);
        
        // Calculate the remaining socks of the same color
        int remainingSocks = Math.abs(a - b);
        
        // Calculate the number of days he can wear the same socks from remaining ones
        int sameDays = remainingSocks / 2;
        
        // Output the result
        System.out.println(differentDays + " " + sameDays);
        
        // Close the scanner
        sc.close();
    }
}
