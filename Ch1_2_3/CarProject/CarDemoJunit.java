

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarDemoJunit
{
    private static final double EPSILON = 1e-14;
    /**
     * Default constructor for test class BlockTester
     */
    public CarDemoJunit()
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
    public void testContructorAndGetters()
    {

        Car c1 = new Car();
        Car c2 = new Car(10,20);
        Car c3 = new Car(30);
        
        assertEquals(c1.getGas(),20,0.001);
        
        assertEquals(c2.getEfficiency(),20,0.001);
        
        assertEquals(c3.getGas(),20,0.001);

    }
    
    @Test
    public void testSetters()
    {
        Car c1 = new Car();
        Car c2 = new Car(10,20);
        Car c3 = new Car(30);
        
        
        c1.addGas(10);
        assertEquals(c1.getGas(),30,0.001);
        
        c2.addGas(100);
        assertEquals(c2.getGas(),110,0.001);
        
        c3.addGas(43);
        assertEquals(c3.getGas(),63,0.001);
    }
    
    @Test
    public void testDrive()
    {
        Car c1 = new Car();
        Car c2 = new Car(10,20);
        Car c3 = new Car(30);
        
        c1.drive(100);
        assertEquals(c1.getGas(),16,0.001);
        
        
        c2.drive(200);
        assertEquals(c2.getGas(),0,0.001);
        
        
    }
    @Test
    public void testGasAndDrive(){
        Car c1 = new Car();
        Car c2 = new Car(10,20);
        Car c3 = new Car(30);
        
        c1.addGas(10);
        c1.drive(750);
        assertEquals(c1.getGas(),0,0.001);
        
        c2.addGas(34);
        c2.drive(880);
        assertEquals(c2.getGas(),0,0.001);
        
        c3.addGas(33);
        c3.drive(1590);
        assertEquals(c3.getGas(),0,0.001);
    }
}
