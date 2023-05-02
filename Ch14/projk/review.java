
/**
 * Write a description of class review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class review
{
    // instance variables - replace the example below with your own
    public static String stringSearch(String[] arr, char letter){
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid].substring(0,1).compareTo(""+letter) < 0){
                low = mid+1;
            }else if(arr[mid].substring(0,1).compareTo(""+letter) > 0){
                high = mid-1;
            }else{
                return arr[mid];
            }
            
        }
        return "not found";
    }
}
