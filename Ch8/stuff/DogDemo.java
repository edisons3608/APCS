
/**
 * Write a description of class DogDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DogDemo
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        ShowDog s1 = new ShowDog();
        s1.getOlder();
        //System.out.println(s1);
        
        Dog d2 = new ShowDog("Rex", 8, "lab"); //upcast
        
        //still a ShowDog object, but can only use it as a regular Dog.
        // Compiler looks at Dog - reference type
        // At run-time, ShowDog's version of all methods are run.
        // ShowDog is the "Object Type".
        
        //d2.wonAward("Best In Show"); Compiler does not allow.
        
        ((ShowDog)d2).wonAward("Best In Show"); //DownCast
        
        ArrayList<Dog> vet = new ArrayList<Dog>();
        vet.add(new Dog());
        vet.add(new ShowDog());
        vet.add(s1);
        vet.add(s1);
        
        for(Dog d: vet){
            if(d instanceof ShowDog){
                ((ShowDog)d).wonAward("Good Health 2023");
                
            }
        }
        for(Dog d : vet){
            System.out.println(d);
            System.out.println();
        }
        
        
        
    }
    
    
}
