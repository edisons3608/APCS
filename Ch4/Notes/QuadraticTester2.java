
/**
 * Write a description of class QuadraticTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class QuadraticTester2
{
    // instance variables - replace the example below with your own
    /**
     * Default constructor for test class DogTester
     */
    public QuadraticTester2()
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
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-3,4);
        Quadratic q3 = new Quadratic(2,12,3);
        
        assertEquals(1,q1.getA(),0.00001);
        assertEquals(1,q1.getB(),0.00001);
        assertEquals(1,q1.getC(),0.00001);
        
        assertEquals(1,q2.getA(),0.00001);
        assertEquals(-3,q2.getB(),0.00001);
        assertEquals(4,q2.getC(),0.00001);
        
        assertEquals(2,q3.getA(),0.00001);
        assertEquals(12,q3.getB(),0.00001);
        assertEquals(3,q3.getC(),0.00001);
    }
    
    @Test
    public void testSetters()
    {
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-3,4);
        Quadratic q3 = new Quadratic(2,12,3);
        
        
        q1.setA(10);
        assertEquals(10,q1.getA(),0.00001);
        
        q2.setB(10.3);
        assertEquals(10.3,q2.getB(),0.00001);
        
        q3.setC(45.3);
        assertEquals(45.3,q3.getC(),0.00001);
    }
    
    @Test
    public void testDiscriminant()
    {
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-3,4);
        Quadratic q3 = new Quadratic(2,12,3);
        
        assertEquals(-3,q1.discriminant(),0.00001);
        
        assertEquals(-7,q2.discriminant(),0.00001);
        
        assertEquals(120,q3.discriminant(),0.00001);
        

        
    }
    @Test
    public void testEvaluate(){
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-3,4);
        Quadratic q3 = new Quadratic(2,12,3);
        
        assertEquals(4831,q1.evaluate(69),0.00001);
        assertEquals(4,q2.evaluate(0),0.00001);
        assertEquals(2723,q3.evaluate(34),0.00001);
        
        

        
    }
    @Test void testRoot1(){
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-4,3);
        Quadratic q3 = new Quadratic(2,12,3);
        
        assertEquals(Double.NaN,q1.findRoot1(),0.00001);
        assertEquals(1,q2.findRoot1(),0.00001);
        assertEquals(-5.738612787526,q3.findRoot1(),0.00001);
    }
    @Test void testRoot2(){
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-4,3);
        Quadratic q3 = new Quadratic(2,12,3);
        
        assertEquals(Double.NaN,q1.findRoot2(),0.00001);
        assertEquals(3,q2.findRoot2(),0.00001);
        assertEquals(-0.26138721247415,q3.findRoot2(),0.00001);
    }
    @Test void testIsSolution(){
        Quadratic q1 = new Quadratic();
        Quadratic q2 = new Quadratic(1,-4,3);
        Quadratic q3 = new Quadratic(2,12,3);
        
        assertEquals(true,q1.isSolution(4,21));
        assertEquals(false,q1.isSolution(5,32));
        
        assertEquals(true,q2.isSolution(-2,15));
        assertEquals(false,q2.isSolution(99,31));
        
        assertEquals(true,q3.isSolution(-33,1785));
        assertEquals(false,q3.isSolution(5,31));
    }
}
