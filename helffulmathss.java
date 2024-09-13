import java.util.*;
public class helffulmathss {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String str= in.nextLine();
        String[] ref = str.split("\\+");
        Arrays.sort(ref);

       
        System.out.println(String.join("+", ref));
   

    }
}
