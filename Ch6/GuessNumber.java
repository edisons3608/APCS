
/**
 * Write a description of class GuessNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GuessNumber
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        int randomInt = (int)(99*Math.random())+1;
        boolean flag = true;
        System.out.println("Guess a number bewteen 1 and 100, inclusive: ");
        String input = keys.nextLine();
        int count = 0;
        while(flag){
            if(input.equals("Q")){
                flag = false;
                System.out.println("The answer was: "+randomInt);
                System.out.println("You got it in " + count+ " guesses.");
            }
            else if(Integer.parseInt(input) == randomInt){
                count += 1;
                System.out.println("You got it!");
                flag = false;
                System.out.println("You got it in " + count+ " guesses.");
            }
            else if(Integer.parseInt(input) < randomInt){
                count += 1;
                System.out.println("Guess higher: ");
                input = keys.nextLine();
            }
            else if(Integer.parseInt(input) > randomInt){
                count += 1;
                System.out.println("Guess lower: ");
                input = keys.nextLine();
            }
            
            
        }
    }
}
