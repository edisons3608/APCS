import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * RandomNumberList is an array of n random integers 
 *               
 * 
 * @Edison Sun
 * @version 2.0
 */

public class RandomNumberList
{
    private List<Integer> data;

    // Default Constructor
    public RandomNumberList()
    {
        /**
         * Constructor for objects of class RandomNumberList
         */
        data = new ArrayList<Integer>();
        try
        {
            Scanner scan = new Scanner(new File("randomNumbers.csv"));

            while(scan.hasNext())
            {
                data.add(scan.nextInt());
            }
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    // Parameterized Constructor
    public RandomNumberList(int[] arr)
    {
        data = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++)
        {
            data.add(arr[i]);
        }
    }

    public void print()
    {
        for(int i = 0; i < data.size(); i++)
        {
            System.out.println(data.get(i));
        }        
    }

    public int getValue(int index)
    {
        return data.get(index);
    }

    public int getSize()
    {
        return data.size();
    }
    
    
    //**** DO NOT LOOK THINGS UP! ****
    //Figure out the solution for yourself.

    /**
     * returns the position of the target in the list
     *    (if there are multiple occurrences of the target, 
     *     any one of those positions may be returned.)
     * returns -1 if the target is not in the list
     */
    public int find(int target)
    {
        //YOUR CODE HERE 
        for(int x = 0;x<data.size();x++){
            if(target == data.get(x)){
                return x;
            }
        }
        return -1;
    }

    /**
     * returns true of the numbers are in ascending order
     * returns false otherwise
     */
    public boolean isSorted()
    {
        
        for(int x=0;x<data.size()-1;x++){
            if(data.get(x) > data.get(x+1)){
                return false;
            }
        }
        return true;
    }

    /**
     * mutate the list so that the data in ascending order
     */
    public void sort()
    {   
        quickSort(data,0,data.size()-1);
    }
    private static void quickSort(List<Integer> ls, int low, int high){
        if(low<high){
            int pi = partition(ls,low,high);
            
            quickSort(ls,low,pi-1);
            quickSort(ls,pi+1,high);
        }
    }
    private static int partition(List<Integer> ls, int low, int high){
        int pivot = ls.get(high);
        int i = low-1;
        
        for(int j = low; j < high;j++){
            if(ls.get(j) < pivot){
                i++;
                swap(ls,i,j);
            }
            
        }
        swap(ls,i+1,high);
        return i+1;
    }
    private static void swap(List<Integer> ls,int a, int b){
        int temp = ls.get(a);
        ls.set(a,ls.get(b));
        ls.set(b,temp);
    }

}
