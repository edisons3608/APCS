
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private int radius;
    
    public Circle(){
        radius = 10;
    }
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public double computeArea(){
        return 3.14*radius*radius;
    }
    public double computeCircumference(){
        return 2*3.14*radius;
    }
    
}
