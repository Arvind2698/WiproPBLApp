package LogicBuilding.LC1;

import java.util.Random;

public class Activity3 {
    public static void main(String arg[]) {
        int[] randomNumber=new int[100];

        Random rand=new Random();

        for(int i=0;i<100;i++){
            randomNumber[i]=rand.nextInt(100 + 100 ) - 100;
        }

        int positiveCount=0;
        int negativeCount=0;


        for(int i=0;i<100;i++){
            if(randomNumber[i]>=0){
                positiveCount++;
            }else{
                negativeCount++;
            }
        }

        System.out.println("Number of positive number: "+positiveCount);
        System.out.println("Number of negative number: "+negativeCount);
    }
}
