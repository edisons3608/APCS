
/**
 * Write a description of class LoopPractice here.
 *
 * @Edison Sun
 * @v1
 * 10/21/22
 */
import java.util.Scanner;
public class LoopPractice
{
    // instance variables - replace the example below with your own
    public static double average(){
        Scanner keys = new Scanner(System.in);
        
        String input;
        boolean flag = true;
        int sum = 0;
        int numQuizzes = 0;
        while(flag){
            System.out.println("Enter a quiz score: ");
            input = keys.nextLine();
            if(input.equals("")){
                System.out.println("You didn't enter anything");
            }
            else if(input.equals("-999")){
                flag = false;
            }else{
                sum += Integer.parseInt(input);
                numQuizzes += 1;
            }
        }
        return Math.round(10*sum/(double)numQuizzes)/10.0;
        
    }
    public static int sum30(int n){
        int sum = 0;
        for(int x = 1;x<=n;x++){
            sum += x*x*x;
        }
        return sum;
    }
    public static int sum200(int n){
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }
        boolean flag = true;

        int current = 1;
        int sum = 0;
        while(flag){
            
            if(Math.pow(current,3) >= n){
                flag = false;

            }else{
                sum += Math.pow(current,3);
            }
            
            
            
            current++;
        }
        return sum;
    }
    public static int sumLess1000(int n){
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }
        boolean flag = true;

        int current = 1;
        int sum = 0;
        while(flag){
            
            if(sum+Math.pow(current,3) >= n){
                flag = false;

            }else{
                sum += Math.pow(current,3);
            }
            
            
            
            current++;
        }
        return sum;
    }
    public static int pairedLetters(String text){
        if(text.length() < 2){
            return 0;
        }
        int pairs = 0;
        String current;
        String previous;
        for(int x = 1;x<text.length()-1;x++){
            current = text.substring(x,x+1);
            previous = text.substring(x-1,x);
            if(previous.equals(current)){
                pairs++;
            }
            
        }
        return pairs;
        
        
        //boundary condition "a"
    }
    public static int factorial(int n){
        if(n < 0){
            return -1;
        }
        int sum = 1;
        for(int x = 1;x<=n;x++){
            sum *= x;
        }
        return sum;
    }
    public static void printGeomSeq(int initial, double ratio, int amount){

        for(int x = 0;x<amount;x++){
            System.out.println(initial*Math.pow(ratio,x));
        }
    }
    
    
    
}
