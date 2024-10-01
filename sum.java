import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            // Check if one number is the sum of the other two
            if (a + b == c || b + c == a || a + c == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        in.close();  // Close scanner to prevent resource leak
    }
}
