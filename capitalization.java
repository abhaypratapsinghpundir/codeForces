import java.util.*;
public class capitalization {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String str= in.next();
        String result = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.print(result);
        in.close();
    }
    
}
