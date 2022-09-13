
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
public class Car
{
    // instance variables - replace the example below with your own
    private double gas;
    private double efficiency;
    public Car(){
        gas = 20;
        efficiency = 25;
    }
    public Car(double gas, double efficiency){
        this.gas = gas;
        this.efficiency = efficiency;
    }
    public Car(double efficiency){
        this.gas = 20;
        this.efficiency = efficiency;
    }
    public double getGas(){
        return gas;
    }
    public double getEfficiency(){
        return efficiency;
    }
    public void addGas(double gasIncrease){
        gas += gasIncrease;
    }
    public void drive(double amountDriven){
        gas -= amountDriven/efficiency;
    }
    
    
}
