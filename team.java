import java.util.*;
public class team {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        int count =0;
        for(int i =0;i<lines;i++){
            int p = in.nextInt();
            int v = in.nextInt();
            int q= in.nextInt();
            if(p==0 && q==1 && v==1)count++;
            if(p==1 && q==1 && v==0)count++;
            if(p==1 && q==0 && v==1)count++;
            if(p==1 && q==1 && v==1)count++;
          

        }
        System.out.print(count);
    }
}
