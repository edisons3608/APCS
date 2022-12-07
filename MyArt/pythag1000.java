
/**
 * Write a description of class pythag1000 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pythag1000
{
    // instance variables - replace the example below with your own
    final static double EPSILON = 1E-14;
    public static int countPythagLessThan1000(){
        int count = 0;
        for(int x = 1;x<1000;x++){
            for(int i = 1;i<x;i++){
                if(Math.abs(Math.floor(Math.sqrt(x*x+i*i)) - Math.sqrt(x*x+i*i)) < EPSILON && Math.sqrt(x*x+i*i) < 1000){
                    count++;
                    System.out.print(x+" ");
                    System.out.print(i+" ");
                    System.out.print(Math.sqrt(x*x+i*i)+"\n");
                }
            }
        }
        return count;
    }
    
    public static String convertLicense(String license){
        int sumAscii = 0;
        String letters = "";
        for(int x = 0;x<license.length();x++){
            
            //System.out.println(license.charAt(x));
            
            if(Character.isLetter(license.charAt(x))){
                letters += ""+license.charAt(x);
                sumAscii += (int)(license.charAt(x));
            }else{
                sumAscii += Integer.parseInt(license.substring(x,x+1));
            }

        }
        String stringSum = ""+sumAscii;
        int digitSum = 0;
        
        for(int x = 0;x<stringSum.length();x++){
            digitSum += Integer.parseInt(stringSum.substring(x,x+1));

        }
        String alphaDigit = ""+(char)(digitSum+65);
        
        return alphaDigit+stringSum+letters.toLowerCase();
        
    }
    public static String reverseString(String word){
        String returnWord = "";
        for(int x = word.length()-1;x>=0;x--){
            returnWord += word.substring(x,x+1);
        }
        return returnWord;
    }
    public static void drawWings(int n ){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<2*n+2;col++){
                if((col >= row &&  col <= n-1) || (col >= n+2 && col <= 2*n+1 - row)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        
        }
    }
    public static void jamie(){
        double values = 0.5; int x = 0; while(values != 0) {     x++;     System.out.println(x);    values = values - 0.1; System.out.println(values);}

    }
}
