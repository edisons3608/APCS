
/**
 * Write a description of class GradeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeCalculator
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        
        int numTests = 0;
        double sumTests  = 0;
        boolean active = true;
        String input;
        while(active){  
            System.out.println("Enter a score (or -1 to end) ");
            input = keys.nextLine();
            if(isNumeric(input)){
                if(input.equals("-1")){
                    active = false;
                    System.out.println(sumTests/numTests);
                }else{
                    sumTests += Double.parseDouble(input);
                    numTests = numTests + 1;
                    
                }
            }
            
        }
    }
    public static boolean isNumeric(String str) { 
        try {  
            Double.parseDouble(str);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
    }
    public static boolean areAmicable(int firstNum, int secondNum){
        if(firstNum <= 0 || secondNum <= 0){
            return false;
        }
        int sumFirst = 0;
        int sumSecond = 0;
        for(int x = 1;x<firstNum;x++){
            if(firstNum % x == 0){
                sumFirst += x;
            }
            
        }
        for(int x = 1;x<secondNum;x++){
            if(secondNum % x == 0){
                sumSecond += x;
            }
            
        }
        
        if(sumFirst == secondNum && sumSecond == firstNum){
            return true;
        }else{
            return false;
        }
    }
}
