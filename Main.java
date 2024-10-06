import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize the scanner to take input
        Scanner sc = new Scanner(System.in);
        
        // Input the number of teams
        int n = sc.nextInt();
        
        // Arrays to store home and guest uniform colors for each team
        int[] homeColors = new int[n];
        int[] guestColors = new int[n];
        
        // Input the home and guest uniform colors for each team
        for (int i = 0; i < n; i++) {
            homeColors[i] = sc.nextInt();  // Home uniform color of team i
            guestColors[i] = sc.nextInt(); // Guest uniform color of team i
        }
        
        // Counter for the number of games where the host wears guest uniform
        int guestUniformCount = 0;
        
        // Compare each team's home and guest colors for each game
        // If home team's home color matches guest team's guest color, host wears guest uniform
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && homeColors[i] == guestColors[j]) {
                    guestUniformCount++;
                }
            }
        }
        
        // Output the result
        System.out.println(guestUniformCount);
        
        // Close the scanner
        sc.close();
    }
}

