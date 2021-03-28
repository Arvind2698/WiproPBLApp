package LogicBuilding.LC5;

import java.util.Random;
import java.util.Scanner;

public class Activity4 {
    public static void main(String arg[]) {
        int[] randomNumbers=new int[15];
        Scanner sc=new Scanner(System.in);

        Random rand=new Random();

        for(int i=0;i<15;i++){
            randomNumbers[i]=rand.nextInt(101);
        }

        int elementToFind=sc.nextInt();

        for(int i=0;i<15;i++){
            if(randomNumbers[i]==elementToFind){
                System.out.println("Element found at position "+i);
                sc.close();
                return;
            }
        }

        System.out.println("Element not found");

        sc.close();
    }
}
