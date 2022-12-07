public class Ch7Day1Demo
{
    public static void main(String[] args)
    {
        /**
         * An array is used to hold numerous elements of the same type...
         * Often used with big data
         * Also used to hold data that you may want to refer back to again later.  
         * For example, to compute an average of a large number of scores.  In the past, 
         * we took in each score and only kept track of the sum and the count to compute avg.
         * We could not go back and find the low or high score, or the fourth score from the 
         * data set.  An array can be used to hold all of the scores.
         */

        //Declaring
        double [] arr;

        //Initializing
        arr = new double [10];   // arr holds 10 elements of type double

        // Can declare and initialize in one step:  
        // double [] arr = new double [10];

        /**
         * Here is how we want to (partially) fill the array:
         *  0      1      2      3      4       5     6     7     8     9    // indices
         *  3.2    4.1    -5.6   10                                          // the values stored
         */

        // ASSIGN THE FIRST 4 VALUES OF THIS ARRAY WITH THE VALUES ABOVE
        
        
        
        
        // The line below won't work. Why? Will this be a compile or runtime error? Uncomment it out and try it.
        // arr[10] = 2;       
        
        
        // Finding the number of elements in an array:  arr.length
        System.out.println(arr.length);  
        /**
         * public instance variable, so no () at end.  Not a method. 
         * Usually instance variables are private, but not in this case. We are not worried though
         * because you can't change the length of the array.  Not being able to change the length
         * is a limitation of arrays. If you don't know how much data we are going to hold, you
         * may not want to use an array.
         */ 

        // FILL IN THE LAST ELEMENT OF ARR WITH THE SUM OF THE FIRST TWO ELEMENTS.  
        // WRITE YOUR LINE OF CODE GERNERALLY SO THAT IT COULD BE USED WITH AN ARRAY OF ANY SIZE.
        
        
        
    
    }
}