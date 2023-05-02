import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestVial.
 *
 */
public class TestVial
{
    /**
     * Default constructor for test class TestVial
     */
    public TestVial()
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
    public void testVial_1()
    {
        Vial vial1 = new Vial();
        assertEquals(0.0, vial1.getQuantity(), 0.001);
        Potion potion1 = new Potion("phosphor", 98.9);
        assertEquals(true,vial1.addPotion(potion1));
        Potion potion2 = new Potion("sulfur", 1.0);
        assertEquals(true,vial1.addPotion(potion2));
        assertEquals(99.9, vial1.getQuantity(), 0.001);
        assertEquals(false,vial1.addPotion(potion1));
    }

    @Test
    public void testVial_2()
    {
        Vial vial2 = new Vial();
        Potion potion1 = new Potion("phosphor",52.3);
        Potion potion2 = new Potion("sulfur",4.1);
        Potion potion3 = new Potion("phosphor",5.2);
        assertEquals(true,vial2.addPotion(potion1));
        assertEquals(true,vial2.addPotion(potion2));
        assertEquals(52.3,vial2.getQuantity("phosphor"),0.001);
        assertEquals(4.1,vial2.getQuantity("sulfur"),0.001);
        assertEquals(56.4,vial2.getQuantity(),0.001);
        assertEquals(true,vial2.addPotion(potion3));
        assertEquals(57.5,vial2.getQuantity("phosphor"),0.001);
    }
    
    @Test
    public void testVial_3()
    {
        Vial vial1 = new Vial();
        Potion p1 = new Potion("sulfur",98.2);
        Potion p2 = new Potion("water",1.8);
        assertEquals(true,vial1.addPotion(p1));
        assertEquals(true,vial1.addPotion(p2));
        
    }
    
    @Test //includes test of toString method
    public void testVial4_IncludesToString()
    {
        Potion potion1 = new Potion("sulfur", 10.5);
        Potion potion2 = new Potion("water", 30.2);
        Potion potion3 = new Potion("iron", 12.0);
        Potion potion4 = new Potion("essence of lavender", 0.05);
        Potion potion5 = new Potion("oil", 24.1);
        Vial vial3 = new Vial();
        assertEquals("", vial3.toString());
        assertEquals(true, vial3.addPotion(potion1));
        assertEquals(true, vial3.addPotion(potion2));
        assertEquals("10.5 grams of sulfur\n30.2 grams of water", vial3.toString());        
        assertEquals(true, vial3.addPotion(potion3));
        assertEquals(true, vial3.addPotion(potion4));
        assertEquals(true, vial3.addPotion(potion5));
        assertEquals(30.2, vial3.getQuantity("water"), 0.001);
        assertEquals(10.5, vial3.getQuantity("sulfur"), 0.001);
        assertEquals(76.85, vial3.getQuantity(), 0.001);
        assertEquals(false, vial3.addPotion(potion5));
        assertEquals("10.5 grams of sulfur\n30.2 grams of water\n12.0 grams of iron\n0.05 grams of essence of lavender\n24.1 grams of oil", vial3.toString());  
        assertEquals(true, vial3.addPotion(potion4));                 
        assertEquals(76.9, vial3.getQuantity(), 0.001);
        assertEquals("10.5 grams of sulfur\n30.2 grams of water\n12.0 grams of iron\n0.1 grams of essence of lavender\n24.1 grams of oil", vial3.toString());           
    }
    @Test
    public void testVial_5_usesEqualsMethod()
    {
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        assertTrue(vial1.equals(vial2));
        Potion p1 = new Potion("sulfur",98.2);
        Potion p2 = new Potion("water",1.8);
        assertEquals(true,vial1.addPotion(p1));
        assertFalse(vial1.equals(vial2));
        assertEquals(true, vial2.addPotion(p1));
        assertTrue(vial1.equals(vial2));
        assertEquals(true,vial1.addPotion(p2));
        assertFalse(vial1.equals(vial2));
        assertEquals(true, vial2.addPotion(p2));
        assertTrue(vial1.equals(vial2));
    }
    @Test
    public void testVial_6_usesEqualsMethod()
    {
        //tests two vials with same contents but in a different order
        Vial vial1 = new Vial();
        Vial vial2 = new Vial();
        assertTrue(vial1.equals(vial2));
        Potion p1 = new Potion("sulfur",98.2);
        Potion p2 = new Potion("water",1.8);
        assertEquals(true,vial1.addPotion(p1));
        assertEquals(true, vial1.addPotion(p2));
        assertFalse(vial1.equals(vial2));
        assertEquals(true, vial2.addPotion(p2));
        assertEquals(true,vial2.addPotion(p1));
        assertTrue(vial1.equals(vial2));
    }
    
    
    // @Test 
    // public void testVial_parameterizedConstructor()
    // {
        // Potion potion1 = new Potion("sulfur", 10.5);
        // Potion potion2 = new Potion("water", 30.2);
        // Potion potion3 = new Potion("iron", 12.0);
        // Potion[] potions = {potion1, potion2, potion3};
        // Vial v1 = new Vial(potions);
        // assertEquals("10.5 grams of sulfur\n30.2 grams of water\n12.0 grams of iron", v1.toString());
    // }
    // @Test
    // public void testVial_toStringAsPercent()
    // {
        // Vial vial1 = new Vial();
        // assertEquals("", vial1.toString());
        
        // Vial vial2 = new Vial();
        // Potion potion1 = new Potion("sulfur",4.0);
        // Potion potion2 = new Potion("iron",16.0);
        // Potion potion3 = new Potion("phosphor",52.5);
        // Potion potion4 = new Potion("water",7.5);
        // assertEquals(true,vial2.addPotion(potion1));
        // assertEquals(true,vial2.addPotion(potion2));
        // assertEquals("sulfur: 20.0%\niron: 80.0%", vial2.toStringAsPercent());
        // assertEquals(true,vial2.addPotion(potion3));
        // assertEquals(true,vial2.addPotion(potion4));
        // assertEquals("sulfur: 5.0%\niron: 20.0%\nphosphor: 65.625%\nwater: 9.375%", vial2.toStringAsPercent());
        
        
    // }
    // @Test
    // public void testVial_getPrimary()
    // {
        // Vial vial1 = new Vial();
        // assertEquals(null, vial1.getPrimary());
        
        // Vial vial2 = new Vial();
        // Potion potion1 = new Potion("sulfur",4.0);
        // Potion potion2 = new Potion("iron",16.0);
        // Potion potion3 = new Potion("phosphor",52.5);
        // Potion potion4 = new Potion("water",3.5);
        // assertEquals(true,vial2.addPotion(potion1));
        // assertEquals(true,vial2.addPotion(potion2));
        // assertEquals(true,vial2.addPotion(potion3));
        // assertEquals(true,vial2.addPotion(potion4));
        // Potion primary = vial2.getPrimary();
        // assertEquals("phosphor", primary.getDescription());
        // assertEquals(52.5, primary.getQuantity(), 0.000001);
        
        
    // }
}