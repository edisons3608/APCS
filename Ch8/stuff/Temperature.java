
/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
public class Temperature
{
    private double temp;
    private char unit;
    private static char mode;
    
    public Temperature(double temp, char unit){
        this.temp = temp;
        this.unit = unit;
        if(mode == '\u0000'){
            
            mode = 'F';
        }
    }
    public static void setMode(char newMode){
        mode = newMode;
    }
    public double getTemp(){
        return temp;
    }
    public char getUnit(){
        return unit;
    }
    public String toString(){
        //System.out.println("mode: " +mode);
        //System.out.println("unit: "+unit);
        if(unit == mode){
            return temp + " degrees "+mode;
        }
        if(unit == 'F' && mode == 'C'){
            return (temp-32)*5/9.0 + " degrees "+mode;
        }else if(unit == 'C' && mode == 'F'){
            return  9*temp/5.0+32+ " degrees "+mode;
        }else{
            return "error";
        }
    }
}
