package LogicBuilding.LC3;

import java.util.Random;

public class Activity3 {
    public static void main(String arg[]){
        int[] randomNumber=new int[10];

        Random rand=new Random();

        for(int i=0;i<10;i++){
            randomNumber[i]=rand.nextInt(101);
        }

        System.out.println("Array before reversing: ");
        for(int i=0;i<10;i++){
            System.out.print(randomNumber[i]+" ");
        }

        System.out.println();

        for(int i=0;i<5;i++){
            int temp=randomNumber[i];
            randomNumber[i]=randomNumber[randomNumber.length - 1 - i];
            randomNumber[randomNumber.length - 1 - i]=temp;
        }

        System.out.println("Array after reversing: ");
        for(int i=0;i<10;i++){
            System.out.print(randomNumber[i]+" ");
        }
    }
}
