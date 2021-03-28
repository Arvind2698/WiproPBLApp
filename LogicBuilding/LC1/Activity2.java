package LogicBuilding.LC1;

import java.util.Random;

public class Activity2 {
    public static void main(String arg[]){
        int[] studentMarks=new int[30];

        Random rand=new Random();

        for(int i=0;i<30;i++){
            studentMarks[i]=rand.nextInt(101);
        }

        int passMark=35;
        int studentsPassed=0;

        for(int i=0;i<30;i++){
            if(studentMarks[i]>=passMark){
                studentsPassed++;
            }
        }

        System.out.println("Out of 30 Students "+studentsPassed+" passed");
    }
}
