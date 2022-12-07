import java.util.HashMap;

 /**
 * CombinationDemo – a collection of Locker combinations
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CombinationDemo
{
    public static void main(String[] args)
    {
        
        
        Combination[] lockers = new Combination[20];
        
        
        for(int x = 0;x<20;x++){
            lockers[x] = new Combination();
        }
        
        
        for(Combination combo : lockers){
            System.out.println(combo.toString());
        }
        
        System.out.println();
        System.out.println("swapped first/last");
        int temp1,temp2,temp3;
        
        temp1 = lockers[0].get(0);
        temp2 = lockers[0].get(1);
        temp3 = lockers[0].get(2);
        
        lockers[0].setCombination(lockers[19].get(0),lockers[19].get(1),lockers[19].get(2));
        
        lockers[19].setCombination(temp1,temp2,temp3);
        
        for(Combination combo : lockers){
            System.out.println(combo.toString());
        }
        System.out.println();
        for(Combination comb : lockers){
            if(comb.get(0) <= comb.get(1) && comb.get(1) <= comb.get(2)){
                System.out.println("ascending: "+comb.get(0)+" - "+comb.get(1)+" - "+comb.get(2));
            }
        }
        System.out.println();
        
        for(Combination comb : lockers){
            if(comb.get(0) <= comb.get(1) && comb.get(1) <= comb.get(2) || comb.get(0) >= comb.get(1) && comb.get(1) >= comb.get(2)){
                System.out.println("Sequential: "+comb.get(0)+" - "+comb.get(1)+" - "+comb.get(2));
            }
        }
        
        
        System.out.println();
        int countSingle = 0;
        for(Combination comb : lockers){
            if(comb.get(0) < 10 || comb.get(1) < 10 || comb.get(2) < 10){
                countSingle++;
            }
        }
        
        System.out.println("single digit total:"+countSingle);
        System.out.println();
        
        HashMap<Integer, Integer> frequent = new HashMap<>();
        
        for(Combination comb : lockers){
            for(int x = 0;x<3;x++){
                if(frequent.containsKey(comb.get(x))){
                    frequent.put(comb.get(x),frequent.get(comb.get(x))+1);
                }else{
                    frequent.put(comb.get(x),1);
                }
            }
        }
        
        int max = 0;
        int count = 0;
        for (int key : frequent.keySet()) {
            if(count == 0){
                max = key;
            }else{
                if(frequent.get(key) > frequent.get(max)){
                    max = key;
                }else if(frequent.get(key) == frequent.get(max) && key < max){
                    max = key;
                }
            }
            count++;
        }
        
        
        //System.out.println(frequent);
        
        System.out.println("Most frequent number: "+max);
        //System.out.println(frequent.get(max));
        System.out.println();
        
    
        for(int x = 0;x<20;x++){
            if(lockers[x].get(0) > 30 || lockers[x].get(1) > 30 || lockers[x].get(2) > 30){
                lockers[x] = null;
            }
        }
        
        System.out.println("Combinations without numbers greater than 30:");
        for(Combination comb : lockers){
            if(comb != null){
                System.out.println(comb.toString());
            }
        }
        /**
         * In this main method:
         * 
         * 1. Create an array to hold 20 lockers combinations.
         *    Then populate the array with combinations.
         *
         * 2. Use an enhanced for-loop to print the 20 locker 
         *    combinations. Print each combination on its own 
         *    line.  Then print a blank line.
         *
         * 3. Swap the first and last combinations from the list 
         *    of 20 combinations.               
         *    Print "swapped first/last" on its own line. 
         *    Then re-print the list of 20 combinations as before.
         *    Then print a blank line.
         *    
         * 4. Count how many of them are in ascending order.
         *    Print the result as “ascending: ” with a value.
         *    Then print a blank line. (Consider 3 - 3 - 7 ascending)
         *    
         * 5. Count how many of them are combinations in sequential
         *    order, forward or backward.  Print the result as 
         *    “sequential: ” with a value.  Then print a blank line.
         *    (Ex. 3 - 11 - 38 and 3 - 3 - 11 and 38 - 11 - 3 are sequential)
         *
         * 6. Skip a line, then print “contains single digit”.  
         *    Using an enhanced for-loop, count and print all of 
         *    the combinations which contain at least one single digit
         *    as part of the combination.  Then print out the total 
         *    number of combinations which contain a single digit 
         *    as “single digit total: ” followed by a value.
         *    Then print blank line.
         *
         * Challenge: find which number appears most  
         *            frequently in all 20 combinations. If it's a tie
         *            keep the lowest number as the most frequent.
         *            Print "most frequent number:" followed by a value.
         *            Then print a blank line.
         *            
         * Challenge (Might be required later):  
         *    Remove combination objects that have a value greater than 30.
         *    This activity will mutate the collection and turn it 
         *    into a partially-filled array (you will need a variable
         *    "currentSize"). When you are done, print 
         *    "Combinations without numbers greater than 30:" and then 
         *    a list of the combinations that remain.        
         */

    }
}

