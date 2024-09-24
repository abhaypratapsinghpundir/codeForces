import java.util.*;
public class calculatingformula {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();  // Use long to handle large input size
        if (n % 2 == 0) {
            System.out.println(n / 2);  // Even case
        } else {
            System.out.println(-(n + 1) / 2);  // Odd case
        }
        in.close();
    }
}
