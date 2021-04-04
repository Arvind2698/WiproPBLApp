package setOfBox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of boxes: ");
        int num=sc.nextInt();
        HashSet<Box> setOfBox=new HashSet<>();
        for(int i=0;i<num;i++){
            System.out.println("Enter the length");
            double length=sc.nextDouble();
            System.out.println("Enter the width");
            double width=sc.nextDouble();
            System.out.println("Enter the height");
            double height=sc.nextDouble();
            Box b=new Box(length, width, height);
            addBox(b, setOfBox);
        }

        System.out.println("Unique boxes in set are: ");
        display(setOfBox);
    }
    public static void addBox(Box b,HashSet<Box> setOfBox){
        Iterator<Box> itr=setOfBox.iterator();

        boolean exists=false;
        while(itr.hasNext()){
            Box bGet=itr.next();
            if(bGet.getVolume()==b.getVolume()){
                exists=true;
                break;
            }
        }
        if(!exists){
            setOfBox.add(b);
        }
    }
    public static void display(HashSet<Box> setOfBox){
        Iterator<Box> itr=setOfBox.iterator();

        while(itr.hasNext()){
            Box bGet=itr.next();
            bGet.display();
        }
    }
}
