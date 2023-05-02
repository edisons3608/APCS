
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int val = 48;
        int div = 6;
        while ((val % 2 == 0) && div > 0)
        {
            if (val % div == 0)
            {
                System.out.print(val + " ");
            }
            val /= 2;
            div--;
        }
    }
}
