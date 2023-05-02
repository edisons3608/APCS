
/**
 * Write a description of class BinarySearcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearcher
{
    // instance variables - replace the example below with your own
    /* 
    public static int binarySearch(int[] nums, int target){
        
        int min = 0;
        int max = nums.length-1;
        int mid;
        while(min <= max){
            mid = (min+max)/2;
            if(nums[mid] > target){
                max = mid-1;
            }else if(nums[mid] < target){
                min = mid+1;
            }else{
                return mid;
            }
            
        }
        
        return -1;
        
    }
    */
   
    public static int binarySearch(int[] nums, int target){
        return helper(nums,target,0,nums.length-1);
    }
    private static int helper(int[] nums, int target, int min, int max){
        if(min > max){
            return -1;
        }
        int i = (min+max)/2;
        if(nums[i] > target){
            return helper(nums,target,min,i-1);
        }else if(nums[i] < target){
            return helper(nums,target,i+1,max);
        }else{
            return i;
        }
    }
}
