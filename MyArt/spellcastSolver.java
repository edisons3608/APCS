import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * Write a description of class spellcastSolver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class spellcastSolver
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        Scanner keys = new Scanner(System.in);
        String in;
        Map<String, Integer> values = new HashMap<String, Integer>();
        values.put("a",1);
        values.put("b",1);
        values.put("c",5);
        values.put("d",3);
        values.put("e",1);
        values.put("f",1);
        values.put("g",3);
        values.put("h",4);
        values.put("i",1);
        values.put("j",1);
        values.put("k",1);
        values.put("l",3);
        values.put("m",1);
        values.put("n",2);
        values.put("o",1);
        values.put("p",1);
        values.put("q",1);
        values.put("r",2);
        values.put("s",2);
        values.put("t",2);
        values.put("u",1);
        values.put("v",5);
        values.put("w",5);
        values.put("x",1);
        values.put("y",1);
        values.put("z",1);
        
        
        for(int i = 0;i<5;i++){
            System.out.println("Next line");
            in = keys.nextLine();
            board.add(new ArrayList<String>());
            for(int x = 0;x<5;x++){
                board.get(i).add(x,in.substring(x,x+1));
                
            }
        }
        int[] TL = {0,0,0};
        int[] doubleWord = {0,0};
        
        System.out.println("TL");
        String TLIn = keys.nextLine();
        for(int x = 0;x<3;x++){
            TL[x] = Integer.parseInt(TLIn.substring(x,x+1));
        }
        
        System.out.println("double word");
        String doubleIn = keys.nextLine();
        for(int x = 0;x<3;x++){
            doubleWord[x] = Integer.parseInt(doubleIn.substring(x,x+1));
        }
        
        
        
        
        
        
        
        // for(int i = 0;i<5;i++){
            
            // for(int x = 0;x<5;x++){
                // System.out.print(board.get(i).get(x));
                
            // }
            // System.out.println();
        // }
        
        
        
        
        
    }
}
