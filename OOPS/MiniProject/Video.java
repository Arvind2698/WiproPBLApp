package videoLibrary;

public class Video {
    private String videoName;
    private boolean checkOutStatus;
    private int rating;

    public Video(String videoName){
        this.videoName=videoName;
    }

    public String getVideoName(){
        return this.videoName;
    }
    public int getRating(){
        return this.rating;
    }
    public boolean getCheckoutStatus(){
        return this.checkOutStatus;
    }

    public void setRating(int rating){
        this.rating=rating;
    }
    public void setCheckOutStatus(boolean checkOutStatus){
        this.checkOutStatus=checkOutStatus;
    }

    public void doCheckOut(){
        this.setCheckOutStatus(true);
    }
    public void doReturn(){
        this.setCheckOutStatus(false);
    }
    public void receiveRating(int rating){
        this.setRating(rating);
    }
}
