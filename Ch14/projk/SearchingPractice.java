

public class SearchingPractice{
    private String[] words; 
    public SearchingPractice(String[] arr)
    {
        // Initialize words with a copy of the elements in arr
        words = new String[arr.length];
        for(int x = 0;x<words.length;x++){
            words[x] = arr[x];
        }
    }
    public String toString()
    {
        // the resulting string should have a comma separating each element in 
        // words with no comma after the last elelment.
        String returnStr = "";
        for(String word: words){
            returnStr += word + ", ";
        }
        return returnStr.substring(0,returnStr.length()-2);
    }
    /**
     * Write a linear search algorithm that returns the index of the LAST instance 
of target in words.
     * precondition: none
     * postcondition: returns the LAST index of target in array. If target is not 
found, returns -1.
     */
    public int linearSearch(String target)
    {
        for(int x = words.length-1;x>=0;x--){
            if(words[x].equals(target)){
                return x;
            }
        }
        return -1;
    }
    /**
     * Write a method to determine if words is sorted lexicographically or not.
     * precondition: none
     * postcondition: returns true if the data in array is sorted in ascending 
     *                lexicographical order and false otherwise.
     * Refer to the AP Quick Reference, your chapter 5 notes in BlueJ or pg. 186 in
your textbook
     * if you need a reminder how to use compareTo to compare Strings
     */
        
    public boolean isSorted()
    {
        for(int x = 0;x<words.length-1;x++){
            if(words[x].compareTo(words[x+1]) > 0){
                return false;
            }
        }
        return true;
    }
    /**
     * Write a binary search algorithm that returns the index of target in the 
array words.
     *precondition: words is a sorted array
     *postcondition: returns the index of target in array. If there are multiple 
instances of target in 
     *               the array, return any index of target.  If target is not 
found, return -1.
     */
    public int binarySearch(String target)
    {
        return binarySearchHelper(target,0,words.length-1);
    }
    
    private int binarySearchHelper(String target, int low, int high)
    {
        if(low > high){
            return -1;
        }
        int i = (low+high)/2;
        if(words[i].compareTo(target) > 0){
            return binarySearchHelper(target,low,i-1);
        }else if(words[i].compareTo(target) < 0){
            return binarySearchHelper(target,i+1,high);
        }else{
            return i;
        }
    }
}