import java.util.Arrays;
import java.util.Scanner;

public class MaxArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        for (int test = 0; test < t; test++) {
            // Read n and k
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            // Read array a
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Read array b
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            
            // Sort array a in ascending order
            Arrays.sort(a);
            
            // Sort array b in descending order
            Arrays.sort(b);
            reverseArray(b);
            
            // Perform up to k swaps
            for (int i = 0; i < k; i++) {
                if (a[i] < b[i]) {
                    // Swap a[i] and b[i]
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                } else {
                    // No point in swapping further if a[i] >= b[i]
                    break;
                }
            }
            
            // Calculate the maximum possible sum of array a
            int maxSum = 0;
            for (int i = 0; i < n; i++) {
                maxSum += a[i];
            }
            
            // Print the result for the current test case
            System.out.println(maxSum);
        }
        
        sc.close();
    }
    
    // Helper function to reverse an array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
