import java.util.*;

public class HollowRectanglePattern{
    public static void hollow_rectangle(int totalrows, int totalcol){
        for(int i=1;i<= totalrows; i++){
            for(int j=1; j<=totalcol; j++){
                if(i==1 || i==totalrows || j==1 || j==totalcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Scanner Sc= new Scanner(System.in);
        int rows = Sc.nextInt();
        int col = Sc.nextInt();
        hollow_rectangle(rows,col);
    }
}
