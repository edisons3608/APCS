
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class PolygonTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PolygonTester
{
    /**
     * Default constructor for test class PolygonTester
     */
    public PolygonTester()
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
    public void constructorTesters()
    {
        Polygon p1 = new Polygon();
        assertEquals(1, p1.getCoordinate(0, 0));
        assertEquals(-2, p1.getCoordinate(3, 0));
        assertEquals(6, p1.getCoordinate(3, 1));

        ArrayList<Integer> input = new ArrayList<Integer>();
        int[] temp = {12, 15, 10, 9, 7, 7, 9, 11, 2, 2, 1, 0, -2, -4};
        for(int i = 0; i < temp.length; i ++)
        {
            input.add(temp[i]);
        }
        Polygon p2 = new Polygon(input);

        assertEquals(12, p2.getCoordinate(0, 0));
        assertEquals(15, p2.getCoordinate(0, 1));
        assertEquals(10, p2.getCoordinate(1, 0));
        assertEquals(9, p2.getCoordinate(1, 1));
        assertEquals(-2, p2.getCoordinate(6, 0));
        assertEquals(-4, p2.getCoordinate(6, 1));
    }

    @Test
    public void addTester()
    {
        Polygon p1 = new Polygon();
        p1.add(-10, 10);
        assertEquals(-10, p1.getCoordinate(4, 0));
        assertEquals(10, p1.getCoordinate(4, 1));
        p1.add(15, 16);
        assertEquals(15, p1.getCoordinate(5, 0));
        assertEquals(16, p1.getCoordinate(5, 1));
    }

    @Test
    public void maximumDistanceTester()
    {
        Polygon p1 = new Polygon();
        int[] result = p1.maximumDistance();
        assertEquals(-2, result[0]);
        assertEquals(6, result[1]);
        
    }
    @Test
    public void containsTester()
    {
        Polygon p1 = new Polygon();
        assertEquals(true, p1.contains(0));
        assertEquals(true, p1.contains(1));
        assertEquals(true, p1.contains(2));
        assertEquals(true, p1.contains(-5));
        assertEquals(true, p1.contains(6));
        assertEquals(false, p1.contains(-1));
        assertEquals(false, p1.contains(-6));
        assertEquals(false, p1.contains(5));
    }
    @Test
    public void rangeTester()
    {
        Polygon p1 = new Polygon();
        int[] result = p1.range();
        assertEquals(5, result[0]);
        assertEquals(11, result[1]);
    }
}
