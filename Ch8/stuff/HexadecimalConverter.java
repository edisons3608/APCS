
/**
 * Write a description of class HexadecimalConverter here.
 *
 * @author Edison Sun
 * @v1
 */
public class HexadecimalConverter
{
    // instance variables - replace the example below with your own
    public static String convertToBase16(int num){
        String[] letters = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        if(num % 16 == num){
            return letters[num];
        }
        return convertToBase16(num / 16) + letters[num % 16];
    }
    public static int convertToBase10(String num){
        
        if(num.length() == 1){
            return findIndex(num.substring(0,1));
        }
        return findIndex(num.substring(0,1))*(int)Math.pow(16,num.length()-1)+convertToBase10(num.substring(1));
    }
    private static int findIndex(String target){
        String[] ls = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        for(int x = 0;x<ls.length;x++){
            if(target.equals(ls[x])){
                return x;
            }
            
        }
        return -1;
    }
}
