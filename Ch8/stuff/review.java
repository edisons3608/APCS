
/**
 * Write a description of class review here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class review
{
    // instance variables - replace the example below with your own
    public static double findMin(double[] elements){
        return minHelper(elements,elements.length-1,elements[elements.length-1]);
    }
    private static double minHelper(double[] elements, int n,double tail){
        if(n==0){
            if(elements[n] < tail){
                return elements[n];
            }
            return tail;
        }
        if(elements[n] < tail){
            return minHelper(elements,n-1,elements[n]);
        }
        return minHelper(elements,n-1,tail);
        
        
    }
    public static double newton(double num){
        return newtonHelper(num,10);
    }
    private static double newtonHelper(double num, int n){
        if(n==1){
            return 1;
        }
        return (newtonHelper(num,n-1)+num/newtonHelper(num,n-1))/2;
    }
    public static int[] foo(int[] vals){
        if(vals[0] < 1){
            return vals;
        }else{
            int[] returnVals = new int[vals.length-1];
            for(int k = 0; k < returnVals.length;k++){
                returnVals[k] = vals[k] - vals[k+1];
            }
            return foo(returnVals);
        }
    }
    public static String pairStar(String word){
        return pairHelper(word,word.length()-1);
    }
    private static String pairHelper(String str, int n){
        if(n==str.length()-1){
            return pairHelper(str,n-1)+str.substring(n,n+1);
        }
        if(n==0){
            if(str.charAt(0) == str.charAt(1)){
                return str.substring(0,1)+"*";
            }
            return str.substring(0,1);
        }
        if(str.charAt(n) == str.charAt(n+1)){
            return pairHelper(str,n-1)+str.substring(n,n+1)+"*";
        }
        return pairHelper(str,n-1)+str.substring(n,n+1);
        
    }
    public static String formatNumber(int n){
        if(n < 0){
            
        }
        String stringNum = Integer.toString(n);
        if(n < 0){
            stringNum = stringNum.substring(1);
        }
        if(stringNum.length() < 4){
            return stringNum;
        }
        if(n<0){
            return "-"+formatNumberHelper(stringNum,stringNum.length()-3);

        }
        return formatNumberHelper(stringNum,stringNum.length()-3);
    }
    private static String formatNumberHelper(String nStr,int n){
        if(n < 0){
            return nStr.substring(0,n+3);
        }
        return formatNumberHelper(nStr,n - 3) + ","+nStr.substring(n,n+3);
        
    }
    public static int[] foo2(int[] vals){
        if(vals[0] < 1){
            return vals;
        }else{
            int[] returnVals = new int[vals.length-1];
            for(int k = 0;k<returnVals.length;k++){
                returnVals[k] = vals[k] - vals[k+1];
            }
            return foo(returnVals);
        }
    }
}
