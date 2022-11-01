
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BirthdayTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BirthdayTester
{
    /**
     * Default constructor for test class BirthdayTester
     */
    public BirthdayTester()
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
    public void testIsValidBirthday()

    { 
        assertTrue(Birthday.isValidBirthdate("01/31/1900"));  
        assertTrue(Birthday.isValidBirthdate("11/30/1998"));   
        assertFalse(Birthday.isValidBirthdate("11/31/1998"));
        assertTrue(Birthday.isValidBirthdate("02/28/2015"));
        assertFalse(Birthday.isValidBirthdate("02/29/2015"));
        assertTrue(Birthday.isValidBirthdate("02/29/2016"));
        assertFalse(Birthday.isValidBirthdate("01/00/1900"));
        assertFalse(Birthday.isValidBirthdate("10/31/1899"));
        assertFalse(Birthday.isValidBirthdate("13/00/1900"));
        assertFalse(Birthday.isValidBirthdate("09/31/2000"));
        assertTrue(Birthday.isValidBirthdate("09/30/2100"));

    }

}
