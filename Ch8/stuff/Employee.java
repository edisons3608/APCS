
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    // instance variables - replace the example below with your own
    private boolean isCurrentlyEmployed;
    private double salary;
    
    public Employee(String name, int age, boolean emp, double sal){
        super(name,age);
        isCurrentlyEmployed = emp;
        salary = sal;
    }
    public boolean getEmployed(){
        return isCurrentlyEmployed;
    }
    public double getSalary(){
        return salary;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee temp = (Employee)obj;
        
        return super.equals(temp) && isCurrentlyEmployed == temp.getEmployed() && Math.abs(salary-temp.getSalary()) < 1E-4;
    }
}
