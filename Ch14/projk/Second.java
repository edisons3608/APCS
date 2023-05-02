public class Second extends First

{

public void whoRules()

{

System.out.print(super.name() + " rules");

System.out.println(" but " + name() + " is even better");

}

public String name()

{

return "Second";

}

}