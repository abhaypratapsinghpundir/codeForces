import java.util.*;

public class wrongsub {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int k = in.nextInt();
    System.out.print(solve(n,k));  
    in.close();
    }  
    public static int solve(int n, int k){
        
        for(int i =0;i<k;i++){
            int last=n%10;
            if(last>0 && last<10){
                n--;
                
            }if(last==0){
                n/=10;
                
            }
        }
        return n;
    }
}
