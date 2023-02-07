
/**
 * Write a description of class DeliveryPizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPizza extends Pizza
{
    private String destination;
    
    public DeliveryPizza(){
        super();
        destination = "Winnetka";
    }
    public DeliveryPizza(String size,String destination){
        super(size);
        this.destination = destination;
    }
    public String getDestination(){
        return destination;
    }
    public String toString(){
        return super.toString()+"\nDestination: "+destination;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof DeliveryPizza)){
            return false;
        }
        DeliveryPizza dp = (DeliveryPizza)obj;
        return super.equals(dp) && this.destination.equals(dp.getDestination());
    }
}
