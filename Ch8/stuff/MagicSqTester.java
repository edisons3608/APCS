
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class MagicSqTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MagicSqTester
{
    /**
     * Default constructor for test class MagicSqTester
     */
    public MagicSqTester()
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
    public void tester()
    {
        StepTracker tr = new StepTracker(10000); 
        assertEquals(tr.activeDays(),0);
        assertEquals(tr.averageSteps(),0,1E-4);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        assertEquals(tr.activeDays(),0);
        assertEquals(tr.averageSteps(),7000.0,1E-4);
        tr.addDailySteps(13000);
        assertEquals(tr.activeDays(),1);
        assertEquals(tr.averageSteps(),9000,1E-4);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        assertEquals(tr.activeDays(),2);
        assertEquals(tr.averageSteps(),10222.2,10-4);
    }
}
