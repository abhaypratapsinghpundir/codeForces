import java.util.*;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of test cases
        
        // Loop through all test cases
        while (t-- > 0) {
            int arr[] = new int[4];
            
            // Reading the skill levels of the four players
            for (int i = 0; i < 4; i++) {
                arr[i] = in.nextInt();
            }
            
            // Finding the highest skill player from the first and second pairs
            int max1 = Math.max(arr[0], arr[1]);
            int max2 = Math.max(arr[2], arr[3]);
            
            // Sorting the array to easily get the two highest skill players
            Arrays.sort(arr);
            
            // Checking if the two highest players come from different pairs
            if ((max1 == arr[3] && max2 == arr[2]) || (max1 == arr[2] && max2 == arr[3])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
