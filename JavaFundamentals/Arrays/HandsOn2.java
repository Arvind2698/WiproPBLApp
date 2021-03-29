package JavaFundamentals.Arrays;

import java.util.Random;

public class HandsOn2 {
    public static void main(String[] args) {
        int[] randomNumberArray=new int[20];
        Random ran=new Random();
        for(int i=0;i<20;i++){
            randomNumberArray[i]=ran.nextInt(101);
        }

        int max=randomNumberArray[0];
        int min=randomNumberArray[0];
        for(int i=0;i<20;i++){
            if(randomNumberArray[i]>max){
                max=randomNumberArray[i];
            }
            if(randomNumberArray[i]<min){
                min=randomNumberArray[i];
            }
        }

        System.out.println("Largest number in array: "+max);
        System.out.println("Smallest number in array: "+min);
    }
}
