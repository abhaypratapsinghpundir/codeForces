import java.util.Scanner;

public class Bachgold {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Read the input number n

        if (n % 2 == 0) {
            // If n is even, we can represent it using n/2 '2's
            System.out.println(n / 2);
            for (int i = 0; i < n / 2; i++) {
                System.out.print("2 ");
            }
        } else {
            // If n is odd, we can represent it using (n/2 - 1) '2's and one '3'
            System.out.println(n / 2);
            for (int i = 0; i < n / 2 - 1; i++) {
                System.out.print("2 ");
            }
            System.out.print("3");
        }

        sc.close();
    }
}
