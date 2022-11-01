

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PrimeFactorizationUnitTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EnhancementsOnlyUnitTest
{
    /**
     * Default constructor for test class PrimeFactorizationUnitTest
     */
    public EnhancementsOnlyUnitTest()
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
    public void testFactor()
    {
        assertEquals("2",Primes.factor(2));
        assertEquals("3*5",Primes.factor(15));
        assertEquals("2*2*5*5",Primes.factor(100));
        assertEquals("3*3*3",Primes.factor(27));
        assertEquals("2*5*11",Primes.factor(110));
        assertEquals("37",Primes.factor(37));
        assertEquals("",Primes.factor(1));
    }
    @Test
    public void testTwinPrimes()
    {
        assertEquals(0,Primes.countTwinPrimes(4));
        assertEquals(1,Primes.countTwinPrimes(6));
        assertEquals(3,Primes.countTwinPrimes(17));
        assertEquals(4,Primes.countTwinPrimes(19));
        assertEquals(8,Primes.countTwinPrimes(100));
    }
}
