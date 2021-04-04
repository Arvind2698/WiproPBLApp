package groupOfCards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        System.out.println("Enter the number of cards");

        HashMap<String,ArrayList<Card>> map=new HashMap<>();

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        for(int i=0;i<input;i++){
            System.out.println("Enter Card "+i+1);
            String symbol=sc.next();
            int number=sc.nextInt();

            Card c=new Card(symbol, number);
            if(map.containsKey(symbol)){
                ArrayList<Card> list=map.get(symbol);
                list.add(c);
                map.put(symbol, list);
            }else{
                ArrayList<Card> list=new ArrayList<>();
                list.add(c);
                map.put(symbol, list);
            }
        }

        printDetails(map);
        sc.close();
    }
    public static void printDetails(HashMap<String,ArrayList<Card>> map){
        System.out.println("Distinct Symbols are: ");
        System.out.println(map.keySet().size());

        Iterator itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            ArrayList<Card> list=(ArrayList<Card>)entrySet.getValue();
            System.out.println("Cards in "+entrySet.getKey());
            int sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i).getNumber();
                System.out.println(list.get(i).getSymbol()+" "+list.get(i).getNumber());
            }

            System.out.println("Number of cards: "+list.size());
            System.out.println("Sum of numbers: "+sum);
        }
    }
}
