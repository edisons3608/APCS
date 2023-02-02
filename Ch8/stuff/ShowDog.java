
/**
 * Write a description of class ShowDog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ShowDog extends Dog
{
    // instance variables - replace the example below with your own
    private String breed;
    private ArrayList<String> awards;
    
    public ShowDog(){
        super(); //if no super call to superclass
        
        breed = "default breed";
        
        awards = new ArrayList<String>();
    }
    
    public ShowDog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        awards = new ArrayList<String>();
    }
    public String getBreed(){
        return breed;
    }
    public ArrayList<String> awardList(){
        ArrayList<String> copy = new ArrayList<String>(awards);
        return copy;
    }
    public void wonAward(String someAward){
        awards.add(someAward);
    }
    public String toString(){
        String awardList = "";
        for(String a : awards){
            awardList += a + ", ";
            
        }
        
        if(awardList.length() > 2){
            awardList = awardList.substring(0,awardList.length()-2);
        }
        return super.toString() + "\nBreed: " + breed + "\nAwards:" + awardList;
        
    }
    public boolean equals(Object obj){
        if(!(obj instanceof ShowDog)){
            return false;
        }
        ShowDog temp = (ShowDog)obj;
        
        return super.equals(obj) && temp.getBreed().equals(getBreed());
    }
}
