
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * The test class PizzaTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PizzaTester
{
    /**
     * Default constructor for test class PizzaTester
     */
    public PizzaTester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testPizzaConstructorsAndGetters()
    {
        Pizza p1 = new Pizza();
        assertEquals("medium", p1.getSize());
        p1.addTopping("pepperoni");
        p1.addTopping("green pepper");
        assertEquals("medium", p1.getSize());
        assertEquals("pepperoni", p1.getTopping(0));
        assertEquals("green pepper", p1.getTopping(1));

        Pizza p2 = new Pizza("large");
        assertEquals("large", p2.getSize());

    }

    @Test
    public void testDeliveryPizzaConstructorsAndGetters()
    {
        DeliveryPizza d1 = new DeliveryPizza();
        assertEquals("medium", d1.getSize());
        assertEquals("Winnetka", d1.getDestination());
        d1.addTopping("mushroom");
        d1.addTopping("green pepper");
        assertEquals("mushroom", d1.getTopping(0));
        assertEquals("green pepper", d1.getTopping(1));

        DeliveryPizza d2 = new DeliveryPizza("small", "Chicago");
        assertEquals("small", d2.getSize());
        assertEquals("Chicago", d2.getDestination());
        d2.addTopping("sausage");
        assertEquals("sausage", d2.getTopping(0));

    }
    @Test 
    public void testToString()
    {
        Pizza p1 = new Pizza();
        String result1 = "Size: medium\nToppings: ";
        assertEquals(result1, p1.toString());

        p1.addTopping("pepperoni");
        p1.addTopping("green pepper");
        String result2 = "Size: medium\nToppings: pepperoni, green pepper";
        assertEquals(result2, p1.toString());

        DeliveryPizza d1 = new DeliveryPizza();
        String result3 = "Size: medium\nToppings: \nDestination: Winnetka";
        assertEquals(result3, d1.toString());
        d1.addTopping("mushroom");
        d1.addTopping("onion");
        String result4 = "Size: medium\nToppings: mushroom, onion\nDestination: Winnetka";
        assertEquals(result4, d1.toString());

    }

    @Test
    public void testEquals()
    {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        p1.addTopping("pepperoni");
        p1.addTopping("green pepper");
        p2.addTopping("pepperoni");
        p2.addTopping("green pepper");
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));

        p1.addTopping("mushroom");
        assertFalse(p1.equals(p2));
        assertFalse(p2.equals(p1));
        
        p2.addTopping("onion");
        assertFalse(p1.equals(p2));
        assertFalse(p2.equals(p1));
        
        Pizza p3 = new Pizza("large");
        Pizza p4 = new Pizza();
        assertFalse(p3.equals(p4));
        assertFalse(p4.equals(p3));
        
        Pizza p5 = new Pizza("large");
        assertTrue(p3.equals(p5));
        
        DeliveryPizza d1 = new DeliveryPizza("small", "Chicago");
        DeliveryPizza d2 = new DeliveryPizza("small", "Chicago");
        DeliveryPizza d3 = new DeliveryPizza("small", "Northfield");
        DeliveryPizza d4 = new DeliveryPizza("large", "Chicago");
        
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));
        assertFalse(d1.equals(d3));
        assertFalse(d1.equals(d4));
        
             
        
    }

}
