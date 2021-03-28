package LogicBuilding.LC5;

import java.util.LinkedList;
import java.util.Random;

public class Activity3 {
    public static void main(String[] args) {
        int[] randomNumbers=new int[25];
        Random rand=new Random();
        for(int i=0;i<25;i++){
            randomNumbers[i]=rand.nextInt(101);
        }


        int[] tempArray=randomNumbers.clone();
        int n=tempArray.length-1;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (tempArray[j] < tempArray[j+1])
                {
                    int temp = tempArray[j];
                    tempArray[j] = tempArray[j+1];
                    tempArray[j+1] = temp;
                }
            }
        }

        int maxElement=tempArray[0];

        LinkedList<Integer> maxElementPosition=new LinkedList<>();

        for(int i=0;i<randomNumbers.length;i++){
            if(randomNumbers[i]==maxElement){
                maxElementPosition.add(i);
            }
        }

        if(maxElementPosition.size()>1){
            System.out.println(maxElement+" first occurs at "+maxElementPosition.getFirst());
            System.out.println(maxElement+" last occurs at "+maxElementPosition.getLast());
        }else{
            System.out.println(maxElement+" occurs at "+maxElementPosition.getFirst());
        }

    }
}
