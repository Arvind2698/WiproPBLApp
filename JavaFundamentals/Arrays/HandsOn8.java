package JavaFundamentals.Arrays;

import java.util.Random;

public class HandsOn8 {
    public static void main(String[] args) {
        int[] randomNumberArray=new int[20];
        Random ran=new Random();
        for(int i=0;i<randomNumberArray.length;i++){
            randomNumberArray[i]=ran.nextInt(11);
        }
        System.out.println("Original Array: ");
        for(int i=0;i<randomNumberArray.length;i++){
            System.out.print(randomNumberArray[i]+" ");
        }

        int sumBeforeRange=0;
        int sumInRange=0;
        boolean inRange=false;

        for(int i=0;i<randomNumberArray.length;i++){
            if(randomNumberArray[i]!=6 && inRange==false){
                sumBeforeRange+=randomNumberArray[i];
            }else if(randomNumberArray[i]==7 && inRange==true){
                sumInRange+=randomNumberArray[i];
                inRange=false;
            }else if(randomNumberArray[i]==6 && inRange==false){
                sumInRange+=randomNumberArray[i];
                inRange=true;
            }else if(inRange==true){
                sumInRange+=randomNumberArray[i];
            }
        }

        if(inRange){
            sumBeforeRange+=sumInRange;
        }

        System.out.println("\nSum of the numbers in array excluding the numbers between 6 and 7: "+sumBeforeRange);
    }
}
