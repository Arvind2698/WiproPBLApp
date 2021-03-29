package JavaFundamentals.Arrays;

import java.util.Random;

public class HandsOn5 {
    public static void main(String[] args) {
        int[] randomNumberArray=new int[20];
        Random ran=new Random();
        for(int i=0;i<20;i++){
            randomNumberArray[i]=ran.nextInt(101);
        }
        for(int i=0;i<20;i++){
            System.out.print(randomNumberArray[i]+" ");
        }
        sortArray(randomNumberArray);

        if(randomNumberArray.length>=4){
            System.out.println("\nThe largest two numbers were: "+randomNumberArray[randomNumberArray.length-1]+" and "+randomNumberArray[randomNumberArray.length-2]);
            System.out.println("The smallest two numbers were: "+randomNumberArray[0]+" and "+randomNumberArray[1]);
        }else if(randomNumberArray.length==2 || randomNumberArray.length==3){
            System.out.println("The largest number was: "+randomNumberArray[randomNumberArray.length-1]);
            System.out.println("The largest number was: "+randomNumberArray[0]);
        }
    }
    public static void sortArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
