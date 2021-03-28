package LogicBuilding.LC5;

import java.util.Random;
import java.util.TreeSet;

public class Activity2 {
    public static void main(String arg[]) {
        int[] randomNumbers=new int[10];
        // int[] randomNumbers={2,5,1,2,3,4,3,2,9,6};

        Random rand=new Random();
        for(int i=0;i<10;i++){
            randomNumbers[i]=rand.nextInt(101);
            System.out.print(randomNumbers[i]+" ");
        }

        System.out.println();
        TreeSet<Integer> set=new TreeSet<>();

        for(int i=0;i<10;i++){
            set.add(randomNumbers[i]);
        }

        System.out.println(set);
    }
}
