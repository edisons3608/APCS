
/**
 * Write a description of class LinearSearcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinearSearcher
{
    // instance variables - replace the example below with your own
    public static int linearSearch(int[] nums, int target){
        for(int x = 0;x<nums.length;x++){
            if(target == nums[x]){
                return x;
            }
        }
        return -1;
    }
    
}
