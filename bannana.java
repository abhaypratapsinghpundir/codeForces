import java.util.Scanner;

public class bannana {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt(); // Cost of the first banana
        int n = in.nextInt(); // Initial dollars the soldier has
        int w = in.nextInt(); // Number of bananas the soldier wants

        System.out.println(borrow(k, n, w));
        in.close();
    }

    public static int borrow(int k, int n, int w) {
        // Calculate the total cost of all the bananas using the arithmetic series formula
        int totalCost = k * w * (w + 1) / 2;

        // Calculate the amount to borrow, if needed
        int amountToBorrow = totalCost - n;

        // If the soldier has enough money, no borrowing is needed
        return Math.max(0, amountToBorrow);
    }
}
