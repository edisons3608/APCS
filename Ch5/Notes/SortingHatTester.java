
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SortingHatTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SortingHatTester
{
    /**
     * Default constructor for test class SortingHatTester
     */
    public SortingHatTester()
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
    public void testSortingHat()

    {
        assertEquals("Slitherin", SortingHat.sortingHat(20220063));
        assertEquals("Hufflepuff", SortingHat.sortingHat(20220028));
        assertEquals("Griffindor", SortingHat.sortingHat(20220006));
        assertEquals("Hufflepuff", SortingHat.sortingHat(20220062));
        assertEquals("Ravenclaw", SortingHat.sortingHat(20220007));
        assertEquals("Ravenclaw", SortingHat.sortingHat(20220007));
        assertEquals("error", SortingHat.sortingHat(20210005));
    }

}

