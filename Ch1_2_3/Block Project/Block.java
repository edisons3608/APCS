
/**
 * Write a description of class Block here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Block
{
    // instance variables - replace the example below with your own
    private int length;
    private int width;
    private int height;
    private String color;
    private double mass;
    public Block(){
        length = 10;
        width = 10;
        height = 10;
        color = "black";
        mass = 1.0;
        
    }
    public Block(int length, int width, int height, String color, double mass){
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.mass = mass;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
    }
    public double getMass(){
        return mass;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setMass(double mass){
        this.mass = mass;
    }
    public int calculateVolume(){
        return width*length*height;
    }
    public double calculateDensity(){
        return mass/calculateVolume();
    }
}
