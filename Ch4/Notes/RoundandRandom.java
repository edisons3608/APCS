
/**
 * Write a description of class RoundandRandom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoundandRandom
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        double b = 34.567;
        double c = Math.round(b*10)/10.0;
        //345.67
        //346
        //34.6
        System.out.println(c);
        
        //random int 1-5...[1,5]
        //(0,1) -> (0,5) -> [0,4] -> [1,5]
        for(int x = 0;x<10;x++){
            int randomInt = (int)(Math.random()*5)+1;
            System.out.println(randomInt);
        }
        
        
    }
}
