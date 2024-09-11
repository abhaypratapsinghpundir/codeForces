import java.util.*;

public class nextRound {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }
        
        System.out.print(shortlist(n, k, scores));
    }
    
    public static int shortlist(int n, int k, int[] scores){
        int count = 0;
        int thresholdScore = scores[k - 1];  // The score of the k-th place participant
        
        for (int i = 0; i < n; i++) {
            // Count only those who have a score >= thresholdScore and > 0
            if (scores[i] >= thresholdScore && scores[i] > 0) {
                count++;
            }
        }
        
        return count;
    }
}
