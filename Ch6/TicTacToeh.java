//import java.util.Scanner;
//import java.util.Random;
import java.util.*;
public class TicTacToeh {

    public static int makeBestOption(String[] board){

        int optimal = -10000;
        int move = -1;
        //No best move.
        String[] anotherBoard = board;
        //Copy
        for(int index = 0; index < 9;index++){
            if(anotherBoard[index] == "-"){

                anotherBoard[index] = "x";
                int ranking = algo(anotherBoard,false,0);
                anotherBoard[index] = "-";
                if(ranking > optimal){
                    optimal = ranking;
                    move = index;
                }
            }

        }

        return move;
        

    }
    public static int algo(String[] board, boolean turn,int depth){
        if(over(board) == "user"){
            //System.out.println("Lost");
            return -10+depth;
        }
        else if(over(board) == "computer"){
            return 10-depth;
        }
        else if(over(board) == "tie"){
           //System.out.println("pass");
            return 0;
        }
        ArrayList<Integer> options = new ArrayList<Integer>();
        String[] anotherBoard = board;
        //Creating a copy of the board.
        Integer highest = -10000;
        for(int i = 0; i < 9;i++){
            if(anotherBoard[i] == "-"){
                if(turn){
                    anotherBoard[i] = "x";

                }else{
                    anotherBoard[i] = "o";
                }
                options.add(algo(anotherBoard,!turn,depth+1));
                anotherBoard[i] = "-";
            }
        }
        if(turn){
            highest = Collections.max(options);
            return highest;

        }else{
            highest = Collections.min(options);
            return highest;
        }

    };


    public static String over(String[] board){
        String winner = "none";
        if(board[0] == board[1] && board[1] == board[2] && board[2] != "-"){
            winner = board[0];
        }
        if(board[3] == board[4] && board[4] == board[5] && board[3] != "-"){
            winner = board[4];
        
        }
        if(board[6] == board[7] && board[7] == board[8] && board[6] != "-"){
            winner = board[7];
        
        }
        if(board[0] == board[3] && board[3] == board[6] && board[3] != "-"){
            winner = board[6];
        
        }
        if(board[1] == board[4] && board[4] == board[7] && board[4] != "-"){
            winner = board[1];
        
        }
        if(board[2] == board[5] && board[5] == board[8] && board[5] != "-"){
            winner = board[5];
        
        }
        if(board[0] == board[4] && board[4] == board[8] && board[8] != "-"){
            winner = board[8];
        
        }
        if(board[2] == board[4] && board[4] == board[6] && board[2] != "-"){
            winner = board[4];
        
        }
        if(winner == "x"){
            winner = "computer";
        }else if(winner == "o"){
            winner = "user";

        }
        else if(winner == "none"){

            int counting = 0;
            for(int i = 0;i<9;i++){
                if(board[i] == "-"){
                    counting += 1;
                }
                
            }
            if(counting == 0){
                winner = "tie";
            
            }
        }
        return winner;
    }   
    public static void revealing(String[] board){
        System.out.println(board[0]+"|"+board[1]+"|"+board[2]);
        System.out.println("-----");
        System.out.println(board[3]+"|"+board[4]+"|"+board[5]);
        System.out.println("-----");
        System.out.println(board[6]+"|"+board[7]+"|"+board[8]+"\n");
    };
    public static void main(String[] args){
        Scanner myO = new Scanner(System.in);
        Random rnd = new Random();
        int choice = rnd.nextInt(2);
        String[] arraying = {"-","-","-","-","-","-","-","-","-"};
        String current;
        //choice = 0;
        if(choice == 0){
            //It's really reverse because the code switches later
            current = "computer";
        }else{
            current = "user";
        }
        current = "user";
        String winner = "none";
        boolean result = true;
        while(result == true){
            if(current == "computer"){
                current = "user";
            }else{
                current = "computer";
            }
            if(current == "computer"){
                int guess = makeBestOption(arraying);
                arraying[guess] = "x";
            }
            if(current == "user"){
                System.out.println("Your turn.");
                String answer = myO.nextLine();
                while (arraying[Integer.parseInt(answer) - 1] != "-"){
                    System.out.println("Your guess seems to have been taken.");
                    answer = myO.nextLine();
                }
                arraying[Integer.parseInt(answer) - 1] = "o";
            }
            revealing(arraying);
            winner = over(arraying);
            if(winner != "none"){
                result = false;
                System.out.println(winner);
            }

        }
    myO.close();
    };
}
