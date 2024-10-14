import java.util.Scanner;

public class ToastCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values
        int n = scanner.nextInt();   // Number of friends
        int k = scanner.nextInt();   // Number of bottles
        int l = scanner.nextInt();   // Milliliters per bottle
        int c = scanner.nextInt();   // Number of limes
        int d = scanner.nextInt();   // Slices per lime
        int p = scanner.nextInt();   // Grams of salt
        int nl = scanner.nextInt();  // Milliliters needed per toast
        int np = scanner.nextInt();  // Grams of salt needed per toast

        // Total milliliters of drink
        int totalDrink = k * l;

        // Total number of lime slices
        int totalLimes = c * d;

        // Calculating the maximum number of toasts based on the available drink, limes, and salt
        int maxDrinkToasts = totalDrink / (n * nl);  // Based on drink
        int maxLimeToasts = totalLimes / n;          // Based on limes
        int maxSaltToasts = p / (n * np);            // Based on salt

        // The number of toasts each friend can make is the minimum of the three
        int maxToasts = Math.min(maxDrinkToasts, Math.min(maxLimeToasts, maxSaltToasts));

        // Output the result
        System.out.println(maxToasts);
        
        scanner.close();
    }
}
