
/**
 * Write a description of class Array2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array2D
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int[][] arr = new int[3][4];
        int i = 1;
        
        for(int x = 0;x<arr.length;x++){
            for(int y=0;y<arr[0].length;y++){
                arr[x][y] = i;
                i++;
            }
        }
        //System.out.println(arr[0][3]);
        for(int x = 0;x<arr.length;x++){
            for(int y=0;y<arr[0].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
        i = 1;
        
        for(int x = 0;x<arr[0].length;x++){
            for(int y=0;y<arr.length;y++){
                arr[y][x] = i;
                i++;
            }
        }
        //System.out.println(arr[0][3]);
        for(int x = 0;x<arr.length;x++){
            for(int y=0;y<arr[0].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}
