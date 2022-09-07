
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    /**
     * Constructor for objects of class Dog
     */
    public Dog()
    {
        // initialise instance variables
        name = "Oliver";

    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name){
        this.name = name;
        this.age = 1;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void getOlder(int years){
        this.age += years;
    }
    public void getOlder(){
        this.age += 1;
    }
    public String toString(){
        return "Name: "+ name + "\nAge: "+age;
    }
 
}
