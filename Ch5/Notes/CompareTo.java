
/**
 * Write a description of class CompareTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompareTo
{
    public static void main (String[] args)
    {
        /**
         * Search for an ASCII chart.
         * Numbers are first
         * Capitals 
         * Lowercase Letters
         * 
         * A = 65
         * B = 66
         * a = 97
         * b = 98
         * 
         */

        String str1 = "art";
        String str2 = "car";   
        String str3 = "Car";
        String str4 = "cart";
        String str5 = "carries";

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str3.compareTo(str2));
        System.out.println(str2.compareTo(str4));  
        System.out.println(str4.compareTo(str2));
        System.out.println(str5.compareTo(str2));

        
        if(str1.compareTo(str2) < 0){
            System.out.println(str1 + " comes before " + str2);
        }
        
        
        /*
         * Char
         */
        
        char letter = 'A';
        
        int letterValue = (int)letter;
        System.out.println(letterValue);
        
        int letterVal = 100;
        System.out.println((char)letterVal);
    }
    
    
}
