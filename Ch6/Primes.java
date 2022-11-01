import java.util.ArrayList;
import java.util.Comparator;
/**
 * Write a description of class Primes here.
 *
 * @author Edison Sun
 * @version 10/25/22
 */
public class Primes
{
    // instance variables - replace the example below with your own
    public static boolean isPrime(int value){
        if(value < 2){
            return false;
        }
        
    
        for(int index = 2;index < (int)Math.sqrt(value)+1;index++){
            if(value % index == 0){
                return false;
            }
        }
        return true;
        
    }
    public static int countPrimes(int max){
        
        if(max < 2){
            return 0;
        }
        else{
            int countPrimes = 0;
            for(int x = 0;x<=max;x++){
                if(isPrime(x) == true){
                    countPrimes += 1;
                }
            }
            return countPrimes;
        }
        
    }
    public static int sumPrimes(int n){
        int primeCounter = 0;
        int sum = 0;
        int index = 0;
        while(primeCounter < n){
            if(isPrime(index) == true){
                primeCounter += 1;
                sum += index;
            }
            index++;
        }
        return sum;
        
    }
    public static double averagePrimes(int n){
        return sumPrimes(n)/(double)n;
    }
    public static String primeString(int n){
        int index = 0;
        int primeCounter = 0;
        if(n < 1){
            return "";
        }
        String primeStr = "";
        while(primeCounter < n){
            if(isPrime(index) == true){
                //System.out.println(index);
                
                primeStr += index;
                if(primeCounter != n-1){
                    primeStr += "\n";
                }
                primeCounter += 1;
                
            }
            index++;
        }
        //primeStr = primeStr.substring(0,primeStr.length()-2);
        return primeStr;
    }
    public static void printPrimes(int n){
        System.out.println(primeString(n));
    }
    public static int maxDifference(int n){
        if(n < 2){
            return 0;
        }
        int previous = 2;
        int index = 3;
        int primeCounter = 1;
        int maxDiff = 1;
        while(primeCounter < n){
            
            if(isPrime(index) == true){
                
                primeCounter += 1;
                if(index-previous > maxDiff){
                    maxDiff = index-previous;
                    //System.out.println(maxDiff);
                }
                previous = index;
            }
            index++;
        }
        return maxDiff;
    }
    public static String factor(int n){
        if(n < 2){
            return "";
        }
        ArrayList<Integer> factorList = new ArrayList<Integer>();

        int current = n;
        while(!isPrime(current)){
            for(int x = 2;x<current;x++){
                if(current % x == 0){
                    factorList.add(x);
                    current = current/x;
                }
            }
        }
        factorList.add(current);
        factorList.sort(Comparator.naturalOrder());
        String factorStr = "";
        for(int x = 0;x<factorList.size();x++){
            factorStr += factorList.get(x)+"*";
        }
        factorStr = factorStr.substring(0,factorStr.length()-1);
        return factorStr;
    }
    
    public static int countTwinPrimes(int n){
        if(n < 3){
            return 0;
        }
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for(int x = 1;x<=n;x++){
            if(isPrime(x)){
                primeList.add(x);
            }
        }
        /*
        for(int x = 0;x<primeList.size();x++){
            System.out.println(primeList.get(x));
        }
        */
        int previous;
        int current;
        int numTwinP = 0;
        for(int x = 1;x<primeList.size();x++){
            previous = primeList.get(x-1);
            current = primeList.get(x);
            if(current-previous == 2){
                numTwinP += 1;
            }
            
        }
        return numTwinP;
    }
    
    
}
