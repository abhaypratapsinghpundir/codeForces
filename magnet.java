import java.util.*;

public class magnet {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print(checker(n,in));

    }
    public static int checker(int n, Scanner in ){
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int count =0;
        for(int j =0;j<n-1;j++){
            if(arr[j]!=arr[j+1]) count++;
        }
        return count+1;

    }
    
}
