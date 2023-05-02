

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MergeSortTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MergeSortTester
{
    /**
     * Default constructor for test class MergeSortTester
     */
    public MergeSortTester()
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
    public void mergeSortTester()
    {
        int[] arr1 = {-4, 9, -9, 4, 2, 0};  //-9, -4, 0, 2, 4, 9
        int[] arr1Sorted = MergeSorter.mergeSort(arr1);
        assertEquals(-9, arr1Sorted[0]);
        assertEquals(-4, arr1Sorted[1]);
        assertEquals(0, arr1Sorted[2]);
        assertEquals(2, arr1Sorted[3]);
        assertEquals(4, arr1Sorted[4]);
        assertEquals(9, arr1Sorted[5]);
        
        int[] arr2 = {3, 10, 15, 8, 12, 13, 20};
        int[] arr2Sorted = MergeSorter.mergeSort(arr2);
        assertEquals(3, arr2Sorted[0]);
        assertEquals(8, arr2Sorted[1]);
        assertEquals(10, arr2Sorted[2]);
        assertEquals(12, arr2Sorted[3]);
        assertEquals(13, arr2Sorted[4]);
        assertEquals(15, arr2Sorted[5]);
        assertEquals(20, arr2Sorted[6]);
        
        
    }
}
