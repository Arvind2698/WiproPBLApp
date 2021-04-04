package setOfCards;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] arg){

        TreeSet<Card> set=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        boolean status=true;
        while(status){
            System.out.println("Enter Card");
            String symbol=sc.next();
            int number=sc.nextInt();
            status=addToSet(symbol,number,set);
        }
        // System.out.println(set);
        displayCards(set);
    }
    public static boolean addToSet(String symbol,int number,TreeSet<Card> set){
        Card c=new Card(symbol,number);

        if(set.size()==0){
            set.add(c);
            return true;
        }else{
            if(set.size()==5){
                return false;
            }else{
                Iterator<Card> itr=set.iterator();
                int checker=0;
                while(itr.hasNext()){
                    Card cGet=itr.next();
                    if(cGet.getSymbol().equals(symbol)){
                        checker++;
                        break;
                    }
                }
                if(checker==0){
                    set.add(c);
                }
                return true;
            }
        }
    }

    public static void displayCards(TreeSet<Card> set){
        System.out.println("Cards in set are: ");
        Iterator<Card> itr=set.iterator();
        int checker=0;
        while(itr.hasNext()){
            Card cGet=itr.next();
            System.out.println(cGet.getSymbol()+" "+cGet.getNumber());
        }
    }
}
