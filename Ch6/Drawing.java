
/**
 * Write a description of class Drawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drawing
{
    // instance variables - replace the example below with your own
    public static void drawFilledRect(int rows, int cols){
        for(int r = 1;r<=rows;r++){
            for(int c = 1;c<=cols;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printHollowRect(int rows, int cols){
        for(int r = 1;r<=rows;r++){
            for(int c = 1;c<=cols;c++){
                if(c == cols || r == rows || r == 1 || c == 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
