
/**
 * Write a description of class StringDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Quadratic q1 = new Quadratic(1,2,3);
        
        int x = 8;
        double y=  3.14;
        
        //initializing strings in two ways
        String str1 = new String("hello");
        String str2 = "hello"; //We use this more often
        
        System.out.println(x+y);
        
        System.out.println(x+str1);
        System.out.println(str1+x+y);
        System.out.println(x+y+""+x+y);
        int len = str2.length();
        
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
        //String case is immutable
        /*
        String s1 = "new";
        String s2 = "not new";
        
        s1 = s2;
        
        s1 = "hi";
        System.out.println(s2);
        */
       //Empty string
        String str3 = "";
        System.out.println(str3);
        
        //Initial value of a string;
        String str4; //Initial value is NULL, not empty string.
        //System.out.println(str4);
        
        String str5 = ""+9;
        str5 = 9+"";
        System.out.println(str5);
        
        String str6 = "911";
        int num = Integer.parseInt(str6);
        System.out.println(num+1);
        
        //Double.parseDouble(String);
        
        //Indices
        //01234..
        //Hello
        
        //SUBSTRINGS
        System.out.println(str1.substring(2)); //Substring strarts at 2 and goes to end of string.
        System.out.println(str1.substring(2,4)); //Inclusive of 2, not 4
        
        //Index Of
        
        String word = "Mississippi";
        System.out.println(word.indexOf("iss")); //first occurance
        System.out.println(word.indexOf("Miss"));
        System.out.println(word.indexOf("Mist"));
        System.out.println(word.indexOf("iss",2)); // start index
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
