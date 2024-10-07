import java.util.Scanner;

public class SnakePattern {

    public static void main(String[] args) {
        // Input handling
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of rows
        int m = sc.nextInt();  // Number of columns
        
        // Process each row
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // Odd rows: full row filled with '#'
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
            } else {
                // Even rows: check if it's the first or second type of even row
                if (i % 4 == 0) {
                    // Every second even row: fill the first cell with '#'
                    System.out.print("#");
                    for (int j = 2; j <= m; j++) {
                        System.out.print(".");
                    }
                } else {
                    // First even row in the pair: fill the last cell with '#'
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
            }
            // Move to the next line after each row is processed
            System.out.println();
        }

        sc.close();
    }
}
