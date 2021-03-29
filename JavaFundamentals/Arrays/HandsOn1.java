package JavaFundamentals.Arrays;

import java.util.Random;

public class HandsOn1 {
    public static void main(String[] args) {
        int[] randomNumberArray=new int[20];
        Random ran=new Random();
        for(int i=0;i<20;i++){
            randomNumberArray[i]=ran.nextInt(101);
        }

        int sum=0;
        double avg=0;
        for(int i=0;i<20;i++){
            sum+=randomNumberArray[i];
        }
        avg=(double)sum/20;

        System.out.println("Sum of the number in array: "+sum);
        System.out.println("Average of the number in array: "+avg);
    }
}
