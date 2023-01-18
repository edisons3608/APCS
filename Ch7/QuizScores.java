
/**
 * Write a description of class QuizScores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class QuizScores
{
    // instance variables - replace the example below with your own
    ArrayList<Integer> scores;
    
    public QuizScores(){
        scores = new ArrayList<Integer>();
        
    }
    public QuizScores(ArrayList<Integer> copy){
        scores = new ArrayList<Integer>();
        
        for(int num:copy){
            scores.add(num);
        }
        
        
        
    }
    public void addScore(int newScore){
        scores.add(newScore);
    }
    public int numScores(){
        return scores.size();
    }
    public int getScore(int index){
        return scores.get(index);
    }
    public void addOnePoint(){
        for(int x = 0;x<scores.size();x++){
            scores.set(x,scores.get(x)+1);
        }
    }
    public void dropScores(int limit){
        for(int x = scores.size()-1;x>=0;x--){
            if(scores.get(x) < limit){
                scores.remove(x);
            }
        }
    }
}
