
/**
 * Write a description of class recurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recurse
{
    // instance variables - replace the example below with your own

    public static int sumArray(int[] arr){
        return helper(arr,arr.length-1);
    }
    public static int helper(int[] arr, int n){
        if(n==0){
            return arr[0];
        }
        return helper(arr,n-1)+arr[n];
        
    }
    public static boolean isVowel(String str){
        if(str.length() != 1){
            return false;
        }

        String[] vowels = {"a","e","i","o","u"};
        for(String vowel : vowels){
            if(str.toLowerCase().equals(vowel)){
                return true;
            }
        }
        return false;
    }
    public static String removeVowels(String str,int n){
        if(n==0){
            if(isVowel(str.substring(n,n+1))){
                return "";
            }
            return str.substring(n,n+1);
        }
        if(isVowel(str.substring(n,n+1))){
            return removeVowels(str,n-1);
        }
        return removeVowels(str,n-1)+str.substring(n,n+1);
    }
    public static int countOccurances(String str, String target){
        return helper2(str,target,str.length()-1);
    }
    public static int helper2(String str,String target, int n){
        if(n==0){
            if(str.substring(0,1).equals(target)){
                return 1;
            }
            return 0;
        }
        if(str.substring(n,n+1).equals(target)){
            return helper2(str,target,n-1) + 1;
        }
        return helper2(str,target,n-1);
    }
    public static void drawTriangle(int height){
        System.out.println(drawHelper(height,height));
    }
    /*
    public static String drawHelper(int n){
        if(n==1){
            return "*";
        }
        String returnStr = "";
        for(int x = 0;x<n;x++){
            returnStr += "*";
        }
        return returnStr +"\n"+drawHelper(n-1);
    }
    */
   
    public static String drawHelper(int n,int c){
        if(n==1){
            return "*";
        }
        if(c == 1){
            return "*"+drawHelper(n-1,n-1)+"\n";
        }
        
        return drawHelper(n,c-1)+"*";
    }
}
