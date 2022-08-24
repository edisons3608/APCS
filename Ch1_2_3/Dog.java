public class Dog {
    private String name;
    private int age;
    public Dog(){
        name = "Oliver";
        age=10;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
}
