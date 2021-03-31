package videoLibrary;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store;

    public VideoStore(){
        this.store=new ArrayList<>();
    }
    public void addVideo(Video v){
        store.add(v);
        System.out.println("The video \""+v.getVideoName()+"\" has been successfully added to the inventory!!");
    }

    public void doCheckOut(String name){
        for(int i=0;i<store.size();i++){
            Video v=store.get(i);
            if(v.getVideoName().toLowerCase().equals(name.toLowerCase()) && v.getCheckoutStatus()==false){
                v.doCheckOut();
                System.out.println("The video \""+name+"\" has been successfully checked-out");
                return;
            }
        }
        System.out.println("The requested book is not available at the moment... Please try another book");
    }
    public void doReturn(String name){
        for(int i=0;i<store.size();i++){
            Video v=store.get(i);
            if(v.getVideoName().toLowerCase().equals(name.toLowerCase()) && v.getCheckoutStatus()==true){
                v.doReturn();
                System.out.println("The video \""+name+"\" has been successfully returned");
                return;
            }
        }
        System.out.println("Please re-check the name of the entered book and try again");
    }
    public void receiveRating(String name,int rating){
        for(int i=0;i<store.size();i++){
            Video v=store.get(i);
            if(v.getVideoName().toLowerCase().equals(name.toLowerCase())){
                v.setRating(rating);
                System.out.println("The rating "+rating+"/10 has been successfully mapped to "+name+"\"");
                return;
            }
        }
        System.out.println("Please re-check the name of the entered book and try again");
    }
    public void listInventory(){
        System.out.println("---------------------------------------------------------------------------");
        if(store.size()==0){
            System.out.println("                No Videos Available                 ");
        }else{
            System.out.println("Video Name        |       Checked-out Status       |       Rating      ");
            System.out.println("---------------------------------------------------------------------------");
            for(int i=0;i<store.size();i++){
                Video v=store.get(i);
                System.out.println(v.getVideoName()+"             |       "+v.getCheckoutStatus()+"       |       "+v.getRating()+"/10");
            }
        }
        System.out.println("---------------------------------------------------------------------------");
    }
    public int getStoreSize(){
        return this.store.size();
    }
}
