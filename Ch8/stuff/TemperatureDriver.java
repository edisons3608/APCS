
/**
 * Write a description of class TemperatureDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureDriver
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) 
{ 
        Temperature t1 = new Temperature(9.0 , 'C'); 
        System.out.println(t1.toString()); 
        System.out.println("stored: " + t1.getTemp() + ", " +t1.getUnit());         
  
        //Change mode to 'C' 
        Temperature.setMode('C'); 
        System.out.println(t1.toString());      
        System.out.println("stored: " + t1.getTemp() + ", " +t1.getUnit());   
         
        Temperature t2 = new Temperature(36.9 , 'F'); 
        System.out.println(t2.toString()); 
        System.out.println("stored: " + t2.getTemp() + ", " +t2.getUnit());         
  
        //Change mode back to 'F' 
        Temperature.setMode('F'); 
        System.out.println(t2.toString());      
        System.out.println("stored: " + t2.getTemp() + ", " +t2.getUnit());           
} 
}
