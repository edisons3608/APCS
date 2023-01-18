import java.util.ArrayList;
/**
 * Polygon: a collection of x and y coordinates in a filled 2D Array of ints.
 * For example: 
 * 
 *   2   3
 *   4   -1
 *  -5   -2
 *  
 *  would represent a triangle in this class with endpoints at (2, 3) (4, -1) and (-5, -2)
 *  
 *  
 *  Complete the methods of the Polygon class
 *  v1
 */


public class Polygon
{
    private int[][] coordinates;

    /**
     * Default Constructor 
     */    
    public Polygon()
    { 
        int[][] temp = {{1,2}, {3,4}, {0,-5}, {-2,6}};
        coordinates = temp;
    }


    /**
     * Parameterized Constructor – creates Polygon from parameter values
     * precondition:  pairs.size() is an even number
     */
    public Polygon(ArrayList<Integer> pairs)

    { 
        coordinates = new int[pairs.size()/2][2];
        int count = 0;
        for(int x = 0;x<pairs.size();x=x+2){
            
            coordinates[count][0] = pairs.get(x);
            coordinates[count][1] = pairs.get(x+1);
            
            
            count++;
            
        }

    }


    /**
     * Getter method to get a coordinate at a specified row and col in coordinates.
     * 
     * */
     public int getCoordinate(int row, int col)
     {
         return coordinates[row][col];  //replace this
     }
    
    /**
     * Add a new coordinate pair to the end of the Polygon 
     * postcondition: coordinates will be on row larger
     */
    public void add(int x, int y)
    { 
        int[][] copy = coordinates;
        
        coordinates = new int[coordinates.length+1][2];
        
        for(int i = 0;i<copy.length;i++){
            coordinates[i][0] = copy[i][0];
            coordinates[i][1] = copy[i][1];
            
        }
        coordinates[coordinates.length-1][0] = x;
        coordinates[coordinates.length-1][1] = y;
        
        

    }


    /**
     * contains: identify if data contains the indicated digit 
     *     as either coordinate in the ordered pair
     */    
    public boolean contains(int number)    
    {
        for(int row = 0;row<coordinates.length;row++){
            for(int col = 0;col<coordinates[0].length;col++){
                if(coordinates[row][col] == number){
                    return true;
                }
            }
        }
        return false;
    }
    
    
    /**
     * maximumDistance: identify the coordinates that are the farthest 
     *     from the origin and return the pair as an array consisting 
     *     of the x and y coordinates. If there is a tie, return the 
     *     one with the lowest row number.
     * precondition: There is at least one row of data in coordinates
     */    
    public int[] maximumDistance()
    {
        int[] optimal = new int[2];
        optimal[0] = coordinates[0][0];
        optimal[1] = coordinates[0][1];
        double dist = Math.sqrt(coordinates[0][0]*coordinates[0][0]+coordinates[0][1]*coordinates[0][1]);
        for(int x = 1;x<coordinates.length;x++){
            if(Math.sqrt(coordinates[x][0]*coordinates[x][0]+coordinates[x][1]*coordinates[x][1]) > dist){
                optimal[0] = coordinates[x][0];
                optimal[1] = coordinates[x][1];
                
                                
            }
            else if(Math.sqrt(coordinates[x][0]*coordinates[x][0]+coordinates[x][1]*coordinates[x][1]) == dist && coordinates[x][0] < optimal[0]){
                optimal[0] = coordinates[x][0];
                optimal[1] = coordinates[x][1];
                                
            }
        }
        return optimal;
    }


    /**
     * BONUS!
     * 
     * range: identify the range of the x and y coordinates and return
     *     it as an ordered pair.
     *     For example: {{5,2}, {17,4}, {2,-6}} returns {15, 10}
     * precondition: coordinates has at least 2 rows of data in it.
     */    
    public int[] range()
    {
         int minX = coordinates[0][0];
         int maxX = coordinates[0][0];
         int minY = coordinates[0][1];
         int maxY = coordinates[0][1];
         
         for(int x = 1;x<coordinates.length;x++){
             if(coordinates[x][0] < minX){
                 minX = coordinates[x][0];
             }
             if(coordinates[x][0] > maxX){
                 maxX = coordinates[x][0];
             }
             if(coordinates[x][1] < minY){
                 minY = coordinates[x][1];
             }
             if(coordinates[x][1] > maxY){
                 maxY = coordinates[x][1];
             }
             
         }
         int[] returnCoords = new int[2];
         returnCoords[0] = maxX-minX;
         returnCoords[1] = maxY-minY;
         return returnCoords;
    }
}

