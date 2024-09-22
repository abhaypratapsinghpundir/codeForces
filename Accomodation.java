import java.util.*;
public class Accomodation {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        System.out.print(times(n,in));

    }
    public static int times(int n, Scanner in){
        int count =0;
        for(int i =0;i<n;i++){
            int p = in.nextInt();
            int q = in.nextInt();
            if(q-p>=2) count++;
        }
        return count;
    }
    
}
