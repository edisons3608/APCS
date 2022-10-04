
/**
 * Write a description of class ComparingFloatingPoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparingFloatingPoints
{
    public static final double EPSILON = 1E-14;
    
    public static void main (String[] args)
    {
        double value1 = 0.3;
        double value2 = 0.1 + 0.1 + 0.1;
        
        // Write code to see if these values are equivalent.  Print either "yes" or "no".
        if(value1 == value2){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        
        if(Math.abs(value1 - value2) <= EPSILON){
            System.out.println("fucking same");
        }else{
            System.out.println("l bozo");
        }
        
    }
    
    public static void main2 (String[] args)
    {
        System.out.println(EPSILON + " is a class level constant.");
    }
}
