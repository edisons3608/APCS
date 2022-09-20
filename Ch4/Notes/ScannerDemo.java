import java.util.Scanner;
/**
 * Write a description of class ScannerDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScannerDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = keys.nextLine();
        System.out.println("How many pets do you have?");
        
        int numPets = keys.nextInt();
        System.out.println("Height?");
        
        double ht = keys.nextDouble();
        
        System.out.println("Hello, " + name + "!");
        System.out.println("Your height is "+ht);

    }
}
