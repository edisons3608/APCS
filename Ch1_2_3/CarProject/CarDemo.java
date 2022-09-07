
/**
 * Write a description of class CarDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car(10,20);
        Car c3 = new Car(30);
        
        System.out.println("Expected = 10");
        System.out.println(c1.getGas());
        
        
        System.out.println("Expected = 20");
        System.out.println(c2.getEfficiency());
        
        System.out.println("Expected = 20");
        System.out.println(c3.getGas());
        

    }
}
