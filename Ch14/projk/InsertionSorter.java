
/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class InsertionSorter
{
    // instance variables - replace the example below with your own
    public static int[] insertionSort(int[] arr){
        for(int x = 1;x<arr.length;x++){
            int key = arr[x];
            
            int j = x-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static ArrayList<String> insertSort(ArrayList<String> arr){
        for(int x = 1;x<arr.size();x++){
            String key = arr.get(x);
            int j = x-1;
            while(j >= 0 && key.compareTo(arr.get(j)) < 0){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,key);
        }
        return arr;
    }
}
