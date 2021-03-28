package LogicBuilding.LC5;

import java.util.Random;

public class Activity1 {
    public static void main(String arg[]) {
        int[] randomNumbers=new int[10];

        Random rand=new Random();

        for(int i=0;i<10;i++){
            randomNumbers[i]=rand.nextInt(101);
        }
        int n = randomNumbers.length;

        System.out.println("Before sorting");
        for (int i = 0; i < n; i++){
            System.out.print(randomNumbers[i]+" ");
        }

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (randomNumbers[j] < randomNumbers[j+1])
                {
                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j+1];
                    randomNumbers[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (int i = 0; i < n; i++){
            System.out.print(randomNumbers[i]+" ");
        }
    }
}
