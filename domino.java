import java.util.*;
public class domino {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m  = in.nextInt();
        int n = in.nextInt();
        System.out.print(fit(m, n));

    }
    public static int fit(int side1, int side2){
        return Math.floorDiv((side2*side1), 2);
    }
    
}
