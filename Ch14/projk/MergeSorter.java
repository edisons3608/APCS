import java.util.ArrayList;

/**
 * Write a description of class MergeSorter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MergeSorter
{   
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }else{
            int mid = (arr.length-1)/2;
        
            int[] arr1 = new int[mid+1];
            int[] arr2 = new int[arr.length-1-(mid)];
            
            for(int x = 0;x<mid+1;x++){
                arr1[x] = arr[x];
            }
            int z = 0;
            for(int x = mid+1;x<arr.length;x++){
                arr2[z] = arr[x];
                z++;
            }
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            
            return merge(arr1,arr2);
        }
        
        
    }
 
    public static int[] merge(int[] left,int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[left.length+right.length];
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
    
    
}
