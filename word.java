
import java.util.*;
public class word {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int n = str.length();
        int low  =0;
        int high =0;
        for(int i =0;i<n;i++){
            if(Character.isLowerCase(str.charAt(i))) low++;
            else high++;

        }
        if(low>= high){
            System.out.print(str.toLowerCase());
        }else System.out.print(str.toUpperCase());
        in.close();
    }
}
