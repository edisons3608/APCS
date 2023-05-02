

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SearchUnitTester
{
    /**
     * Default constructor for test class SearchUnitTester
     */
    public SearchUnitTester()
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
    public void binaryTester()
    {
        int[] arr = {-99, -41, -34, -3, 0, 4, 9, 23, 24, 25, 33, 34, 65, 68, 78, 99, 101, 321, 322, 3999};  //an array with an even number of elements
        
        assertEquals(0, BinarySearcher.binarySearch(arr, -99));
        assertEquals(2, BinarySearcher.binarySearch(arr, -34));
        assertEquals(7, BinarySearcher.binarySearch(arr, 23));
        assertEquals(9, BinarySearcher.binarySearch(arr, 25));
        assertEquals(19, BinarySearcher.binarySearch(arr, 3999));
        assertEquals(-1, BinarySearcher.binarySearch(arr, 1));
        assertEquals(-1, BinarySearcher.binarySearch(arr, -101));
        
        int[] arr2 = {-2, -1, 0, 3, 6};  // an array with an odd number of elements
        assertEquals(0, BinarySearcher.binarySearch(arr2, -2));
        assertEquals(2, BinarySearcher.binarySearch(arr2, 0));
        assertEquals(4, BinarySearcher.binarySearch(arr2, 6));
        assertEquals(-1, BinarySearcher.binarySearch(arr2, -99));
        
        int[] arr3 = {};
        assertEquals(-1, BinarySearcher.binarySearch(arr3, 5));
    }
    @Test
    public void linearTester()
    {
        int[] arr = {-99, -41, -34, -3, 0, 4, 9, 23, 24, 25, 33, 34, 65, 68, 78, 99, 101, 321, 322, 3999};
        assertEquals(0, LinearSearcher.linearSearch(arr, -99));
        assertEquals(2, LinearSearcher.linearSearch(arr, -34));
        assertEquals(7, LinearSearcher.linearSearch(arr, 23));
        assertEquals(9, LinearSearcher.linearSearch(arr, 25));
        assertEquals(19, LinearSearcher.linearSearch(arr, 3999));
        assertEquals(-1, LinearSearcher.linearSearch(arr, 1));
        assertEquals(-1, LinearSearcher.linearSearch(arr, -101));
        
        int[] arr2 = {-2, -1, 0, 3, 6};  
        assertEquals(0, LinearSearcher.linearSearch(arr2, -2));
        assertEquals(2, LinearSearcher.linearSearch(arr2, 0));
        assertEquals(4, LinearSearcher.linearSearch(arr2, 6));
        assertEquals(-1, LinearSearcher.linearSearch(arr2, -99));
        
        int[] arr3 = {};
        assertEquals(-1, LinearSearcher.linearSearch(arr3, 5));
    }
}
