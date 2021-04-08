package com.arvind.JUNIT.MiniProject_OOPS;

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
                        if(store.addVideo(v)) {
                        	System.out.println("The video \""+v.getVideoName()+"\" has been successfully added to the inventory!!");
                        }
                        break;
                    case 2:
                        if(store.getStoreSize()==0){
                            System.out.print("No Videos available to rent at the moment... Please try again later");
                        }else{
                            store.listInventory();
                            System.out.print("Enter the name of the Video you wish to check-out: ");
                            String videoName=sc.next();
                            
                            if(store.doCheckOut(videoName)) {
                            	System.out.println("The video \""+videoName+"\" has been successfully checked-out");
                            }else {
                            	System.out.println("The requested book is not available at the moment... Please try another book");
                            }
                        }
                        break;
                    case 3:
                        if(store.getStoreSize()==0){
                            System.out.print("No Videos await to be returned.. Please try other facilities");
                        }else{
                            System.out.print("Enter the name of the Video you wish to return: ");
                            String videoName=sc.next();
                            if(store.doReturn(videoName)) {
                            	System.out.println("The video \""+videoName+"\" has been successfully returned");
                            }else {
                            	System.out.println("Please re-check the name of the entered book and try again");
                            }
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
                                if(store.receiveRating(videoName, rating)) {
                                	 System.out.println("The rating "+rating+"/10 has been successfully mapped to "+videoName+"\"");
                                }else {
                                	System.out.println("Please re-check the name of the entered book and try again");
                                }
                                break;
                            }else{
                                System.out.println("Please provide a rating between 0 and 10");
                            }
                        }
                        break;
                    case 5:
                        ArrayList<Video> getStore=store.listInventory();
                        System.out.println("---------------------------------------------------------------------------");
                        if(getStore.size()==0){
                            System.out.println("                No Videos Available                 ");
                        }else{
                            System.out.println("Video Name        |       Checked-out Status       |       Rating      ");
                            System.out.println("---------------------------------------------------------------------------");
                            for(int i=0;i<getStore.size();i++){
                                Video vGet=getStore.get(i);
                                System.out.println(vGet.getVideoName()+"             |       "+vGet.getCheckoutStatus()+"       |       "+vGet.getRating()+"/10");
                            }
                        }
                        System.out.println("---------------------------------------------------------------------------");
                        break;
                    default :
                }
            }
        }
        System.out.println("Thank You for Using the Video Rental Service!!");
        sc.close();
    }
}