
/**
 * Write a description of class ForLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForLoops
{

    public static void main (String[] args)
    {
        /**
         * statement0;
         * for(initialization;condition;update)
         * {
         *     statement1;
         *     statement2;
         *     statement3;
         * }
         * 
         * order of execution:
         * (1)statement0
         * (2)initilization
         * (3)condition
         * (4)loop body
         * (5)update
         * 
         *  Repeat steps 3-5 until condition is false
         */

        for(int x = 0; x <= 50; x++)
        {
            System.out.print(x + " ");
        }
        //System.out.println(x);          
        System.out.println();
        System.out.println();
        
        // Why is there a compile error above?  (Comment out the line(s) of code causing the error.)
        
        // Is there a compile error below? 
        int x;
        for(x = 0; x <=50; x++)
        {
            System.out.print(x + " ");
        }
        //scope
        //System.out.println(x); 
        System.out.println();
        System.out.println();
        
        /**
         * Scope: the variable in the for loop initialization has scope within the loop only.
         * If you want it to be reffered to outside the loop, it must be declared
         * outside the loop.
         */

        // 1.  Use a for loop to count by 2's up to 40. Output:  2 4 6 8 10 12 ...
      
        for(x = 2;x<=40;x+=2){
            System.out.println(x);
        }
        
        
        
        System.out.println();
        System.out.println();
        
        // 2.  Use a for loop to count down by 1 from 10.  Stop at 1.
        
        for(x = 10;x>=1;x--){
            System.out.println(x);
        }
        
        
        System.out.println();
        System.out.println();
        
        // 3. Take your name and spell it backwards.  If name = Mrs. Bar, then output: raB .srM
        String name = "Edison";  // Use your own name.
        
        for(x = name.length()-1;x>=0;x--){
            System.out.println(name.substring(x,x+1));
        }
        
        // 4. When you are done, finish guessNumber() updates.  If you are done with this, you can do hw.
    }
}
