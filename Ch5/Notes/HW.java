
/**
 * Write a description of class HW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HW
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        //123
        //132
        //213
        //231
        //321
        //312
        int input1 = 3;
        int input2 = 1;
        int input3 = 2;
        if(input1 <= input2 && input2 <= input3){
        	System.out.println(input1+","+input2+","+input3);
        }else if(input1 <= input3 && input3 <= input2){
        	System.out.println(input1+","+input3+","+input2);
        }else if(input2 <= input1 && input1 <= input3){
        	System.out.println(input2+","+input1+","+input3);
        }else if(input2 <= input3 && input3 <= input1){
        	System.out.println(input2+","+input3+","+input1);
        }else if(input3 <= input2 && input2 <= input1){
        	System.out.println(input3+","+input2+","+input1);
        }else if(input3 <= input1 && input1 <= input2){
        	System.out.println(input3+","+input1+","+input2);
        }
        
    }
}
