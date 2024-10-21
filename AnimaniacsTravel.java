import java.util.Scanner;

public class AnimaniacsTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input values for Yakko and Wakko's rolls
        int Y = scanner.nextInt();
        int W = scanner.nextInt();

        // Calculating the highest value that Dot needs to beat or tie
        int maxRoll = Math.max(Y, W);

        // Number of favorable outcomes for Dot (rolling maxRoll or higher)
        int favorableOutcomes = 6 - maxRoll + 1;

        // Total possible outcomes (6-sided die)
        int totalOutcomes = 6;

        // Simplify the fraction by finding the greatest common divisor (GCD)
        int gcd = gcd(favorableOutcomes, totalOutcomes);

        // Output the probability in irreducible fraction
        System.out.println((favorableOutcomes / gcd) + "/" + (totalOutcomes / gcd));

        scanner.close();
    }

    // Function to calculate the greatest common divisor (GCD) using Euclid's algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
