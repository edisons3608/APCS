
/**
 * Write a description of class bozo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bozo
{
    // instance variables - replace the example below with your own
    public static void drawTriangle(int height){
        String returnLine = "";
        for(int x = 0;x<height;x++){
            returnLine += "*";
            System.out.println(returnLine);
        }
        
    }
    public static void vPrinting(int height){
        int count = 1+(height-1)*2;
        
        int left = 0;
        int right = 0;
        //System.out.println(count);
        String returnStr = "";
        for(int x = 0;x<height;x++){
            returnStr = "";
            left = x;
            right = count-1-x;
            
            for(int index = 0;index<count;index++){
                if(index == left || index == right){
                    returnStr += "V";
                }else{
                    returnStr += " ";
                }
            }
            System.out.println(returnStr);
        }
        
    }
}
