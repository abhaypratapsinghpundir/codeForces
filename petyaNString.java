import java.util.*;


public class petyaNString {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        str1 =str1.toLowerCase();
        str2 =str2.toLowerCase();
        System.out.print(check(str1, str2));

        
    }
    public static int check(String str1, String Str2){
        int res= str1.compareTo(Str2);
        if(res < 0) return -1;
        else if(res>0) return 1;
        else return 0;

    }
    
}
