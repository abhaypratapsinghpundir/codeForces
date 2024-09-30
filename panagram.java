import java.util.*;
public class panagram {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        in.nextLine();
        String str = in.nextLine().toLowerCase();
        in.close();

        HashSet<Character> set = new HashSet<>();

        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        if(set.size()==26)System.out.print("YES");
        else System.out.print("NO");
    }
}
