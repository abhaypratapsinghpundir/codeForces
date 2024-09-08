import java.util.Scanner;
 
public class Watermelon {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input weight of the watermelon
        int w = scanner.nextInt();
        
        // Check if the weight can be divided into two positive even parts
        if (w >= 4 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
    

