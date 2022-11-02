
/**
 * Write a description of class DrawingTwoHW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawingTwoHW
{
    // instance variables - replace the example below with your own
    public static void drawReverseTriangle(int n){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<n;col++){
                if(col >= n-1-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void drawTriangle(int height){
        for(int row = 0;row<height;row++){
            for(int col = 0;col<height;col++){
                if(col >= n-1-row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
            
    }
}
