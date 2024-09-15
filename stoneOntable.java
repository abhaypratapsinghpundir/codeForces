import java.util.*;
public class stoneOntable {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String str = in.next();
        System.out.print(removal(str, n));
        in.close();


    }
    public static int removal(String str, int length){
        int count =0;
        for(int i =0;i<length-1;i++){
            if(str.charAt(i)==str.charAt(i+1)) count++;
        }
        return count;
        
    }
    
}
