
import java.util.*;

public class EasyProblem {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        System.out.print(tester(n, arr));
    }
    public static String tester(int n, int[] arr){
        for(int i  =0;i<n;i++){
            if(arr[i]==1)return("HARD");
        }
        return("EASY");
    }
}
