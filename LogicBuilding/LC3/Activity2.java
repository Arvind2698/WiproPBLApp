package LogicBuilding.LC3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Activity2 {
    public static void main(String arg[]) {
        ArrayList<Integer> randomNumber=new ArrayList<>();

        Random rand=new Random();

        for(int i=0;i<20;i++){
            randomNumber.add(rand.nextInt(101));
        }

        System.out.println(randomNumber);

        Collections.sort(randomNumber);

        System.out.println(randomNumber);

        System.out.println("Largest three numbers are: "+randomNumber.get(randomNumber.size()-1)+","+randomNumber.get(randomNumber.size()-2)+","+randomNumber.get(randomNumber.size()-3));
        System.out.println("Largest three numbers are: "+randomNumber.get(0)+","+randomNumber.get(1)+","+randomNumber.get(2));
    }
}
