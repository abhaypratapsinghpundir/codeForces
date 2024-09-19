import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of friends and the height of the fence
        int n = scanner.nextInt();
        int h = scanner.nextInt();

        // Initialize total width
        int totalWidth = 0;

        // Read the heights of the friends
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();

            // Check if the friend needs to bend or not
            if (height > h) {
                totalWidth += 2; // Friend bends down, occupies width of 2
            } else {
                totalWidth += 1; // Friend walks normally, occupies width of 1
            }
        }

        // Output the total minimum width
        System.out.println(totalWidth);

        scanner.close();
    }
}
