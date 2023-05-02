import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
//Edison Sun
public class Analyzer
{
    private ArrayList<Person> list;
    public Analyzer()
    {
        list = new ArrayList<Person>();

        try {     
            File fileLocation = new File("/Users/edisonsun/Downloads/Data-2.txt");  

            // Create a new Scanner object which will read the data from the file passed in. 
            Scanner scanner = new Scanner(fileLocation);             

            // To check if there are more lines to read, check by calling the  
            // scanner.hasNextLine() method. Then read lines one by one 
            // until all are read. 

            while (scanner.hasNextLine()) { 
                String line = scanner.nextLine();

                /** Split the line into parts which were "tab delimited"**/
                String[] parts = line.split("\t");

                /** Use the split info to create a new Person object to add to the ArrayList **/
                /** (YOU NEED TO DO THIS!!!) ***/
                list.add(new Person(Double.parseDouble(parts[1]),Double.parseDouble(parts[2])));
                
                
                
                

            } 

            //if file not found, catch the exception thrown by the Scanner class
        } catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        }
    }
    // This method may help with debugging. It will print all Person objects in the ArrayList from firstIndex to lastIndex, inclusive.
    public void printAllInstances(int firstIndex, int lastIndex)
    {
        for(int i = firstIndex; i <= lastIndex; i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
    // A getter method to get the Person object from the ArrayList at a specified index.  This is needed for the tester and there will not be any side effects with this getter method.
    public Person getPerson(int i)
    {
        return list.get(i);
    }
    
    
    // YOUR WORK STARTS HERE!
    // Use a Linear Search to search for first index of the target height. If not found, return -1.
    public int findHeight(double target)
    {
        for(int x = 0;x<list.size();x++){
            if(Math.abs(list.get(x).getHeight()-target) < 1E-14){
                return x;
            }
        }
        return -1;
    }

    // Use a Binary Search recursive algorithm which returns the index of the target weight.  If not found, return -1.
    // Note: You will not be able to test this method until you write the sortByWeight method below since the precondition is a sorted list.
    public int findWeight(double target)
    {
        //  Hint: Write your helper method
        int high = list.size()-1;
        int low = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(list.get(mid).getWeight() > target){
                high = mid - 1;
            }else if(list.get(mid).getWeight() < target){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
        
    }

    //Use Insertion Sort to sort all Personv objects by their height (low to high). 
    public void sortByHeight()
    {
        for(int x = 1;x<list.size();x++){
            Person key = list.get(x);
            int j = x-1;
            while(j >= 0 && key.getHeight() < list.get(j).getHeight()){
                list.set(j+1,list.get(j));
                j--;
            }
            list.set(j+1,key);
        }
    }
    
    
    //Use Merge Sort to sort all Person objects by their weight (low to heigh). You will need the helper methods below.
    public void sortByWeight()
    {
        list = mergeSort(list);
    }

    private ArrayList<Person> mergeSort(ArrayList<Person> arr)
    {
        if(arr.size() == 1){
            return arr;
        }else{
            ArrayList<Person> left = new ArrayList<Person>();
            ArrayList<Person> right = new ArrayList<Person>();
            int mid = arr.size()/2;
            for(int x = 0;x<mid;x++){
                left.add(arr.get(x));
            }
            for(int x = mid;x<arr.size();x++){
                right.add(arr.get(x));
            }
            return merge(mergeSort(left),mergeSort(right));
        }
    }

    private ArrayList<Person> merge(ArrayList<Person> left, ArrayList<Person> right)
    {
        int i = 0;
        int j = 0;
        ArrayList<Person> comb = new ArrayList<Person>();
        while(i < left.size() && j < right.size()){
            if(left.get(i).getWeight() < right.get(j).getWeight()){
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
