import java.util.HashMap;
import java.util.ArrayList;

/**
 * Write a description of class Tenths here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tenths
{
    // instance variables - replace the example below with your own
    private double[] nums;
    private final double EPSILON = 1E-14;
    public Tenths(){
        nums = new double[1000];
        
        for(int x = 0;x<1000;x++){
            nums[x] = Math.round(10*(9999*Math.random()+1))/10.0;
        }
    }
    public Tenths(int n){
        nums = new double[n];
        
        for(int x = 0;x<n;x++){
            nums[x] = Math.round(10*(9999*Math.random()+1))/10.0;
        }
    }
    public Tenths(double[] arr){
        nums = new double[arr.length];
        int count = 0;
        for(double item : arr){
            nums[count] = item;
            count++;
        }
    }
    public double getNum(int index){
        return nums[index];
    }
    public int find(double target){
        for(int x = 0;x<nums.length;x++){
            if(Math.abs(target-nums[x]) < EPSILON){
                return x;
            }
        }
        return -1;
    }
    public boolean contains(double target){
        for(double item:nums){
            if(Math.abs(target-item) < EPSILON){
                return true;
            }
        }
        return false;
    }
    public double average(){
        double sum = 0;
        for(double item:nums){
            sum += item;
        }
        return Math.round(10*sum/nums.length)/10.0;
        
    }
    public void replace(int index, double replace){
        nums[index] = replace;
    }
    public void replace(double initial, double replace){
        for(int x = 0;x<nums.length;x++){
            if(Math.abs(nums[x]-initial) < EPSILON){
                nums[x] = replace;
            }
        }
    }
    public void swap(int index1, int index2){
        double temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
        
    }
    public int[] findAll(double target){
        int[] part = new int[nums.length];
        int len = 0;
        for(int x = 0;x<nums.length;x++){
            if(Math.abs(nums[x]-target) < EPSILON){
                part[len] = x;
                len++;
            }
        }
        int[] finalArr = new int[len];
        for(int x = 0;x<len;x++){
            finalArr[x] = part[x];
        }
        return finalArr;
    }
    public String toString(){
        String returnStr = "";
        for(double item:nums){
            returnStr += item + ", ";
        }
        if(returnStr.length() <= 2){
            return "";
        }
        return returnStr.substring(0,returnStr.length()-2);
    }
    public boolean hasDuplicate(){
        HashMap<Double, Integer> frequent = new HashMap<>();
        
        
        for(double item:nums){
            if(frequent.containsKey(item)){
                    frequent.put(item,frequent.get(item)+1);
            }else{
                frequent.put(item,1);
            }
        }
        for(int count : frequent.values()){
            if(count >= 2){
                return true;
            }
        }
        return false;
    }
    public boolean isSorted(){
        if(nums.length < 1){
            return true;
        }
        int ascend = 0;
        int descend = 0;
        for(int x=0;x<nums.length-1;x++){
            if(nums[x] <= nums[x+1]){
                ascend += 1;
            }
            if(nums[x+1] <= nums[x]){
                descend += 1;
            }
                
        }
        
        if(ascend == nums.length-1 || descend == nums.length-1){
            return true;
        }
        return false;
    }
    void shuffle(double[] a)
    {
        // Math.random() returns a double positive
        // value, greater than or equal to 0.0 and
        // less than 1.0.
        for (int i = 0; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }
 
    // Swapping 2 elements
    void swap(double[] a, int i, int j)
    {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void sort(){
        /*
        double temp;
        for(int x = 0;x<nums.length;x++){
            for(int y = 0;y<nums.length-1;y++){
                if(nums[y+1] < nums[y]){
                    temp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = temp;
                }
            }
        }
        */
        boolean sorted = false;
        boolean flag = true;
        while(!sorted){
            shuffle(nums);
            sorted = true;
            for(int x = 0;x<nums.length-1;x++){
                if(nums[x] > nums[x+1]){
                    sorted = false;
                    
                }
            }
            
            
            
            
        }
    }
    
}
