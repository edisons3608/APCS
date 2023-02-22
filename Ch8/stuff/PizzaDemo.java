
/**
 * Write a description of class PizzaDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
public class PizzaDemo
{
    public static void main(String[] args)
    {
        Pizza [] pizzaList = new Pizza [8];
        pizzaList[0] = new Pizza();
        pizzaList[1] = new DeliveryPizza();
        pizzaList[2] = new Pizza("large");
        pizzaList[3] = new DeliveryPizza("small", "Glencoe");
        pizzaList[4] = new DeliveryPizza("large", "Glenview");
        pizzaList[5] = new DeliveryPizza("medium", "Wilmette");
        pizzaList[6] = new Pizza("small");
        pizzaList[7] = new DeliveryPizza("small", "Evanston");
        
        // Go through the array, pizzaList, and if the Pizza is a DeliveryPizza, print the destination.
        
        for(int x = 0;x<pizzaList.length;x++){
            if(pizzaList[x] instanceof DeliveryPizza){
                /*
                DeliveryPizza dp = (DeliveryPizza)pizzaList[x];
                System.out.println(dp.getDestination());
                */
               
               System.out.println(((DeliveryPizza)pizzaList[x]).getDestination());
            }
        }
    }
}
