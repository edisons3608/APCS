
/**
 * Write a description of class fib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fib
{
    // instance variables - replace the example below with your own
    public static long fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static long fastFib(int n){
        return fastFibHelper(n, 1,1);
        
    }
    private static long fastFibHelper(int n, long num1, long num2){
        if(n == 2){
            return num2;
        }else{
            return fastFibHelper(n - 1,num2,num1+num2);
        }
    }
}
