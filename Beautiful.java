import java.util.Scanner;

public class Beautiful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        System.out.println(findNextDistinctYear(y));
        scanner.close();
    }

    public static int findNextDistinctYear(int y) {
        y++;  // Start checking from the next year
        while (!allDigitsDistinct(y)) {
            y++;  // Keep incrementing until distinct digits are found
        }
        return y;
    }

    // Helper method to check if all digits in the year are distinct
    public static boolean allDigitsDistinct(int year) {
        String yearStr = Integer.toString(year);
        for (int i = 0; i < yearStr.length(); i++) {
            for (int j = i + 1; j < yearStr.length(); j++) {
                if (yearStr.charAt(i) == yearStr.charAt(j)) {
                    return false;  // If any two digits are the same, return false
                }
            }
        }
        return true;  // All digits are distinct
    }
}
