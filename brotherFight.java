import java.util.*;

public class brotherFight {
   public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.print(bigboy(a, b));

    in.close();
   }
   public static int bigboy(int a,  int b){
    int years=0;

    while(a<=b){
        a*=3;
        b*=2;
        years++;
    }
    return years;
   }
}
