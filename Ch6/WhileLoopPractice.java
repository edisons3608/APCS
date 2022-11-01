
/**
 * Write a description of class WhileLoopPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WhileLoopPractice
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int counter = 0;
        while(counter <= 1000){
            System.out.print(counter + " ");
            if(counter % 10 ==0){
                System.out.println();
            }
            counter++;
        }
    }
    public static void countdown(){
        int counter = 10;
        while(counter > 0){
            System.out.println(counter);
            counter--;
        }
        
    }
    public static void interest(){
        Scanner keys = new Scanner(System.in);
        
        System.out.println("What is the amount you are investing?");
        String input = keys.nextLine();
        double total = Double.parseDouble(input);
        int years = 0;
        while(total < Double.parseDouble(input)*2){
            total *= 1.04;
            years++;
            
        }
        System.out.println(years);
        //2*A = A(1.04)^t
    }
    public static void findMax(){
        Scanner keys = new Scanner(System.in);
        double max = -99;
        
        boolean flag = true;

        while(flag){
            System.out.println("Enter a quiz score. Enter -1 to quit");
            int quizScore = Integer.parseInt(keys.nextLine());
            
            if(quizScore == -1){
                flag = false;
            }else{
                if(quizScore > max){
                    max = quizScore;
                }
                
                
            }
        
        }
        System.out.println(max);
        
        
    }
}
