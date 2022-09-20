
/**
 * Write a description of class Quadratic here.
 *
 * @author Edison Sun
 * @version 9/20/22
 */
public class Quadratic
{
    // instance variables - replace the example below with your own
    private double a;
    private double b;
    private double c;
    
    public Quadratic(){
        a = 1;
        b = 1;
        c = 1;
    }
    public Quadratic(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double discriminant(){
        return b*b-4*a*c;
    }
    public double findRoot1(){
        return (-b+Math.sqrt(discriminant()))/(double)(2*a);
    }
    public double findRoot2(){
        return (-b-Math.sqrt(discriminant()))/(double)(2*a);
    }
    public double evaluate(double x){
        return a*x*x+b*x+c;
    }
    public boolean isSolution(double x, double y){
        return y == evaluate(x);
    }
}
