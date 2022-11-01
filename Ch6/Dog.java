
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    
    
    public Dog(int newAge, String newName){
        age = newAge;
        name = newName;
    }
    
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public int getAge(){
        return age;
    }
    
}
