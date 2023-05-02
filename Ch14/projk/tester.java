
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * The test class tester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class tester
{
    /**
     * Default constructor for test class tester
     */
    public tester()
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
    public void testSmallList()
    {
        int [] arr = {4, 1, 3, -1, 2, 0};
        RandomNumberList list = new RandomNumberList(arr);
        
        assertFalse(list.isSorted());
        assertTrue(list.find(4)==0);
        assertTrue(list.find(1) == 1); 
        assertTrue(list.find(3) == 2);
        assertTrue(list.find(-1) == 3);
        assertTrue(list.find(2) == 4);
        assertTrue(list.find(0) == 5);     
        assertTrue(list.find(-2) == -1);    
        assertTrue(list.find(5) == -1);

        list.sort();
        assertTrue(list.isSorted());
        assertTrue(list.find(-1) == 0);
        assertTrue(list.find(0) == 1);
        assertTrue(list.find(1) == 2);
        assertTrue(list.find(2) == 3);
        assertTrue(list.find(3) == 4);  
        assertTrue(list.find(4) == 5);     
        assertTrue(list.find(5) == -1);    
        assertTrue(list.find(-2) == -1);         

    }
    @Test
    public void testBigData()
    {
        RandomNumberList list = new RandomNumberList();

        assertFalse(list.isSorted());
        assertTrue(list.find(681) == 18);
        assertTrue(list.find(40016) == 0);
        assertTrue(list.find(0) == -1);

        list.sort();

        assertTrue(list.isSorted());     
        assertTrue(list.find(-4704) == 0);
        assertTrue(list.find(0) == -1);
        assertTrue(list.find(99802) == 529);
        assertTrue(list.find(30901) == 170);
        assertTrue(list.find(30902) == -1);

        //Check that it's sorted by comparing to sorted list
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int i = 0; i < list.getSize(); i++)
        {
            data.add(list.getValue(i));
        }
        ArrayList<Integer> sortedData = new ArrayList<Integer>();
        try
        {
            Scanner scan = new Scanner(new File("sortedRandomNumbers.csv"));
            while(scan.hasNext())
            {
                sortedData.add(scan.nextInt());
            }
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }        
        for(int i = 0; i < data.size(); i++)
        {
            assertTrue(data.get(i).equals(sortedData.get(i)));
        }
    }
}
