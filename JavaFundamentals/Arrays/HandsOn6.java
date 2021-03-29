package JavaFundamentals.Arrays;

import java.util.Random;

public class HandsOn6 {
    public static void main(String[] args) {
        int[] randomNumberArray=new int[20];
        Random ran=new Random();
        for(int i=0;i<20;i++){
            randomNumberArray[i]=ran.nextInt(101);
        }
        System.out.println("Array before sorting");
        for(int i=0;i<20;i++){
            System.out.print(randomNumberArray[i]+" ");
        }
        sortArray(randomNumberArray);
        System.out.println("\nArray after sorting");
        for(int i=0;i<20;i++){
            System.out.print(randomNumberArray[i]+" ");
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
