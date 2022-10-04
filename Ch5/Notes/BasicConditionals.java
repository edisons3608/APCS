
/**
 * Write a description of class BasicConditionals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class BasicConditionals
{
    public static void main(String[] args)
    {
        /**
         * A conditional statement allows you to make decisions about what of code to execute
         * based on a boolean (true/false) condition
         * 
         * Basic Syntax 
         * 
         * if(BOOLEAN CONDITION)
         * {
         *     statement1;
         *     statement2;
         *     statement3;
         * }
         * statement4;
         * 
         * If BOOLEAN CONDITION is true, then staement1,statement2,statement3 execute
         * and then we execute statement4 no matter what.
         * 
         */

        /**
         * Relational Operators
         * 
         * > 
         * < 
         * >=
         * <=
         * == (note that double equals checks for equality) 
         * != (not equal to) 
         * 
         */

        int someValue = -6;
        if(someValue > 0)
        {
            System.out.println("someValue is greater than zero!");
        }
        System.out.println("After the conditional");
        
        /**
         * We can add an optional else clause to an if conditional 
         * You can only have an else with an if
         */

        if(someValue > 0) 
        {
            System.out.println("SomeValue is positive");
        }
        else 
        {
            System.out.println("SomeValue is less than or equal to zero");
        }
        System.out.println("After the conditional");

        /**
         * STRINGS
         */

        String str1 = new String ("Hello");
        String str2 = new String ("Hello");  
        
        if(str1.equals(str2)){
            

            System.out.println("ur mom");
    
        }else{
            System.out.println("ur dad");
        }
        
        if(str1 == str2){
            System.out.println("dsf");
        }else{
            System.out.println("ur mom2");
        }
        
    }
}
