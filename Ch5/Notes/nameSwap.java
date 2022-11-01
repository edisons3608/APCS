
/**
 * Write a description of class nameSwap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class nameSwap
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        System.out.println((int)'d');
        Scanner input = new Scanner(System.in);

        String nameInput = input.nextLine();

        int commaIndex = nameInput.indexOf(",");
        int spaceIndex = nameInput.indexOf(" ",commaIndex+2);
        //System.out.println(commaIndex);
        //System.out.println(spaceIndex);
        String lastName = nameInput.substring(0,commaIndex);
        String firstName = nameInput.substring(commaIndex+2,spaceIndex);
        String middleName = nameInput.substring(spaceIndex+1);
        
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        
        System.out.println(firstName.substring(0,1)+"."+middleName.substring(0,1)+"."+lastName.substring(0,1));
        
        int lengthName = (lastName+firstName+middleName).length();
        System.out.println("Length: "+lengthName);
        
        
        

    }
}
