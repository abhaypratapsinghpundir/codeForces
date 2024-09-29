import java.util.*;
public class IWantToBeTheGuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the total number of levels
        int n = scanner.nextInt();
        
        // Use a HashSet to store the levels that can be passed by either Little X or Little Y
        HashSet<Integer> passedLevels = new HashSet<>();

        // Read Little X's levels
        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            int level = scanner.nextInt();
            passedLevels.add(level);
        }

        // Read Little Y's levels
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int level = scanner.nextInt();
            passedLevels.add(level);
        }

        // Check if they can pass all levels
        if (passedLevels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        scanner.close();
    }
}
