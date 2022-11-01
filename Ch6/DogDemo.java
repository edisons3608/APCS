
/**
 * Write a description of class DogDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogDemo
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args){
        Dog jamiepup = new Dog(69,"JamieCute");
        System.out.println(jamiepup.getAge());
        Dog jamieOld = new Dog(420,"JamieK");
        System.out.println(jamieOld.getAge());
        jamieOld.setAge(-1);
        System.out.println(jamieOld.getAge());
        
    }
}
