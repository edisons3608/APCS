
/**
 * Write a description of class BinaryConverter here.
 *
 * @author Edison Sun
 * @v1
 */
public class BinaryConverter
{
    // instance variables - replace the example below with your own
    public static String convertToBase2(int num){
        if(num % 2 == num){
            return Integer.toString(num);
        }
        return convertToBase2(num / 2) + Integer.toString(num % 2);
    }
    public static int convertToBase10(String num){
        if(num.length() == 1){
            return Integer.parseInt(num);
        }
        return Integer.parseInt(num.substring(0,1))*(int)Math.pow(2,num.length()-1)+convertToBase10(num.substring(1));
    }
    
}
