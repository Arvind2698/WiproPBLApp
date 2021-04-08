package videoLibrary;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store;

    public VideoStore(){
        this.store=new ArrayList<>();
    }
    public boolean addVideo(Video v){
        store.add(v);
        return true;
    }

    public boolean doCheckOut(String name){
        for(int i=0;i<store.size();i++){
            Video v=store.get(i);
            if(v.getVideoName().toLowerCase().equals(name.toLowerCase()) && v.getCheckoutStatus()==false){
                v.doCheckOut();
                return true;
            }
        }
        return false;
    }
    
    public boolean doReturn(String name){
        for(int i=0;i<store.size();i++){
            Video v=store.get(i);
            if(v.getVideoName().toLowerCase().equals(name.toLowerCase()) && v.getCheckoutStatus()==true){
                v.doReturn();
                return true;
            }
        }
        return false;
    }
    
    public boolean receiveRating(String name,int rating){
        for(int i=0;i<store.size();i++){
            Video v=store.get(i);
            if(v.getVideoName().toLowerCase().equals(name.toLowerCase())){
                v.setRating(rating);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Video> listInventory(){
        return this.store;
    }
    public int getStoreSize(){
        return this.store.size();
    }
}
