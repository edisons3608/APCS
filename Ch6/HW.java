
/**
 * Write a description of class HW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
public class HW
{
    // instance variables - replace the example below with your own
    public static String repeatEnd(String word,int n){
        String repeated = word.substring(word.length()-n);
        String finalWord = "";
        int counter = 0;
        while(counter < n){
            finalWord += repeated;
            counter += 1;
        }
        return finalWord;
    }
    public static String repeatSeparator(String word,String sep,int count){
        int countWord = 0;
        String finalWord = "";
        while(countWord < count-1){
            finalWord += word + sep;
            countWord += 1;
        }
        if(count != 0){
            finalWord += word;
        }
        
        return finalWord;
    }
}
