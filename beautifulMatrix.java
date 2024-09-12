import java.util.*;


public class beautifulMatrix {
    
    public static void main(String rga[]){
        Scanner in = new Scanner(System.in);
        int[][] table= new int[5][5];

        for(int i =0;i<5;i++){
            for(int j=0;j<5;j++){

                table[i][j]=in.nextInt();
            }
            
        }
        for(int i =0;i<5;i++){
            for(int j=0;j<5;j++){

                if(table[i][j]==1){
                    System.out.print(beauty(i, j));

                }
            }
            
        }
    }
    public static int beauty(int i, int j){
        int count =0;
        int res= Math.abs(i-2);
        count+= res;
        int res1 = Math.abs(j-2);
        count+= res1;
        
        return count;
    }
}
