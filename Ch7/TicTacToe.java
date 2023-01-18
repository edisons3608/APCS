
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToe
{
    // instance variables - replace the example below with your own
    private String[][] board;
    
    public TicTacToe(){
        board = new String[3][3];
        for(int x = 0;x<3;x++){
            for(int y = 0;y<3;y++){
                board[x][y] = " ";
            }
        }
    }
    
    public void print(){
        System.out.println(board[0][0] + " | "+ board[0][1] + " | " + board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0] + " | "+ board[1][1] + " | " + board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0] + " | "+ board[2][1] + " | " + board[2][2]);
    }
    public boolean add(int row, int col, String letter){
        if(!board[row][col].equals(" ")){
            return false;
        }
        
        board[row][col] = letter;
        
        return true;
    }
    
    public String gameOver(){
        for(int x = 0;x<3;x++){
            if(board[x][0].equals(board[x][1]) && board[x][1].equals(board[x][2])){
                return board[x][0];
            }
            if(board[0][x].equals(board[1][x]) && board[1][x].equals(board[2][x])){
                return board[0][x];
            }
        }
        if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])){
            return board[0][0];
        }
        if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
            return board[0][2];
        }
        
        
        for(int x = 0;x<3;x++){
            for(int y = 0;y<3;y++){
                if(board[x][y].equals(" ")){
                    return "cat game";
                }
            }
        }
        return "not yet";
        
        
    }
}

