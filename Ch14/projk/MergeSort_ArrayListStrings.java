import java.util.*;

/**
 * Write a description of class MergeSort_ArrayListStrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSort_ArrayListStrings
{
    // instance variables - replace the example below with your own
    public static ArrayList<String> mergeSort(ArrayList<String> arr){
        if(arr.size() == 1){
            return arr;
        }
        int mid = (arr.size()-1)/2;
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        for(int x = 0;x<mid+1;x++){
            left.add(arr.get(x));
        }

        for(int x = mid+1;x<arr.size();x++){
            right.add(arr.get(x));
    
        }
        return mergeString(mergeSort(left),mergeSort(right));
    }
    private static ArrayList<String> mergeString(ArrayList<String> left, ArrayList<String> right){
        int i = 0;
        int j = 0;
        ArrayList<String> comb = new ArrayList<String>();
        while(i < left.size() && j < right.size()){
            if(left.get(i).compareTo(right.get(j)) <= 0){
                comb.add(left.get(i));
                i++;
            }else{
                comb.add(right.get(j));
                j++;
            }
        }
        while(i < left.size()){
            comb.add(left.get(i));
            i++;
        }
        while(j < right.size()){
            comb.add(right.get(j));
            j++;
        }
        return comb;
    }
}
