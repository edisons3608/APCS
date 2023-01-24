
/**
 * Write a description of class ExamScores here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * v1
 */
public class ExamScores
{
    // instance variables - replace the example below with your own
    private String[][] responses;
    private String[] key;
    public ExamScores(String[][] newResponses,String[] newKey){
        responses = new String[newResponses.length][newResponses[0].length];
        key = new String[newKey.length];
        for(int x = 0;x<newResponses.length;x++){
            for(int y = 0;y<newResponses[0].length;y++){
                responses[x][y] = newResponses[x][y];
            }
        }
        for(int x = 0;x<newKey.length;x++){
            key[x] = newKey[x];
        }
        
    }
    public int numberCorrect(int k){
        int correct = 0;
        for(int x = 0;x< responses[k].length;x++){
            if(responses[k][x].equals(key[x])){
                correct++;
            }
        }
        return correct;
    }
    public int[] correctSummary(){
        int[] students = new int[responses.length];
        for(int y = 0;y<responses.length;y++){
            int correct = 0;
            for(int x = 0;x< responses[0].length;x++){
                if(responses[y][x].equals(key[x])){
                    correct++;
                }
            }
            students[y] = correct;
        }
        return students;
    }
    public double classAverage(){
        int[] students = correctSummary();

        
        double sum = 0;
        for(int x : students){
            sum += x;
        }
        return Math.round(10*sum/responses.length)/10.0;
        
        
        
        
    }
    public void printSummary(){
        int[] students = correctSummary();
        for(int x = 0;x<students.length;x++){
            System.out.println("Student "+x+" got "+students[x]+"/"+responses[0].length+" correct");
        }
    }
}
