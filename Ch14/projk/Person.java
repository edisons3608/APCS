
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private double height;
    private double weight;
    
    public Person(double h, double w)
    {
        height = h;
        weight = w;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public String toString()
    {
        return "Height: " + height + "\tWeight: " + weight;
    }
}
