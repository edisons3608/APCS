
/**
 * Write a description of class Jamie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jamie
{
    // instance variables - replace the example below with your own
    public static void countOccurances(int num){
        
        /*
        String strungNum = ""+num;
        
        int counter = 0;
        for(int x = 0;x<=9;x++){
=            counter = 0;
            for(int i=0;i<strungNum.length();i++){
                if((""+x).equals(strungNum.substring(i,i+1))){
                    counter++;
                }
            }
            System.out.println(x+": "+counter);
        }*/
        String strungNum = ""+num;
        int[] table = {0,0,0,0,0,0,0,0,0,0};
        for(int x = 0;x<strungNum.length();x++){
            table[Integer.parseInt(strungNum.substring(x,x+1))] += 1;
        }
        for(int x = 0;x<table.length;x++){
            System.out.println(x+": "+table[x]);
        }
    }
    
    public static void invest(){
        int goal = 4500;
        double profit = 900;
        double deficit = 500;
        double remain = 0;
        int months = 0;
        double savings = 0;
        while(savings < goal){
            
            if(months % 12 == 0 && months != 0){
                profit *= 1.035;
                deficit *= 1.03;
            }
            remain = profit-deficit;
            if(months != 0){
                savings += 0.4*remain;
            }
            
            if(months % 3 == 0 && months != 0){
                savings *= (1.015);
            }
            
           
            //System.out.println(savings);
            months++;
            
        }
        System.out.print(months);
    }
    
    
}
