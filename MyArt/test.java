
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
        int result = 0;
        double j = Math.sqrt(7);
        for(int i = 4; i > 0; i--)
        {
            while(j*j > 2)
            {
                j = j / (i + 1);
                result = i;
            }
            result = i + result;
        }
        System.out.println(result);

    }
}
