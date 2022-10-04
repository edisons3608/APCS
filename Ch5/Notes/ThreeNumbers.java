
/**
 * Write a description of class ThreeNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * @v1
 */
public class ThreeNumbers
{
    // instance variables - replace the example below with your own
    private int n1;
    private int n2;
    private int n3;
    public final double EPSILON = 1E-4;
    public ThreeNumbers(){
        n1 = 1;
        n2 = 2;
        n3 = 3;
    }
    public ThreeNumbers(int n1,int n2,int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public int getNum1(){
        return n1;
        
    }
    public int getNum2(){
        return n2;
    }
    public int getNum3(){
        return n3;
    }
    public void setNum1(int n1){
        this.n1 = n1;
    }
    public void setNum2(int n2){
        this.n2 = n2;
    }
    public void setNum3(int n3){
        this.n3 = n3;
    }
    public boolean contains(int testingNum){
        if(testingNum == n1 || testingNum == n2 || testingNum == n3){
            return true;
        }else{
            return false;
        }
    }
    public boolean isInOrder(){
        return n1 <= n2 && n2 <= n3;
    }
    public int getLargest(){
        if(n1 >= n2 && n1 >= n3){
            return n1;
        }
        else if(n2 >= n1 && n2 >= n3){
            return n2;
        }
        else{
            return n3;
        }
    }
    
    public boolean isPythagoreanTriple(){
        if(n1 > 0 || n2 > 0 || n3 > 0){
            return Math.pow(sort()[0],2) + Math.pow(sort()[1],2) == Math.pow(getLargest(),2);
        }else{
            return false;
        }
        
    }
    public int[] sort(){
        int[] numArray = {n1,n2,n3};
        int holder;
        for(int x = 0;x<numArray.length;x++){
            for(int y = 0;y<numArray.length-1;y++){
                if(numArray[y] > numArray[y+1]){
                    holder = numArray[y];
                    numArray[y] = numArray[y+1];
                    numArray[y+1] = holder;
                }
            }
        }
        return numArray;
    }
    public boolean isGeometricSequence(){
        return Math.abs((double)n1/n2 - (double)n2/n3) <= EPSILON;
 
    }
    public void sortNums(){
        int[] sorted = sort();
        this.n1 = sorted[0];
        this.n2 = sorted[1];
        this.n3 = sorted[2];
    }
    public int numberOfRealQuadraticSolutions(){
        int discriminant = n2*n2-4*n1*n3;
        if(discriminant > 0){
            return 2;
        }else if(discriminant == 0){
            return 1;
        }
        else{
            return 0;
        }
        
    }
}
