

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRack.
 *
 * @author  Mr. Funk
 * @version Dec 20, 2013
 */
public class TestRack
{
    /**
     * Default constructor for test class TestRack
     */
    public TestRack()
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
    public void TestRack1WithoutToString()
    {
        Rack rack1 = new Rack();
        assertEquals(0, rack1.count());
        assertEquals(0.0, rack1.getQuantity(), 0.001);
        assertEquals(0.0, rack1.getQuantity("Sulfur"), 0.001);
        Potion potion1 = new Potion("Sulfur", 80);
        Potion potion2 = new Potion("elixir", 20);
        Potion potion3 = new Potion("phosphor", 40);
        Potion potion4 = new Potion("brine", 30);
        Vial vial1 = new Vial();
        vial1.addPotion(potion1);
        Vial vial2 = new Vial();
        vial2.addPotion(potion2);
        Vial vial3 = new Vial();
        vial3.addPotion(potion3);
        Vial vial4 = new Vial();
        vial4.addPotion(potion4);
        Vial vial5 = new Vial();
        Vial vial6 = new Vial();
        vial6.addPotion(new Potion("Sulfur", 80));
        vial6.addPotion(new Potion("elixir", 20));
        Vial vial7 = new Vial();        
        vial7.addPotion(new Potion("phosphor", 40));
        vial7.addPotion(new Potion("brine", 30));
        vial7.addPotion(new Potion("brine", 30));
        Vial vial8 = new Vial();
        vial8.addPotion(new Potion("phosphor", 40));      
        vial8.addPotion(new Potion("elixir", 20));           
        assertEquals(true, rack1.add(vial1));
        assertEquals(80.0, rack1.getQuantity(), 0.01);
        assertEquals(true, rack1.add(vial5));
        assertEquals(2, rack1.count());
        assertEquals(false, rack1.add(vial6, 0, 1));
        assertEquals(true, rack1.add(vial4, 0, 4));
        assertEquals(true, rack1.add(vial3));
        assertEquals(4, rack1.count());
        assertEquals(150, rack1.getQuantity(), 0.01);
        assertEquals(30, rack1.getQuantity("brine"), 0.01);
        assertEquals(0.0, rack1.getQuantity("unobtainium"), 0.01);
        assertEquals(true, rack1.add(vial2, 2, 4));
        assertEquals(true, rack1.add(vial6));  
        assertEquals(true, rack1.add(vial7));  
        assertEquals(370.0, rack1.getQuantity(), 0.01);
        assertEquals(40, rack1.getQuantity("elixir"), 0.01);  
        assertEquals(80, rack1.getQuantity("phosphor"), 0.01);   
        assertEquals(true, rack1.add(vial5));
        assertEquals(true, rack1.add(vial5));
        assertEquals(true, rack1.add(vial5));
        assertEquals(10, rack1.count());        
    }

    @Test
    public void TestRack2withoutToString()
    {
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        Vial vial3 = new Vial();
        Potion potion1 = new Potion("sulfur", 45.2);
        Potion potion2 = new Potion("lead", 10.1);
        Potion potion3 = new Potion("ice", 30);
        Potion potion4 = new Potion("elixir", 4.6);
        Vial vial4 = new Vial();
        vial1.addPotion(potion1);
        vial1.addPotion(potion2);
        vial1.addPotion(potion3);
        vial1.addPotion(potion4);
        vial2.addPotion(new Potion("sulfur", 45.2));
        vial2.addPotion(new Potion("ice", 30));
        vial2.addPotion(new Potion("ice", 30));
        vial2.addPotion(new Potion("elixir", 4.6));
        vial3.addPotion(new Potion("ice", 30));
        Rack rack1 = new Rack();
        assertEquals(0, rack1.count());
        assertEquals(0, rack1.getQuantity(), 0.001);
        rack1.add(vial3, 1, 5);
        rack1.add(vial1);
        rack1.add(vial3);
        assertEquals(3, rack1.count());
        rack1.add(vial4, 2, 1);
        assertEquals(4, rack1.count());
        assertEquals(vial1, rack1.remove(0, 0));
        assertEquals(3, rack1.count());
        assertEquals(null, rack1.remove(0, 0));   
        rack1.add(vial1, 2, 2); 
        rack1.add(vial2);
        assertEquals(5, rack1.count());      
        assertEquals(false, rack1.add(vial1, 1, 5));  
        assertEquals(vial4, rack1.remove(2, 1));
        rack1.add(vial2);
    }

    @Test
    public void TestRack3withToString()
    {
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        Vial vial3 = new Vial();
        Potion potion1 = new Potion("sulfur", 45.2);
        Potion potion2 = new Potion("lead", 10.1);
        Potion potion3 = new Potion("ice", 30);
        Potion potion4 = new Potion("elixir", 4.6);
        Vial vial4 = new Vial();
        vial1.addPotion(potion1);
        vial1.addPotion(potion2);
        vial1.addPotion(potion3);
        vial1.addPotion(potion4);
        vial2.addPotion(new Potion("sulfur", 45.2));
        vial2.addPotion(new Potion("ice", 30));
        vial2.addPotion(new Potion("ice", 30));
        vial2.addPotion(new Potion("elixir", 4.6));
        vial3.addPotion(new Potion("ice", 30));
        Rack rack1 = new Rack();
        assertEquals("", rack1.toString());
        assertEquals(0, rack1.count());
        assertEquals(0, rack1.getQuantity(), 0.001);
        rack1.add(vial3, 1, 5);
        java.lang.String string1 = rack1.toString();
        assertEquals("Row 1 Col 5\n30.0 grams of ice", string1);
        rack1.add(vial1);
        assertEquals("Row 0 Col 0\n45.2 grams of sulfur\n10.1 grams of lead\n30.0 grams of ice\n4.6 grams of elixir\n\nRow 1 Col 5\n30.0 grams of ice", rack1.toString());
        rack1.add(vial3);
        assertEquals(3, rack1.count());
        rack1.add(vial4, 2, 1);
        assertEquals(4, rack1.count());
        assertEquals(vial1, rack1.remove(0, 0));
        assertEquals(3, rack1.count());
        assertEquals(null, rack1.remove(0, 0));   
        rack1.add(vial1, 2, 2); 
        rack1.add(vial2);
        assertEquals(5, rack1.count());
        assertEquals(false, rack1.add(vial1, 1, 5));  
        assertEquals(vial4, rack1.remove(2, 1));   
        System.out.println(rack1.toString());
        rack1.consolidate();
        System.out.println(rack1.toString());
        String result = rack1.toString();
        assertEquals("Row 0 Col 0\n45.2 grams of sulfur\n30.0 grams of ice\n4.6 grams of elixir\n\nRow 0 Col 1\n30.0 grams of ice\n\nRow 0 Col 2\n30.0 grams of ice\n\nRow 0 Col 3\n45.2 grams of sulfur\n10.1 grams of lead\n30.0 grams of ice\n4.6 grams of elixir",rack1.toString());
    }
}


