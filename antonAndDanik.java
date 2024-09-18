import java.util.*;

public class antonAndDanik {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();
        System.out.print(checker(n, str));
        in.close();

    }
    public static String checker(int n, String str){
        int a =0;
        int d=0;
        for(int i = 0;i<n;i++){
            if(str.charAt(i)=='A')a++;
            else d++;

        }
        if(a>d)return "Anton";
        else if (d>a) return "Danik";
        return "Friendship";
    }
    
}
