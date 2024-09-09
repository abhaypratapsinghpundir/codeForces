import java.util.*;

public class Bit {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
    
        System.out.print(result(times, in));
        in.close();
    }
    public static int result(int t, Scanner in){
       
        int count =0;
        for(int i =0; i<t; i++){
            
        String com = in.next();
        char op = com.charAt(1);
        if(op=='+')count++;
        else count--;
        
        }
       
        return count;
        

    }
}
