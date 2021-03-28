package LogicBuilding.LC3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Activity4 {
    public static void main(String arg[]){
        ArrayList<Integer> studentMarks=new ArrayList<>();

        Random rand=new Random();

        for(int i=0;i<30;i++){
            studentMarks.add(rand.nextInt(101));
        }
        Collections.sort(studentMarks);

        System.out.println("List of sorted student marks: ");
        System.out.println(studentMarks);

        int frequencyCounter=1;

        for(int i=0;i<30;i++){
            frequencyCounter=1;
            while(i<30 && i+1<30 && studentMarks.get(i)==studentMarks.get(i+1)){
                frequencyCounter++;
                i++;
            }
            System.out.println(frequencyCounter+" students got "+studentMarks.get(i)+" marks");
        }
    }
}
