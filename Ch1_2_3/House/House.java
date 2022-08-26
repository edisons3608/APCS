public class House {
    private double value;
    private String city;
    public House(){
        value = 100000;
        city = "Chicago";
    }
    public House(double inVal,String inCity){
        value = inVal;
        city = inCity;
    }
    public double getValue(){
        return value;
    }
    public String getCity(){
        return city;
    }
    public void setValue(double newValue){
        value = newValue;
    }

    public void setCity(String newCity) {
        city = newCity;
    }
    public void increaseValue(){
        value *= 1.02;
    }
    public void increaseValue(double increaseAmount){
        value *= (increaseAmount+100)/100;
    }

}
