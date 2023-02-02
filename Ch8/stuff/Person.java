
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void birthday(){
        age++;
    }
    public String toString(){
        return "Name: "+name+"\nAge: "+age;
    }
    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        Person temp = (Person)obj;
        return name.equals(temp.getName()) && age == temp.getAge();
    }
    
    
}
