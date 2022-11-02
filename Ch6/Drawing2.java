import java.util.ArrayList;

/**
 * Write a description of class Drawing2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drawing2
{
    // instance variables - replace the example below with your own
    public static void printBackwardsDiagonal(int n){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<n;col++){
                if(row+col == n-1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawN(int n){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<n;col++){
                if(col == 0 || col == n-1 || row == col){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawPyramid(int n){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<2*n-1;col++){
                if(col >= n-row-1 && col <= n+row-1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawRegHexagon(int n){
        double midpoint = 3*(n-1) / 2.0;
        //System.out.println(midpoint);
        for(int row = 0;row<=2*n-2;row++){

            for(int col = 0;col<=3*(n-1);col++){
                if(row == 0 || row == 2*n-2){

                    if(Math.abs(col-midpoint)*2 <= n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");

                    }

                }
                else{
                    if(row <= n-1){
                        //System.out.print("hi");
                        if(midpoint-(n-1)/2.0-row == col || midpoint+(n-1)/2.0+row == col){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                        
                    }else{
                        if(row-(n-1) == col || 3*(n-1)-(row-(n-1)) == col){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                            
                    }
                    
                }
                

            }
            System.out.println();

        }
    }
        public static void printDiamond(int n){
        ArrayList<String> repeat = new ArrayList<String>();
        int midpoint = n-1;
        int distance;
        int counter;
        for(int row = 0;row<=2*n-2;row++){
            counter = 0;
            for(int col = 0;col<=2*n-2;col++){
                if((row < midpoint && col > midpoint-row && col < midpoint + row) || (row >= midpoint && col > row-midpoint && col < 2*n-2-(row-midpoint))){
                    if(n < midpoint){
                        distance = 2*row-1;
                        
                        
                    }else{
                        distance = 2*(row-(n-1))-1;
                        
                    }
                    if(counter % 2 == 0){
                            System.out.print(" ");
                            
                    }else{
                        System.out.print("x");
                    }
                    counter += 1;
                }
                else if(col == midpoint-row || col == midpoint + row || col == row-midpoint || col == 2*n-2-(row-midpoint)){
                    System.out.print("x");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
