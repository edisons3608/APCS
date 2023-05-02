import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SelectionSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SelectionSortTester
{
    /**
     * Default constructor for test class SelectionSortTester
     */
    public SelectionSortTester()
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
    public void testSelectionSortArray()
    {
        int[] arr1 = {-4, -9, 0, 2, 4, 9};  //-9, -4, 0, 2, 4, 9
        int[] arr1Sorted = SelectionSorter.selectionSort(arr1);
        assertEquals(-9, arr1Sorted[0]);
        assertEquals(-4, arr1Sorted[1]);
        assertEquals(0, arr1Sorted[2]);
        assertEquals(2, arr1Sorted[3]);
        assertEquals(4, arr1Sorted[4]);
        assertEquals(9, arr1Sorted[5]);
        }
    
    @Test
    public void testSelectionSortArrayList()
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(-2);
        arr.add(2);
        arr.add(-1);
        arr.add(0);
        arr.add(5);
        arr.add(-5);
        arr.add(-9);
        arr.add(4);

        ArrayList<Integer> result = SelectionSorter.selSort(arr);
        // {-9, -5, -2, -1, 0, 2, 4, 5}
        assertEquals(-9, (int)result.get(0));
        assertEquals(-5, (int)result.get(1));
        assertEquals(-2, (int)result.get(2));
        assertEquals(-1, (int)result.get(3));
        assertEquals(0, (int)result.get(4));
        assertEquals(2, (int)result.get(5));
        assertEquals(4, (int)result.get(6));
        assertEquals(5, (int)result.get(7));
    }
    
}