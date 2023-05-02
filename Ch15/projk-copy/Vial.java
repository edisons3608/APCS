/**
 * Vial - a container used in an apothecary.  
 *        A vial can either be empty or contain one or more potions.
 *        A vial can hold no more than 100 grams of potion.
 * 
 * @author APCS teachers and ADD YOUR NAME HERE
 * @version January 8, 2021
 */
import java.util.ArrayList;
public class Vial
{
    /** Create an instance variable here to hold an unknown number of potions    
     */
        /** YOU CODE THIS – choose and name the instance variable wisely **/
    private ArrayList<Potion> potions;
    /**
     * Constructor for objects of class Vials
     */
    public Vial()
    {
        potions = new ArrayList<Potion>();
    }
    
    /**
     * Note: expect a second constructor to be added to this project later
     */
       


    /**
     * Get the quantity of a particular potion in the vial
     */    
    public double getQuantity(String potionName)
    {
        for(Potion p:potions){
            if(p.getDescription().equals(potionName)){
                return p.getQuantity();
            }
        }
        return 0;
    }    

    /**
     * Get the total quantity (weight in grams) of the entire vial
     */    
    public double getQuantity()
    {
        double sum = 0;
        for(Potion p:potions){
            sum += p.getQuantity();
        }
        return sum;
    }

    /**
     * Get the contents of the vial in roster form, each potion on a new line  
     *    format it like:
     *    98.9 grams of phosphor
     *    1.0 grams of sulfur
     *    Notice that the Potion class has a toString() method. Call it.
     */         
    public String toString()
    {
        /** YOU CODE THIS **/
        String returnStr = "";
        for(Potion p : potions){
            returnStr += p.getQuantity()+" grams of "+p.getDescription()+"\n";
        }
        if(!returnStr.equals("")){
            return returnStr.substring(0,returnStr.length()-1);
        }
        return returnStr;
    }

    /**
     * Add a potion to the vial
     *  - If adding the potion would cause the vial to contain more than 100       
     *    grams of substance, add none of it and return false.  
     *    Otherwise, add the substance and return true.
     *    
     *  - If the potion is already in the vial, do not add a new instance of 
     *    the potion to the vial.  Instead, update the quantity of the
     *    existing potion. No potion should be in the vial more than once. 
     */
    public boolean addPotion(Potion potion)
    {
        /** 
         *  YOU CODE THIS 
         *  Put comments in before you write code!!!
         **/
        if(getQuantity()+potion.getQuantity() > 100){
            return false;
        }
        for(int x = 0;x<potions.size();x++){
            if(potions.get(x).getDescription().equals(potion.getDescription())){
                potions.get(x).add(potion.getQuantity());
                return true;
            }
        }
        potions.add(potion);
        return true;
    }
    /**
     * Two vials are equal if and only if they have the same contents
     *    (override the inherited equals method)
     */
    public boolean equals(Object o)   /**<-- fix this **/
    {
       /** We will discuss overriding the equals method later **/    
           /** YOU CODE THIS next week**/
        if(!(o instanceof Vial)){
            return false;
        }
        Vial otherVial = (Vial)o;
        for(int x = 0;x<potions.size();x++){

            if(Math.abs(potions.get(x).getQuantity() - otherVial.getQuantity(potions.get(x).getDescription())) > 1E-6){
                return false;
            }
        }
        return true;

    }

}