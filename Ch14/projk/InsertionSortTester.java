
import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InsertionSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InsertionSortTester
{
    /**
     * Default constructor for test class InsertionSortTester
     */
    public InsertionSortTester()
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

    @Test
    public void insertionSortTester()
    {
        int[] arr1 = {-4, 9, -9, 4, 2, 0};  //-9, -4, 0, 2, 4, 9
        int[] arr1Sorted = InsertionSorter.insertionSort(arr1);
        assertEquals(-9, arr1Sorted[0]);
        assertEquals(-4, arr1Sorted[1]);
        assertEquals(0, arr1Sorted[2]);
        assertEquals(2, arr1Sorted[3]);
        assertEquals(4, arr1Sorted[4]);
        assertEquals(9, arr1Sorted[5]);
    }
    
    @Test
    public void HomeworkInsertSortTester()
    {
        ArrayList<String> arr = new ArrayList<String>();       
        arr.add("a");
        arr.add("A");
        arr.add("Car");
        arr.add("car");
        arr.add("cat");
        arr.add("card");
        // {A, Car, a, car, card, cat}
        ArrayList<String> arrSorted = InsertionSorter.insertSort(arr);
        assertEquals("A", arr.get(0));
        assertEquals("Car", arr.get(1));
        assertEquals("a", arr.get(2));
        assertEquals("car", arr.get(3));
        assertEquals("card", arr.get(4));
        assertEquals("cat", arr.get(5));

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
}
