import java.util.Scanner;

public class Insomniacure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        int damagedDragons = 0;

        // Iterate over each dragon from 1 to d
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                damagedDragons++;
            }
        }

        // Output the result
        System.out.println(damagedDragons);

        sc.close();
    }
}
