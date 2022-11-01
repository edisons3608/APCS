
/**
 * Write a description of class compHello here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class compHello
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        System.out.println("Hello".compareTo("hello"));
        System.out.println(3.0==3);
        
        int x = 31;
        int y= 10;
        if(x>=5){
            if(x/y == 0){
                System.out.println("New Trier");
            }else{System.out.println("test");}
        }else{
            System.out.println("High School");
        }
        System.out.println(Math.floor(-1.777));
    }
    public static boolean isPerfectSquare(double number){
        return (int)Math.sqrt(number) == Math.sqrt(number);
    }
}
