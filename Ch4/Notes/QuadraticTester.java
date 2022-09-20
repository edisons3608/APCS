import static org.junit.Assert.*;
import org.junit.Test;

public class QuadraticTester {
  private static final double EPSILON = 1e-14;
  private static final double LENIENT_EPSILON = 1e-5; // for roundoff errors

  @Test
  public void testConstructors () {
    // Default constructor
    Quadratic q1 = new Quadratic();
    assertEquals(1, q1.getA(), EPSILON);
    assertEquals(1, q1.getB(), EPSILON);
    assertEquals(1, q1.getC(), EPSILON);

    // Parameterized constructor
    Quadratic q2 = new Quadratic(3, -5.5, -6.13);
    assertEquals(3, q2.getA(), EPSILON);
    assertEquals(-5.5, q2.getB(), EPSILON);
    assertEquals(-6.13, q2.getC(), EPSILON);

    Quadratic q3 = new Quadratic(-7, 4.25, -11);
    assertEquals(-7, q3.getA(), EPSILON);
    assertEquals(4.25, q3.getB(), EPSILON);
    assertEquals(-11, q3.getC(), EPSILON);
  }

  @Test
  public void testMutators () {
    // Default constructor
    Quadratic q4 = new Quadratic();
    q4.setA(5.88);
    q4.setB(12);
    q4.setC(-16);
    assertEquals(5.88, q4.getA(), EPSILON);
    assertEquals(12, q4.getB(), EPSILON);
    assertEquals(-16, q4.getC(), EPSILON);

    // Parameterized constructor
    Quadratic q5 = new Quadratic(3, 12, 36);
    q5.setA(-3.73);
    q5.setB(-30);
    q5.setC(17.47);
    assertEquals(-3.73, q5.getA(), EPSILON);
    assertEquals(-30, q5.getB(), EPSILON);
    assertEquals(17.47, q5.getC(), EPSILON);
  }

  @Test
  public void testRoots () {
    // Two real solutions
    Quadratic q6 = new Quadratic(6, 8, 2);
    assertEquals(16, q6.discriminant(), EPSILON);
    assertEquals(-1/3d, q6.findRoot1(), EPSILON);
    assertEquals(-1, q6.findRoot2(), EPSILON);

    // Two real solutions (noninteger coefficients)
    Quadratic q7 = new Quadratic(37.4806, -16.3877, -96.9804);
    assertEquals(14808.09103, q7.discriminant(), LENIENT_EPSILON);
    assertEquals(1.84197, q7.findRoot1(), LENIENT_EPSILON);
    assertEquals(-1.40474, q7.findRoot2(), LENIENT_EPSILON);

    // No real solutions
    Quadratic q8 = new Quadratic(52, 1, 87);
    assertEquals(-18095, q8.discriminant(), EPSILON);
    assertEquals(Double.NaN, q8.findRoot1(), EPSILON);
    assertEquals(Double.NaN, q8.findRoot2(), EPSILON);

    // No real solutions (noninteger coefficients)
    Quadratic q9 = new Quadratic(53.71, 0.26, 98.44);
    assertEquals(-21148.782, q9.discriminant(), LENIENT_EPSILON);
    assertEquals(Double.NaN, q9.findRoot1(), EPSILON);
    assertEquals(Double.NaN, q9.findRoot2(), EPSILON);

    // One real solution
    Quadratic q10 = new Quadratic(1, -14, 49);
    assertEquals(0, q10.discriminant(), EPSILON);
    assertEquals(7, q10.findRoot1(), EPSILON);
    assertEquals(7, q10.findRoot2(), EPSILON);

    // One real solution (noninteger coefficients)
    Quadratic q11 = new Quadratic(1, 4.24, 4.4944);
    assertEquals(0, q11.discriminant(), EPSILON);
    assertEquals(-2.12, q11.findRoot1(), LENIENT_EPSILON);
    assertEquals(-2.12, q11.findRoot2(), LENIENT_EPSILON);

  }

  @Test
  public void testSolutions () {
    // Two solutions exist
    Quadratic q14 = new Quadratic(1, 42, -1003);
    assertTrue(q14.isSolution(17, 0));
    assertTrue(q14.isSolution(-59, 0));
    assertTrue(q14.isSolution(0, -1003));
    assertTrue(q14.isSolution(32, 1365));
    assertTrue(q14.isSolution(-77, 1692));
    assertFalse(q14.isSolution(33, 0));
    assertFalse(q14.isSolution(-78, 0));
    assertFalse(q14.isSolution(42, 863));
    assertFalse(q14.isSolution(-78, -1313));


    // One soltuion exists
    Quadratic q16 = new Quadratic(1, 4, 4);
    assertTrue(q16.isSolution(-2, 0));
    assertTrue(q16.isSolution(17, 361));
    assertFalse(q16.isSolution(2, 0));

    // No solutions exist
    Quadratic q17 = new Quadratic(4, 0, 18);
    assertTrue(q17.isSolution(7, 214));
    assertFalse(q17.isSolution(-2.12132, 0));
    assertFalse(q17.isSolution(2.12132, 0));
  }

  @Test
  public void testEvaluate () {
    // Integer coefficients
    Quadratic q18 = new Quadratic(7, 3, 9);
    assertEquals(63, q18.evaluate(-3), EPSILON);
    assertEquals(889, q18.evaluate(11), EPSILON);
    assertEquals(9, q18.evaluate(0), EPSILON);
    assertEquals(223.8523, q18.evaluate(5.33), LENIENT_EPSILON);
    assertEquals(457.3188, q18.evaluate(-8.22), LENIENT_EPSILON);
    assertEquals(9.88, q18.evaluate(0.2), EPSILON);
    assertEquals(9.25, q18.evaluate(-0.5), EPSILON);
    assertEquals(1548279313, q18.evaluate(14872), EPSILON);
    assertEquals(79158303, q18.evaluate(-3363), EPSILON);
    assertEquals(328981, q18.evaluate(-217), EPSILON);

    // Noninteger coefficients
    Quadratic q19 = new Quadratic(60.41, -26.49, 70.68);
    assertEquals(13265.58, q19.evaluate(15), LENIENT_EPSILON);
    assertEquals(4148.84, q19.evaluate(-8), LENIENT_EPSILON);
    assertEquals(70.68, q19.evaluate(0), LENIENT_EPSILON);
    assertEquals(17979.5, q19.evaluate(-17), LENIENT_EPSILON);
    assertEquals(32351443.829724, q19.evaluate(-731.58), LENIENT_EPSILON);
    assertEquals(2436341.029856, q19.evaluate(201.04), LENIENT_EPSILON);
    assertEquals(100.12287441, q19.evaluate(0.951), LENIENT_EPSILON);
    assertEquals(6797370.265644, q19.evaluate(-335.22), LENIENT_EPSILON);
    assertEquals(258028897.04451, q19.evaluate(2066.93), LENIENT_EPSILON);
    assertEquals(212637135.68182, q19.evaluate(-1875.92), LENIENT_EPSILON);
    assertEquals(70.8520103936, q19.evaluate(-0.0064), LENIENT_EPSILON);
    assertEquals(5856608762.592924, q19.evaluate(9846.42), LENIENT_EPSILON);
    assertEquals(3774416976.2957807, q19.evaluate(-7904.21), LENIENT_EPSILON);
    assertEquals(1736.0937782976, q19.evaluate(5.4744), LENIENT_EPSILON);
    assertEquals(419209.36908938, q19.evaluate(83.5156), LENIENT_EPSILON);
    assertEquals(4292754920.730341, q19.evaluate(-8429.51), LENIENT_EPSILON);
  }
}