
/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Employee
{
    // instance variables - replace the example below with your own
    private int numYears;
    
    public Teacher(String name, int age, boolean emp, double sal, int years){
        super(name, age, emp, sal);
        numYears = years;
    }
    public int getNumYears(){
        return numYears;
    }
    public void addYearExperience(){
        numYears++;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Teacher)){
            return false;
        }
        Teacher temp = (Teacher)obj;
        return super.equals(temp) && numYears == temp.getNumYears();
    }
}
