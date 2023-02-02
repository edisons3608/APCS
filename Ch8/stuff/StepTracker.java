
/**
 * Write a description of class StepTracker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class StepTracker
{
    private int minSteps;
    private ArrayList<Integer> tracker;
    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        tracker = new ArrayList<Integer>();
    }
    public void addDailySteps(int numSteps){
        tracker.add(numSteps);
    }
    public int activeDays(){
        int active = 0;
        for(int day:tracker){
            if(day >= minSteps){
                active++;
            }
        }
        return active;
    }
    public double averageSteps(){
        if(tracker.size() == 0){return 0;};
        int sum = 0;
        for(int day:tracker){
            sum += day;
        }
        return sum/tracker.size();
    }
    
}
