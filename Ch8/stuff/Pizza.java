
/**
 * Write a description of class Pizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
import java.util.ArrayList;
public class Pizza
{
    private String size;
    private ArrayList<String> toppings;
    public Pizza(){
       size = "medium";
       toppings = new ArrayList<String>();
       
    }
    public Pizza(String size){
        this.size = size;
        toppings = new ArrayList<String>();
    }
    public String getSize(){
        return size;
    }
    public String getTopping(int index){
        return toppings.get(index);
    }
    public void addTopping(String topping){
        toppings.add(topping);
    }
    public int numberOfToppings(){
        return toppings.size();
    }
    public String toString(){
    
        
        String returnStr = "";
        for(String topping:toppings){
            returnStr += topping +", ";
        }
        if(returnStr.length() > 0){
            returnStr = returnStr.substring(0,returnStr.length()-2);
        }
        return "Size: "+size+"\nToppings: "+returnStr;
    }
    public boolean equals(Object other){
        if(!(other instanceof Pizza)){
            return false;
        }
        Pizza p2 = (Pizza)other;
        if(!(p2.getSize().equals(size))){
            return false;
        }
        
        
        if(p2.numberOfToppings() != this.numberOfToppings()){
            return false;
        }

        for(int x = 0;x<numberOfToppings();x++){
            if(!(p2.getTopping(x).equals(this.getTopping(x)))){
                return false;
            }
            
        }
        
        
        return true;
    }
    
}
