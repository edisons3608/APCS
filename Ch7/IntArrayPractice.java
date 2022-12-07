
/**
 * Write a description of class few here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntArrayPractice
{
    public static void main (String[] args)
    {
        // Given the partially filled array of scores for some game and its companion variable len:
        int [] scores = {2, 4, 6, 0, 9, 8, 3, 4, 0, 0};
        int len = 8; 

        // #1:  Compute and print the avg of all VALID scores
        // Can you use a for-each loop to compute this?  
        // Should print 4.5        
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum += scores[i];
        }

        System.out.println((double)sum/(len));
        
        
        

        // #2:  Insert a score of 5 at the beginning of the array.  
        // Shift all other values to the right, getting rid of a zero at the end.
        // Adjust the companion varialble, len.
        // Can you use an Enhanced For Loop?  
        
        for(int i = scores.length-2;i>=0;i--){
            scores[i+1] = scores[i];
        }
        scores[0] = 5;
                
        // Then print your array to verify using a For-Each Loop, and print the value of the companion variable.

        for(int score : scores){
            System.out.println(score);
        }
        
        
        
        
        System.out.println();
        // #3:  Remove the fourth element of the array, shift all elements to the left, putting a 0 at the end.
        
        for(int i = 4;i<scores.length;i++){
            scores[i-1] = scores[i];
        }
        scores[scores.length-1] = 0;
        // Then print your array to verify using a For-Each Loop, and print the value of the companion variable.
        
        for(int score : scores){
            System.out.println(score);
        }
        
        

        // #4:  Remove ALL scores less than 5.  Shift elements to the left.  
        // Fill in 0's for any elements that are empty in the array.
        // Adjust the companion variable with each removal.
    
        for(int x = 0;x<len;x++){
            if(scores[x]  < 5){
                scores[x] = 0;
            }
        }
        boolean flag = true;
        boolean flip = false;
        while(flag){
            for(int x = 0;x<len;x++){
                if(scores[x] == 0){
                    flip = true;
                    for(int i = x+1;i<len;i++){
                        scores[i-1] = scores[i];
                    }
                    scores[len-1] = 0;
                    len--;
                }
                break;
            }
            if(flip == false){
                flag = false;
            }
            
        }
        
        // Then print your array to verify using a For-Each Loop, and print the value of the companion variable.
        System.out.println();
        for(int score : scores){
            System.out.println(score);
        }
        
        
    }
}