
/**
 * Write a description of class CircleDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleDemo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CircleDemo
     */
    public static void main(String[] args){
        Circle c1 = new Circle(20);
        System.out.println(c1.getRadius());
        c1.setRadius(50);
        System.out.println(c1.computeCircumference());
        System.out.println(c1.computeArea());
    }
}
