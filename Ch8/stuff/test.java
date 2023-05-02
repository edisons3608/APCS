
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class test
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int x = 0;x<5;x++){
            arr.add(x);
        }
        
        for(int x : arr){
            if(arr.get(x) == 2){
                arr.remove(x);
            }

        }
    }
}
