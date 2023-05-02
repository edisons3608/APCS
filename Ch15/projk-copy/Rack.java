
/**
 * Write a description of class Rack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rack
{
    private Vial[][] vials;
    public Rack(){
        vials = new Vial[3][8];
    }

    public boolean add(Vial vial){
        for(int row = 0;row<3;row++){
            for(int col = 0;col<8;col++){
                if(vials[row][col] == null){
                    vials[row][col] = vial;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean add(Vial vial,int row, int col){
        if(vials[row][col] != null){
            return false;
        }
        vials[row][col]= vial;
        return true;
    }

    public int count(){
        int count = 0;
        for(int row = 0;row<3;row++){
            for(int col = 0;col<8;col++){
                if(vials[row][col] != null){
                    count++;
                }
            }
        }
        return count;
    }

    public double getQuantity(String potionName){
        double sum = 0;
        for(int row = 0;row<3;row++){
            for(int col = 0;col<8;col++){
                if(vials[row][col] != null){
                    sum+=vials[row][col].getQuantity(potionName);
                }
            }
        }
        return sum;
    }

    public double getQuantity(){
        double sum = 0;
        for(int row = 0;row<3;row++){
            for(int col = 0;col<8;col++){
                if(vials[row][col] != null){
                    sum+=vials[row][col].getQuantity();
                }
            }
        }
        return sum;
    }

    public Vial remove(int row, int col){
        if(vials[row][col] == null){
            return null;
        }
        Vial removed = vials[row][col];
        vials[row][col] = null;
        return removed;
    }

    public void consolidate(){
        for(int x = 23;x>=0;x--){
            //System.out.println(x/8+" "+x%8+"\n");
            if(vials[x/8][x%8] == null){
                for(int y = x;y<23;y++){
                    vials[y/8][y%8] = vials[(y+1)/8][(y+1)%8];
                }
                vials[2][7] = null;
            }
        }

    }

    public String toString(){
        String returnStr = "";
        for(int row = 0;row<3;row++){
            for(int col = 0;col<8;col++){
                if(vials[row][col] != null){
                    returnStr += "Row "+row+" Col "+col+"\n";
                    returnStr += vials[row][col].toString()+"\n\n";

                }
            }
        }
        if(returnStr.equals("")){
            return "";
        }
        //System.out.println(returnStr.substring(0,returnStr.length()-2));
        return returnStr.substring(0,returnStr.length()-2);
    }
}
