import java.util.ArrayList;

public class ClientDemo
{
    public static void main(String[] args)
    {
        ArrayList<Person> clientList = new ArrayList<Person>();
        clientList.add(new Person("Conrad", 40));
        clientList.add(new Student("Iris", 18, 4.0));
        clientList.add(new Student("Henry", 20, 3.9));
        clientList.add(new Teacher("Chris", 40, true, 50000.00, 5));
        clientList.add(new Programmer("Lisa", 35, true, 65000.00, "C++"));
        clientList.add(new Student("Charlie", 21, 3.0));
        clientList.add(new Teacher("Jen", 50, true, 75000.00, 17));
        clientList.add(new Employee("Ted", 48, false, 0.00));
        clientList.add(new Teacher("Ben", 60, false, 0.00, 35));
        clientList.add(new Programmer("Alex", 22, true, 90000.00, "Java"));
        
        
        // Print out names of all your clients
        for(Person p : clientList){
            System.out.println(p.getName());
        }
        
        
        
        
        System.out.println();
        // Print out the GPAs of all the Students
        
        for(Person p : clientList){
            if(p instanceof Student){
                System.out.println(((Student)p).getGpa());
            }
        }
        
        
        
        
        System.out.println();        
        // It's been a year - update the age of all clients.  Can you use a For-Each loop?  
        
        for(Person p:clientList){
            p.birthday();
        }
        
        
        
        
        
        // Then print all ages to verify
        
        for(Person p:clientList){
            System.out.println(p.getAge());
        }
        
        
        
        
        
        System.out.println();        
        // Also update all currently employed teachers years of experience. Can you use a For-Each loop?
        
        for(Person p: clientList){
            if(p instanceof Teacher){
                ((Teacher)p).addYearExperience();
            }
        }
        
        
        
        
        
        
        // Then print all years of experience to verify
        
        for(Person p : clientList){
            if(p instanceof Teacher){
                System.out.println(((Teacher)p).getNumYears());
            }
        }
        
        
        
        
        
        System.out.println();
        
        // You have the information of 6 possible new clients in an Array below.  
        // Search through clientList. If the client from the Array below is already in clientList, do nothing.
        // If the client is not already in the clientList, add them to the end of the clientList.
        Person[] newClients = new Person[6];
        newClients[0] = new Employee("Ted", 49, false, 0.00); // is in clientList (recall everyone is a year older)
        newClients[1] = new Employee("Ted", 55, false, 0.00);  
        newClients[2] = new Teacher("Chris", 41, true, 50000.00, 5);  // is in clientList (recall everyone is a year older)
        newClients[3] = new Teacher("Chris", 41, true, 50000.00, 6);  
        newClients[4] = new Programmer("Lisa", 36, true, 65000.00, "C++");  // is in clientList (recall everyone is a year older)
        newClients[5] = new Programmer("Lisa", 36, true, 70000.00, "C++");
        
        for(Person p : newClients){
            boolean flag = false;
            for(Person p2 : clientList){
                if(p2.equals(p)){
                    flag = true;
                }
            }
            if(!flag){
                clientList.add(p);
            }
        }
        
        
        
        
        
        
        // Print out the names of those in clientList and you should see 3 new clients at the end of your list.
        
        for(Person p : clientList){
            System.out.println(p.getName());
        }
        
        
        
    }
}
