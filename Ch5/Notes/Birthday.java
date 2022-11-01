
/**
 * Write a description of class Birthday here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Birthday
{
    // instance variables - replace the example below with your own
    public static boolean contains(int[] arr, int checkValue){
        for(int x = 0;x<arr.length;x++){
            if(arr[x] == checkValue){
                return true;
            }
        }
        return false;
    }
    public static boolean isValidBirthdate(String birthday){
        if(birthday.indexOf("/") == 2 && birthday.indexOf("/",3) == 5){
            int month = Integer.parseInt(birthday.substring(0,2));
            int day = Integer.parseInt(birthday.substring(3,5));
            int year = Integer.parseInt(birthday.substring(6));
            //mm/dd/yyyy
            int maxDays;
            if(month == 2){
                maxDays = year % 4 == 0 ? 29 : 28;
            }else{
                int[] months31 = {1,3,5,7,8,10,12};
                maxDays = contains(months31,month) == true ? 31 : 30;
            }
            if(year >= 1900 && year <= 2100){
                if(day > 0 && day <= maxDays){
                    return true;
                }
            }
        }
        return false;
    }
}
