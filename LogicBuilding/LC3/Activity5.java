package LogicBuilding.LC3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Activity5 {
    public static void main(String arg[]){
        ArrayList<Integer> studentMarks=new ArrayList<>();

        Random rand=new Random();

        for(int i=0;i<30;i++){
            studentMarks.add(rand.nextInt(101));
        }
        Collections.sort(studentMarks);

        System.out.println("List of sorted student marks: ");
        System.out.println(studentMarks);

        int rangeFrequency[] =new int[10];

        for(int i=0;i<30;i++){

            if(studentMarks.get(i)>=0 && studentMarks.get(i)<=10){
                rangeFrequency[0]++;
            }else if(studentMarks.get(i)>=11 && studentMarks.get(i)<=20){
                rangeFrequency[1]++;
            }else if(studentMarks.get(i)>=21 && studentMarks.get(i)<=30){
                rangeFrequency[2]++;
            }else if(studentMarks.get(i)>=31 && studentMarks.get(i)<=40){
                rangeFrequency[3]++;
            }else if(studentMarks.get(i)>=41 && studentMarks.get(i)<=50){
                rangeFrequency[4]++;
            }else if(studentMarks.get(i)>=51 && studentMarks.get(i)<=60){
                rangeFrequency[5]++;
            }else if(studentMarks.get(i)>=61 && studentMarks.get(i)<=70){
                rangeFrequency[6]++;
            }else if(studentMarks.get(i)>=71 && studentMarks.get(i)<=80){
                rangeFrequency[7]++;
            }else if(studentMarks.get(i)>=81 && studentMarks.get(i)<=90){
                rangeFrequency[8]++;
            }else if(studentMarks.get(i)>=91 && studentMarks.get(i)<=100){
                rangeFrequency[9]++;
            }

        }

        System.out.println("Number od students in the range 0-10%: "+rangeFrequency[0]);
        System.out.println("Number od students in the range 11-20%: "+rangeFrequency[1]);
        System.out.println("Number od students in the range 21-30%: "+rangeFrequency[2]);
        System.out.println("Number od students in the range 31-40%: "+rangeFrequency[3]);
        System.out.println("Number od students in the range 41-50%: "+rangeFrequency[4]);
        System.out.println("Number od students in the range 51-60%: "+rangeFrequency[5]);
        System.out.println("Number od students in the range 61-70%: "+rangeFrequency[6]);
        System.out.println("Number od students in the range 71-80%: "+rangeFrequency[7]);
        System.out.println("Number od students in the range 81-90%: "+rangeFrequency[8]);
        System.out.println("Number od students in the range 91-100%: "+rangeFrequency[9]);
    }
}
