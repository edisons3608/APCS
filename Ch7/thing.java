
/**
 * Write a description of class thing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class thing
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        ArrayList<Integer> thing = new ArrayList<Integer>();
        thing.add(0);
        thing.add(1);
        thing.add(2);
        thing.add(3);
        thing.add(4);
        thing.add(5);
        for(int x = 0;x<thing.size();x++){
            if(x==0){
                thing.remove(0);
                thing.remove(1);
                thing.remove(2);
                
            }
            System.out.println(x);
        }
        
    }
}
