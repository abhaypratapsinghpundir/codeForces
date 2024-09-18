import java.util.*;

public class Translation {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();

        System.out.print(checker(s,t));
        in.close();

    }
    public static String checker(String s, String t){
        if (s.length() != t.length()) return "NO";

        int n = s.length();
        // Loop through each character in s and check its reverse in t
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(n - 1 - i)) {
                return "NO";
            }
        }
        return "YES";
    }
}
