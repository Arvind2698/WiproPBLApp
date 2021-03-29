package JavaFundamentals.Arrays;

import java.util.Random;
import java.util.Scanner;


public class HandsOn3 {
    public static void main(String[] args) {
        int[] randomNumberArray=new int[20];
        Random ran=new Random();
        for(int i=0;i<20;i++){
            randomNumberArray[i]=ran.nextInt(101);
        }

        for(int i=0;i<20;i++){
            System.out.print(randomNumberArray[i]+" ");
        }
        System.out.println("\nEnter an element to search");

        Scanner sc=new Scanner(System.in);
        int searchElement=sc.nextInt();

        for(int i=0;i<20;i++){
            if(randomNumberArray[i]==searchElement){
                System.out.println("Element found at: "+i);
                sc.close();
                return;
            }
        }
        System.out.println("Element not found: "+ -1);

        sc.close();
    }
}
