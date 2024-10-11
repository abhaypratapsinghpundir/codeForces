import java.util.Scanner;

public class FindUniqueValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Loop through all test cases
        for (int i = 0; i < t; i++) {
            // Read the three digits a, b, c
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // Check which one is unique and print the result
            if (a == b) {
                System.out.println(c);
            } else if (a == c) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
        
        sc.close();
    }
}
