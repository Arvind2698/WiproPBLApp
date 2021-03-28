package LogicBuilding.LC1;

import java.util.Random;

public class Activity5 {
    public static void main(String arg[]) {
        int[] randomNumber=new int[100];

        Random rand=new Random();

        for(int i=0;i<100;i++){
            randomNumber[i]=rand.nextInt(101);
        }

        int sum=0;

        for(int i=0;i<100;i++){
            sum+=randomNumber[i];
        }

        System.out.println("Sum of the random numbers: "+sum);
    }
}
