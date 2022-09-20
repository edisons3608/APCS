import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class Ch4_Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ch4_Runner
{
    // instance variables - replace the example below with your own
    public static void processName(){
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter your name (in the format LAST, FIRST):");
        String userInput = keys.nextLine();
        String[] splitInput = userInput.split(",");
        
        String lastName = splitInput[0].trim();
        String firstName = splitInput[1].trim();
        
        System.out.println("Your name is : " + firstName + " " + lastName);
        
        
    }
    public static void processRectangle(){
        Scanner keys = new Scanner(System.in);
        
        
        
        String side1 = "";
        while(isNumeric(side1) == false){
            System.out.println("Enter the length of one side of a rectangle: ");
            side1 = keys.nextLine();
        }
        
        
        String side2 = "";
        while(isNumeric(side2) == false){
            System.out.println("Enter the length of the other side: ");
            side2 = keys.nextLine();
        }
        double side1Double = Double.parseDouble(side1);
        
        
        double side2Double = Double.parseDouble(side2);
        
        double area = side1Double*side2Double;
        double diagonal = Math.sqrt(side1Double*side1Double+side2Double*side2Double);
        
        System.out.println("The rectangle has an area of: " + area);
        System.out.println("The rectangle has a diagonal of: " + diagonal);
        
        
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
    return true;
    }
    public static void processPhoneNumber(){
        Scanner keys = new Scanner(System.in);
        
        System.out.println("Enter your phone number in the format (xxx)xxx-xxxx:");
        String input = keys.nextLine();
        int areaCode = Integer.parseInt(input.substring(1,4));
        int lastFour = Integer.parseInt(input.substring(9));
        System.out.println("Your area code is "+areaCode);
        System.out.println("The last four digits are "+lastFour);
        
        
        
    }
    public static void processInitials(){
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String input = keys.nextLine();
        String[] names = input.split(" ");
        
        ArrayList<String> initials = new ArrayList<String>();
        for(int x=0;x<names.length;x++){
            initials.add(names[x].substring(0,1).toUpperCase());
            
        }
        String finalInitials = String.join(".",initials);
        System.out.println("Your initials are "+finalInitials);
        
    }
    public static String removeLetter(String bitches,int index){
        return bitches.substring(0,index)+bitches.substring(index+1);
        
    }
        
}
