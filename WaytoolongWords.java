import java.util.*;
public class WaytoolongWords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        WaytoolongWords wyt= new WaytoolongWords();
        int time = in.nextInt();
        while(time>=0){
            String i = in.nextLine();
            System.out.println(wyt.codeword(i));
            time--;

        }
        in.close();
    }
    public static String codeword(String a){
        int n = a.length();
        if(n>10){
        char first = a.charAt(0);
        char last = a.charAt(n-1);
        int midget = n-2;
        return (first+String.valueOf(midget)+last);
        }
        else{
            return a;
        }

    }
    
}
