
/**
 * Write a description of class Swap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Swap
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        
        int temp = x;
        x = y;
        y = temp;
        System.out.println("y: "+y+"x: "+x);
    }
}
