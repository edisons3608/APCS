import java.util.ArrayList;  // NOTICE!!  

public class ArrListDemo
{
    public static void main (String[] args)
    {
        /**
         * Must use an import statement at top.  (Common mistake is to forget this.)
         * 
         * Advantages over Arrays:  
         * ArrayLists can grow or shrink in size. 
         * Have pre-written methods for common tasks.
         *   .size() 
         *   .add(Object something)
         *   .add(int index, Object something)
         *   .get(int index)
         *   .set(int index, Object something) //returns the data about to get lost forever
         *   .remove(int index)                //returns the data about to get lost forever
         *   .toString method
         *   
         */
        // Declare and initialize an array list called grades that holds Strings of letter grades.
        ArrayList<String> grades = new ArrayList<String>();

        // add method
        grades.add("A");
        grades.add("C");
        grades.add("D");
        grades.add("F");
        grades.add(1, "B");  //inserts the "B" at index 1 and moves all elements right
        
        // toString method
        System.out.println(grades); 
        // The arrayList class has a toString method that overrides the Object toString method
        // and prints the contents of the arrayList instead of the memory location.

        // size method
        System.out.println("size: " + grades.size());

        // get method
        System.out.println("get(1): " + grades.get(1));

        // set method
        grades.set(1, "B-");  //overwrites the previous value
        System.out.println("set(1, B-): " + grades);  

        // The set method RETURNS the value it is about to replace, which you can choose
        // to store in a variable for later or not.  In the code above, we did not store the value.
        // Below we will store the value about to be replaced to demonstrate how that works.
        System.out.println();
        String oldGrade = grades.set(0, "A-");
        System.out.println("After the line of code: String oldGrade = grades.set(0, A-) ");
        System.out.println("The ArrayList is now: " + grades);
        System.out.println("but we can still access the old grade: " + oldGrade);

        // remove method - RETURNS the values about to be removed. Can store if you want it.
        System.out.println();
        System.out.println("The remove method also returns the value about to be overwritten.");
        System.out.println("remove(2) returns the old C and stores it");
        String removedGrade = grades.remove(2);
        System.out.println("ArrayList is now: " + grades);
        System.out.println("but we can still access the removed grade: " + removedGrade);

        System.out.println();
        
        /**
         * Part 2: ArrayLists of Integers or Doubles
         * ArrayLists must hold Class Types and not primitive types (int, double, boolean, char).
         * If you want an ArrayList of ints, instead of 'int' you'll use the Wrapper Class 'Integer'
         * If you want an ArrayList of decimals, instead of 'double' you'll use the Wrapper Class 'Double'
         * The conversion from int to Integer and vice versa is now automatic with Java 
         * (and likewise with the converstion from double to Double and vice versa).
         * This automatic conversion is called auto-boxing (primitive to wrapper) and auto-unboxing (wrapper to primitive)
         * 
         */  
        


        
    }    
}

