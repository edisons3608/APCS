public class Song {
    private String title;
    private int duration;
    private double cost;
    private boolean isInLibrary;
    public Song(){

        title = "WAP";
        duration = 0;
        cost = 1.0;
        isInLibrary = false;
    }


    public Song(String title, int duration, double cost, boolean isInLibrary) {
        this.title = title;
        this.duration = duration;
        this.cost = cost;
        this.isInLibrary = isInLibrary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isInLibrary() {
        return isInLibrary;
    }

    public void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }
}
