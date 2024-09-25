import java.util.*;

public class Drinks {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float quant = 0;
        
        for (int i = 0; i < n; i++) {
            int frac = in.nextInt();
            quant += frac;
        }
        
        // Output the result with precision
        System.out.printf("%.12f", quant / n);
    }
}
