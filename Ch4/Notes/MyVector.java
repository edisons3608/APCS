
/**
 * Write a description of class MyVector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
public class MyVector
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    public MyVector(){
        this.x = (int)(21*Math.random())-10;
        this.y = (int)(21*Math.random())-10;
    }
    public MyVector(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double magnitude(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public void dilate(double factor){
        this.x = (int)Math.round(factor*x);
        this.y = (int)Math.round(factor*y);
    }
    public int dot(MyVector otherVector){
        return x*otherVector.getX()+y*otherVector.getY();
    }
    public double angle(MyVector otherVector){
        double angle = 180/Math.PI*Math.acos(dot(otherVector)/(this.magnitude()*otherVector.magnitude()));
        return Math.round(1000000*angle)/1000000.0;
    }
    public String toString(){
        return"<"+x+","+y+">";
    }
    public boolean isOrthogonal(MyVector otherVector){
        return this.dot(otherVector) == 0;
    }
    
    
}
