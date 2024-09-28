import java.util.Scanner;

public class HulkFeelings {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);
        
        // Taking the input value of n
        int n = scanner.nextInt();
        scanner.close();
        
        // StringBuilder to construct the final sentence
        StringBuilder hulkFeelings = new StringBuilder();
        
        // Loop to build the pattern for each layer
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // Odd layers - Hulk hates
                hulkFeelings.append("I hate");
            } else {
                // Even layers - Hulk loves
                hulkFeelings.append("I love");
            }
            
            // After each layer except the last, add "that"
            if (i < n) {
                hulkFeelings.append(" that ");
            }
        }
        
        // Ending the sentence with "it"
        hulkFeelings.append(" it");
        
        // Print the result
        System.out.println(hulkFeelings.toString());
    }
}
