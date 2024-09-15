import java.util.*;
public class elephant {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(steps(n));

    }
    public static int steps(int n){
        int count =0;
        int[] arr= {5,4,3,2,1};
        int i=0;
        while(n!=0){
            while(arr[i]<=n && i<5){
                n=n-arr[i];
                count++;
        
            }
            i++;

        }
        return count;
    }    
       
    
}
