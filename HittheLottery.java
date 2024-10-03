import java.util.Scanner;

public class HittheLottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Reading the input value n (the amount of money)
        int n = sc.nextInt();

        // Define the denominations array in descending order
        int[] denominations = {100, 20, 10, 5, 1};

        int billCount = 0;

        // Loop through each denomination
        for (int denom : denominations) {
            // Count how many bills of this denomination can be used
            billCount += n / denom;

            // Reduce the remaining amount
            n %= denom;
        }

        // Output the minimum number of bills required
        System.out.println(billCount);
    }
}

