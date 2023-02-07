
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog
{
    // Part 1:  Instance Variables (Data)
    private String name;  // Declared a variable
    private int age;
    
    // Part 2:  Constructors
    // Constructors will initialize all the instance variables
    public Dog()   // Default Constructor
    {
        name = "Oliver";
        age = 0;
    }
    // Overloading the constructor
    public Dog(String name, int age)
    {
        this.name = name;  //implicit this.  this object's name is assigned to the parameter name.
        this.age = age;
    }
    // Overload the constructor a third way:
    public Dog(String n)
    {
        name = n;
        age = 1;
    }
    
    
    // Part 3:  Methods
    // Getters (Accessor)
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    
    // Setters (Mutator)
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    } 
    
    // Any other methods that add functionality to this class
    public void getOlder()
    {
        age = age + 1;
    }
    // overloading a method:
    public void getOlder(int someYears)
    {
        age = age + someYears;
    }
    public int sumOfAges(Dog otherDog)
    {
        return this.age + otherDog.getAge();
    }
    
    public String toString()
    {
        return "Name: " + name + "\nAge: " + age;
    }
    
    public boolean isPuppy()
    {
        // if age is 2 or less, return true
        // we will discuss multiple ways of writing this.
        return age <= 2;
    }
    
    public boolean equals(Object obj){
        if(!(obj instanceof Dog)){
            return false;
        }
        Dog temp = (Dog)obj;
        if(!this.name.equals(temp.getName())){
            return false;
        }
        return this.age == temp.age;
    }
    
    
    
}
