
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private int id;
    private double gpa;
    
    private static int count = 20251000;
    public Student(String name, int age, double gpa){
        super(name,age);
        this.gpa = gpa;
        id = count++;
        
    }
    
    public int getId(){
        return id;
    }
    public double getGpa(){
        return gpa;
    }
    public boolean isHonorRoll(){
        return gpa > 3.0;
    }
    public String toString(){
        return super.toString() + "\nID: "+id+"\nGPA: "+gpa;
        
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Student)){
            return false;
        }
        Student temp = (Student)obj;
        return super.equals(temp) && id == temp.getId() && Math.abs(gpa-temp.getGpa()) < 1E-4;
    }
    
}
