
/**
 * Write a description of class HarryPotter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingHat
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        System.out.println(SortingHat.sortingHat(20220063));
    }
    public static String sortingHat(int id){
        int graduationYear = Integer.parseInt((""+id).substring(0,4));
        int identifier = Integer.parseInt((""+id).substring(4));
        System.out.println(graduationYear);
        System.out.println(identifier);
        if(graduationYear == 2022){
            if(identifier % 7 == 0 && (""+identifier).contains("6")){
                return "Slitherin";
                
            }else if(identifier % 3 == 0 || identifier % 5 == 0){
                return "Griffindor";
            }else if(identifier % 2 == 0){
                return "Hufflepuff";
            }else{
                return "Ravenclaw";
            }
        }else{
            return "error";
        }
        
        
    }
}
