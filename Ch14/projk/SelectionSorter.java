
/**
 * Write a description of class SelectionSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class SelectionSorter
{
    // instance variables - replace the example below with your own
    public static int[] selectionSort(int[] arr){
        int i = 0;
        int min;
        for(int x = 0;x<arr.length;x++){
            min = i;
            for(int y = i;y<arr.length;y++){
                if(arr[y] < arr[min]){
                    min = y;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            i++;
        } 
        return arr;
    }
    public static ArrayList<Integer> selSort(ArrayList<Integer> arr){
        int i = 0;
        int min;
        for(int z = 0;z<arr.size();z++){
            min = i;
            for(int x = i;x<arr.size();x++){

                if(arr.get(x) < arr.get(min)){
                    min = x;
                    
                }
            }
            
            int temp = arr.get(i);
            arr.set(i,arr.get(min));
            arr.set(min,temp);
            i++;
        }
        return arr;
    }
}
