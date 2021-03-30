package OOPS.MiniProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Discussion:
        VideoId attribute would be useful if we were to create an association between a user and the Video that was
        rented out. Apart from that VideoId would be useful to distinguish between Videos having the same name.
        Timestamp of the time at which the Video was added could be used as an unique ID for identification.
        Instead of displaying the check-out status, only the books that are available at the time should be displayed to avoid any confusion
*/

public class VideoLauncher{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int inputOption=0;

        VideoStore store=new VideoStore();
        while(inputOption!=6){
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("\n1.Add Video\n \n2.Check-Out Video\n \n3.Return Video\n \n4.Recieve Rating\n \n5.List Inventory\n \n6.Exit\n ");
            System.out.println("Enter your choice (1..6)");
            try{
                inputOption=sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("\nInvalid Selection... Please try again!!\n");
                break;
            }
            if(inputOption<1 || inputOption>6){
                System.out.println("\nInvalid Selection... Please try again!!\n");
            }else if(inputOption==6){
                break;
            }else{
                switch(inputOption){
                    case 1:
                        System.out.print("Enter the name of the Video you wish to add: ");
                        String name=sc.next();
                        Video v=new Video(name);
                        store.addVideo(v);
                        break;
                    case 2:
                        if(store.getStoreSize()==0){
                            System.out.print("No Videos available to rent at the moment... Please try again later");
                        }else{
                            store.listInventory();
                            System.out.print("Enter the name of the Video you wish to check-out: ");
                            String videoName=sc.next();
                            store.doCheckOut(videoName);
                        }
                        break;
                    case 3:
                        if(store.getStoreSize()==0){
                            System.out.print("No Videos await to be returned.. Please try other facilities");
                        }else{
                            System.out.print("Enter the name of the Video you wish to return: ");
                            String videoName=sc.next();
                            store.doReturn(videoName);
                        }
                        break;
                    case 4:
                        int rating=-1;
                        System.out.print("Enter the name of the Video you wish to rate: ");
                        String videoName=sc.next();
                        while(rating<0 || rating>10 ){
                            System.out.print("Enter the rating you wish to give "+videoName+" : ");
                            rating=sc.nextInt();
                            if(rating>=0 && rating<=10){
                                store.receiveRating(videoName, rating);
                                break;
                            }else{
                                System.out.println("Please provide a rating between 0 and 10");
                            }
                        }
                        break;
                    case 5:
                        store.listInventory();
                        break;
                    default :
                }
            }
        }
        System.out.println("Thank You for Using the Video Rental Service!!");
        sc.close();
    }
}

class VideoStore {
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

class Video {
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
