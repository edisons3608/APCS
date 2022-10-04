

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SortStringsTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SortStringsTester
{
    /**
     * Default constructor for test class SortStringsTester
     */
    public SortStringsTester()
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
    public void SortStringTester()
    {
        assertEquals("art, bat, car", SortStrings.stringSorter("car", "art", "bat"));
        assertEquals("car, cart, cat", SortStrings.stringSorter("car", "cat", "cart"));
        assertEquals("A, a, aa", SortStrings.stringSorter("aa", "a", "A"));
        assertEquals("5, 6, 7", SortStrings.stringSorter("7", "6", "5"));
        assertEquals("1, A, a", SortStrings.stringSorter("1", "A", "a"));
        assertEquals("Ate, ate, eat", SortStrings.stringSorter("ate", "Ate", "eat"));
    }
}
