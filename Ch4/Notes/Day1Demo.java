
/**
 * Write a description of class Day1Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Day1Demo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int x = Integer.MAX_VALUE; //Constant in the Integer class
        System.out.println(x);
        System.out.println(x+1);
        System.out.println(x+2);
        System.out.println(Integer.MIN_VALUE); //Constant in the Integer class
        
        // Integer Division Error
        
        double a = 2/3;
        System.out.println(a);
        double b = (double)2/3;
        System.out.println(b);
        double c = 10;
        System.out.println(c);
        //int d = 10.5 compile error
        int d = (int)10.9999;
        
        
        //Powers
        
        System.out.println(Math.pow(9,3));
        
        //Modulus 
        
        System.out.println(15 % 4);
        System.out.println(5 % 4);
        System.out.println(4 % 4);
        System.out.println(3 % 4);
        System.out.println(2 % 4);
        System.out.println(1 % 4);
        System.out.println(0 % 4);
        System.out.println(quotientRemainderTheorem(13,4));
        System.out.println(isEven(2));
        System.out.println(isEven(57));
        avgOfThreeNums(1,2,3);
        avgOfThreeNums(10,10,10);
        avgOfThreeNums(3,5,6);
        avgOfThreeNums(3,4,5);
    }
    public static String quotientRemainderTheorem(int num, int divisor){
        int quotient = num/divisor;
        int remainder = num % divisor;
        return num + "/" + divisor +" = "+quotient+" remainder " + remainder;
    }
    public static boolean isEven(int n){
        //predicate methods - is_()
        /*
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
        */
        return n % 2 == 0;
    }
    public static void avgOfThreeNums(int num1, int num2, int num3){
        System.out.println((double)(num1+num2+num3)/3);
    }
    
}
