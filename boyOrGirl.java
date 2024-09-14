import java.util.*; 

public class boyOrGirl {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(detector(str));
        in.close();
    }
    
    public static String detector(String str){
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));            
        }           
        
        if(set.size() % 2 == 0) {
            return "CHAT WITH HER!";
        } else {
            return "IGNORE HIM!";
        }
    }
}
