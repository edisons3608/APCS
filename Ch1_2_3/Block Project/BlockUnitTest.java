

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BlockUnitTest
 *
*/
public class BlockUnitTest
{
    private static final double EPSILON = 1e-14;
    /**
     * Default constructor for test class BlockTester
     */
    public BlockUnitTest()
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

        Block block1 = new Block(4,2,5,"yellow",10.2);
        assertEquals(4,block1.getLength());
        assertEquals(2,block1.getWidth());
        assertEquals(5,block1.getHeight());
        assertTrue(block1.getColor().equals("yellow"));
        assertEquals(10.2,block1.getMass(),EPSILON);

        Block block2 = new Block();
        assertEquals(10,block2.getLength());
        assertEquals(10,block2.getWidth());
        assertEquals(10,block2.getHeight());
        assertTrue(block2.getColor().equals("black"));
        assertEquals(1.0,block2.getMass(), EPSILON);

    }
    
    @Test
    public void testSetters()
    {
        Block block1 = new Block(5,2,3,"blue",5.4);
        block1.setLength(6);
        assertEquals(6,block1.getLength());
        block1.setWidth(8);
        assertEquals(8,block1.getWidth());
        block1.setHeight(3);
        assertEquals(3,block1.getHeight());
        block1.setColor("green");
        assertTrue(block1.getColor().equals("green"));
        block1.setMass(2.8);
        assertEquals(2.8,block1.getMass(),EPSILON);
    }
    
    @Test
    public void testVolumeAndDensity()
    {
        Block block1 = new Block(4,8,6,"orange",9.5);
        assertEquals(192,block1.calculateVolume());
        assertEquals(9.5/192,block1.calculateDensity(),EPSILON);
    }
}
