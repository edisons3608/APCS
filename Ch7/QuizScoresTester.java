import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuizScoresTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class QuizScoresTester
{
    /**
     * Default constructor for test class QuizScoresTester
     */
    public QuizScoresTester()
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
    public void testConstructorsAddScoreGetScore()
    {
        QuizScores q1 = new QuizScores();
        q1.addScore(55);
        q1.addScore(95);
        assertEquals(2, q1.numScores());
        assertEquals(55, q1.getScore(0));
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(60);
        values.add(65);
        values.add(70);
        values.add(80);
        values.add(85);
        values.add(90);
        QuizScores q2 = new QuizScores(values);
        assertEquals(6, q2.numScores());
        assertEquals(60, q2.getScore(0));
        assertEquals(80, q2.getScore(3));
    }

    @Test
    public void testAddOnePoint()
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(60);
        values.add(65);
        values.add(70);
        values.add(80);
        values.add(85);
        values.add(90);
        QuizScores q2 = new QuizScores(values);
        q2.addOnePoint();
        assertEquals(61, q2.getScore(0));
        assertEquals(81, q2.getScore(3));
        assertEquals(91, q2.getScore(5));
    }

    @Test
    public void testDropScores()
    {
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(60);
        values.add(65);
        values.add(70);
        values.add(80);
        values.add(85);
        values.add(90);
        QuizScores q2 = new QuizScores(values);
        q2.dropScores(70);
        assertEquals(4, q2.numScores());
        assertEquals(70, q2.getScore(0));
        assertEquals(80, q2.getScore(1));
        assertEquals(90, q2.getScore(3));
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
