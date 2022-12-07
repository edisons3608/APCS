
/**
 * Write a description of class HW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW
{
    // instance variables - replace the example below with your own
    public static int countMultipleOfThreeContainingTwo(int max){
        if(max < 3){
            return 0;
        }
        int returnNum = 0;
        int index = 3;
        boolean foundTwo;

        
        String strIndex;
        while(index < max){
    
        
            foundTwo = false;

            strIndex = ""+index;
            
            for(int i = 0;i<strIndex.length();i++){
                if(strIndex.substring(i,i+1).equals("2")){
                    foundTwo = true;
                }
            }
    
            if(foundTwo){
        
                if(index % 3 == 0){
                    returnNum += 1;
                }
                
            }
            

            index++;
        }
        return returnNum;
    }
}
