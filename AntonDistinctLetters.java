import java.util.HashSet;
import java.util.Scanner;

public class AntonDistinctLetters {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input line
        String input = scanner.nextLine();
        
        // Close the scanner as we don't need it anymore
        scanner.close();
        
        // Remove the curly braces and spaces from the input
        input = input.substring(1, input.length() - 1); // remove the first and last characters '{}'
        input = input.replace(" ", ""); // remove all spaces

        // Handle the case of an empty set
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }

        // Split the input by commas to get individual letters
        String[] letters = input.split(",");
        
        // Use a HashSet to store distinct letters
        HashSet<String> distinctLetters = new HashSet<>();

        // Add each letter to the set (duplicates will be ignored by the set)
        for (String letter : letters) {
            distinctLetters.add(letter);
        }

        // Output the size of the set (number of distinct letters)
        System.out.println(distinctLetters.size());
    }
}
