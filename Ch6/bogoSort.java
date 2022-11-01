
/**
 * Write a description of class bogoSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class bogoSort
{
    // instance variables - replace the example below with your own
    public static ArrayList<Integer> bogo(ArrayList<Integer> sortList){
        boolean sorted = false;
        ArrayList<Integer> copied = (ArrayList)sortList.clone();
        
        while(true){
            
            sorted = true;
            for(int x = 0;x<sortList.size()-1;x++){
                if(copied.get(x) > copied.get(x+1)){
                    sorted = false;
                    
                }
            }
            
            if(sorted){
                return copied;
            }
            Collections.shuffle(copied);
            
            
        }
        
        }
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> sortList){
        int minIndex;
        for(int x = 0;x<sortList.size()-1;x++){
            minIndex = x;
            for(int y = x+1;y<sortList.size();y++){
                if(sortList.get(y) < sortList.get(minIndex)){
                    minIndex = y;
                }
            }
            Collections.swap(sortList,x,minIndex);
        }
        return sortList;
    }
    public static void main(String[] args){
        ArrayList<Integer> b1 = new ArrayList<Integer>(Arrays.asList(1,6,3,5,2,4,6,3,4,3,43,34,345));
        System.out.println(bogo(b1));
        
    }
}
