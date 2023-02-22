
/**
 * Write a description of class CodingPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CodingPractice
{
    // instance variables - replace the example below with your own
    public static int recSum(int n){
        if(n==1){
            return 1;
        }
        return recSum(n-1)+n;
    }
    
    public static int tailSum(int n){
        return tailHelp(n,1);
    }
    private static int tailHelp(int n, int num1){
        if(n==1){
            return num1;
        }
        return tailHelp(n-1,num1+n);
    }
    public static String reverse(String word){
        return reverseHelp(word,word.length()-1);
    }
    private static String reverseHelp(String str, int n){
        if(n==0){
            return str.substring(0,1);
        }
        return str.substring(n,n+1)+reverseHelp(str,n-1);
    }
    public static String duplicateEachCharacter(String s){
        return dupHelper(s,s.length()-1);
    }
    private static String dupHelper(String s, int n){
        if(s == null){
            return null;
        }
        if(s==""){
            return "";
        }
        if(n==0){
            return s.substring(0,1)+s.substring(0,1);
        }
        return dupHelper(s, n-1)+s.substring(n,n+1)+s.substring(n,n+1);
    }
    public static double recurPow(int base, int exp){
        return recurHelp(base,exp,exp);
    }
    private static double recurHelp(int base, int exp,int n){
        if(n==1){
            return base;
        }
        return recurHelp(base,exp,n-1)*base;
    }
    
    public static boolean array220(int[] arr, int n){
        return arrayHelp(arr,n,false);
        
        
    }
    private static boolean arrayHelp(int[] arr, int n, boolean state){
        if(n==0){
            return arr[1] % arr[0] == 0;
        }
        if(arr[n+1] % arr[n] == 0){
            return true;
        }
        if(arrayHelp(arr,n-1,false) == true){
            return true;
        }
        return false;
    }
    
    public static int sumDigits(int num){
        return sumHelper(num,Integer.toString(num).length()-1);
    }
    private static int sumHelper(int num, int n){
        String str = Integer.toString(num);
        if(n==0){
            return Integer.parseInt(str.substring(0,1));
        }
        return sumHelper(num,n-1) + Integer.parseInt(str.substring(n,n+1));
    }
}
