public class Combination
{
    private int[] nums;    
    /**
     * Constructor for objects of class Combination
     */
    public Combination()
    {   
        nums = new int[3];
        for(int x = 0;x<3;x++){
            nums[x] = (int)(Math.random()*40);
        }
              
    }

    public void setCombination(int a, int b, int c)
    {
        nums[0] = a;
        nums[1] = b;
        nums[2] = c;
    }
    
    public String toString()
    {
        return nums[0] + " - " + nums[1] + " - " + nums[2];
    }
    
    public int get(int position)
    {
        if(position == 0)
        {
            return nums[0];
        }
        if(position == 1)
        {
            return nums[1];
        }
        return nums[2];
    }
}
