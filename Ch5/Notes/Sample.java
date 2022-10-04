
/**
 * Write a description of class Sample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Sample
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Does it move?");
        String doesMove = keys.nextLine().toLowerCase();
        
        System.out.println("Should it move?");
        String shouldMove = keys.nextLine().toLowerCase();
        
        if(doesMove.equals("yes")){
            if(shouldMove.equals("yes")){
                System.out.println("No Problem");
            }else{
                System.out.println("Duct Tape");
            }
        }else{
            if(shouldMove.equals("yes")){
                System.out.println("WD-40");
            }else{
                System.out.println("No Problem");
            }
        }
    }
}
