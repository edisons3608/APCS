
/**
 * Write a description of class ExploringStrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExploringStrings
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        System.out.println("My name is" + "Edison");
        System.out.println(9+9+" hello");
        System.out.println("bye "+9+9);
        System.out.println("what is the output?" + (9+9));
        System.out.println(""+9999.43+7);
        int x = 8;
        int y = 9;
        System.out.println(x+y);
        System.out.println("x"+"y");
        System.out.println("x"+y);
        
        Dog d1 = new Dog("Jackson",x);
        System.out.println(d1);
        System.out.println(x);
    
        
    }
    public static void print(String text){
        System.out.println(text);
    }
    
}
