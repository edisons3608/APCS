/**
 * Write a description of class SortStrings here.
 * Homework
 * @v2
 */


public class SortStrings
{
    public static String stringSorter(String s1, String s2, String s3)
    {
        // Write code here to complete this method.
        // This method takes in three Strings in the parameter and should return them in lexicographical order
        // Use the return statement provided and the Unit Tester on Canvas
        String first = "";
        String second = "";
        String third = "";
        /*
        String[] listOfStrings = {s1,s2,s3};
        String holder;
        for(int x = 0;x<listOfStrings.length;x++){
            for(int y = 0;y<listOfStrings.length-1;y++){
                if(listOfStrings[y].compareTo(listOfStrings[y+1]) > 0){
                    holder = listOfStrings[y+1];
                    listOfStrings[y+1] = listOfStrings[y];
                    listOfStrings[y] = holder;
                    
                }
            
            }
        }
        
        
        first = listOfStrings[0];
        second = listOfStrings[1];
        third = listOfStrings[2];
        */
       //123
       //132
    
       //213
       //231
       
       //321
       //312
       
        if(s1.compareTo(s2) < 0 && s2.compareTo(s3) < 0 ){
            first = s1;
            second = s2;
            third = s3;
            
            
        }else if(s1.compareTo(s3) < 0 && s3.compareTo(s2) < 0 ){
            first = s1;
            second = s3;
            third = s2;
            
            
        }
        else if(s2.compareTo(s1) < 0 && s1.compareTo(s3) < 0 ){
            first = s2;
            second = s1;
            third = s3;
            
            
        }
        else if(s2.compareTo(s3) < 0 && s3.compareTo(s1) < 0 ){
            first = s2;
            second = s3;
            third = s1;
            
            
        }
        else if(s3.compareTo(s2) < 0 && s2.compareTo(s1) < 0 ){
            first = s3;
            second = s2;
            third = s1;
            
            
        }
        else if(s3.compareTo(s1) < 0 && s1.compareTo(s2) < 0 ){
            first = s3;
            second = s1;
            third = s2;
            
            
        }
        
        return first + ", " + second + ", " + third;
    }
}
