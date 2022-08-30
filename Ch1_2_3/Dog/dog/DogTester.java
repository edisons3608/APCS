

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DogTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DogTester
{
    /**
     * Default constructor for test class DogTester
     */
    public DogTester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructorsAndGetters()
    {
        Dog d1 = new Dog();
        Dog d2 = new Dog("Fido");
        Dog d3 = new Dog("Rex", 7);
        
        assertEquals(0, d1.getAge());
        assertEquals("Oliver", d1.getName());
        assertEquals(1, d2.getAge());
        assertEquals("Fido", d2.getName());
        assertEquals(7, d3.getAge());
        assertEquals("Rex", d3.getName());
    }
    
    @Test
    public void testSetters()
    {
        Dog d1 = new Dog();
        
        d1.setName("Palmer");
        d1.setAge(9);
        
        assertEquals("Palmer", d1.getName());
        assertEquals(9, d1.getAge());
    }
    
    @Test
    public void testOlder()
    {
        Dog d1 = new Dog();
        d1.getOlder();
        d1.getOlder();
        d1.getOlder();
        assertEquals(3, d1.getAge());
        
        Dog d2 = new Dog("Rex", 8);
        d2.getOlder(3);
        assertEquals(11, d2.getAge());
    }
}
