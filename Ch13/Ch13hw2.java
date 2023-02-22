
/**
 * Write a description of class ch13hw2 here.
 *
 * @author Edison Sun
 * @version v1
 */
public class Ch13hw2
{
    // instance variables - replace the example below with your own
    public static void printNum(int n){
        if(n == 1){
            System.out.println(1);
        }
        else{
            printNum(n-1);
            System.out.println(n);
        }   
    }
    
    public static String duplicateVowels(String str){
        return vowelHelper(str,str.length()-1);
        
    }
    public static String vowelHelper(String str,int n ){
        if(n==0){
            if(isVowel(str.substring(0,1))){
                return str.substring(0,1)+str.substring(0,1);
            }
            return str.substring(0,1);
        }
        if(isVowel(str.substring(n,n+1))){
            return vowelHelper(str,n-1) + str.substring(n,n+1)+str.substring(n,n+1);
        }
        return vowelHelper(str,n-1) + str.substring(n,n+1);
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
    public static int countChars(String checkChar,String phrase){
        return charHelper(checkChar,phrase,phrase.length()-1);
    }
    public static int charHelper(String checkChar,String phrase,int n){
        if(n==0){
            if(phrase.substring(0,1).equals(checkChar)){
                return 1;
            }
            return 0;
        }
        if(phrase.substring(n,n+1).equals(checkChar)){
            return charHelper(checkChar,phrase,n-1)+1;
        }
        return charHelper(checkChar,phrase,n-1);
            
    }
    public static boolean palindrome(String str){
        return helperPalin(str,str.length()/2-1);
    }
    public static boolean helperPalin(String str,int n){
        if(n==0){
            if(str.substring(0,1).equals(str.substring(str.length()-1,str.length()))){
                return true;
            }
            return false;
        }
        if(str.substring(n,n+1).equals(str.substring(str.length()-1-n,str.length()-n))){
            if(helperPalin(str,n-1) == false){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
    public static int locateIndex(String str,String check){
        return helpIndex(str,check,0);
    }
    public static int helpIndex(String str, String check,int n){
        if(n==str.length()-check.length()){
            if(str.substring(str.length()-check.length()).equals(check)){
                return n;
            }
            return -1;
        }
        if(str.substring(n,n+check.length()).equals(check)){
            return n;
        }else{
            return helpIndex(str,check,n+1);
        }
    }
}
