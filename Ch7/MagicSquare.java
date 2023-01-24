
/**
 * Write a description of class MagicSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquare
{
    // instance variables - replace the example below with your own
    private int[][] arr;
    
    public MagicSquare(int[][] arrCopy){
        arr = new int[arrCopy.length][arrCopy[0].length];
        for(int x = 0;x<arrCopy.length;x++){
            for(int y = 0;y<arrCopy[0].length;y++){
                arr[x][y] = arrCopy[x][y];
            }
        }
        
        
    }
    public boolean isMagicSquare(){
        int sum = 0;
        for(int x = 0;x<arr.length;x++){
            sum += arr[0][x];
        }
        
        int currentSum = 0;
        for(int x = 1;x<arr.length;x++){
            currentSum = 0;
            for(int y = 0;y<arr[0].length;y++){
                currentSum += arr[x][y];
            }
            if(currentSum != sum){
                return false;
            }
        }
        
        for(int x = 0;x<arr.length;x++){
            currentSum = 0;
            for(int y = 0;y<arr[0].length;y++){
                currentSum += arr[y][x];
            }
            if(currentSum != sum){
                return false;
            }
        }
        currentSum = 0;
        for(int x = 0;x<arr.length;x++){
            currentSum += arr[x][x];
        }
        if(currentSum != sum){
            return false;
        }
        currentSum = 0;
        for(int x = 0;x<arr.length;x++){
            currentSum += arr[x][arr.length-1-x];
            
        }
        if(currentSum != sum){
            return false;
        }
        return true;
        
    }
    int getMagicNumber(){
        if(isMagicSquare() == true){
            int sum = 0;
            for(int x = 0;x<arr.length;x++){
                sum += arr[0][x];
            }
            return sum;
        }else{
            return -1;
        }
    }
    
}
