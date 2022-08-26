public class RunHouse{
    public static void main(String[] args){
        House h1  = new House();
        House h2 = new House(1000000,"Winnetka");
        h1.increaseValue();
        System.out.println(h1.getValue());
    }
}