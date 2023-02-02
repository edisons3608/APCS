
/**
 * Write a description of class Programmer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Programmer extends Employee
{
    // instance variables - replace the example below with your own
    private String language;
    
    public Programmer(String name, int age, boolean emp, double sal, String language){
        super(name,age,emp,sal);
        this.language = language;
    }
    public String getLanguage(){
        return language;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Programmer)){
            return false;
        }
        Programmer temp = (Programmer)obj;
        
        return super.equals(temp) && language.equals(temp.getLanguage());
        
    }
    
}
