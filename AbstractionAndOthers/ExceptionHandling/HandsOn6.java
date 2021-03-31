package AbstractionAndOthers.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandsOn6 {
    public static void main(String[] arg){
        try{
            System.out.println(getAverage());
            System.out.println(getAverage());
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static String getAverage() throws InputMismatchException,inputOutOfRangeException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name=sc.next();
        System.out.println("Enter the marks of the student in subject 1");
        int mark1=sc.nextInt();
        System.out.println("Enter the marks of the student in subject 2");
        int mark2=sc.nextInt();
        System.out.println("Enter the marks of the student in subject 3");
        int mark3=sc.nextInt();

        if( (mark1>100 || mark1<0)  || (mark2>100 || mark2<0) || (mark3>100 || mark3<0) ){
            sc.close();
            throw new inputOutOfRangeException();
        }

        int sum=0;
        double avg=0;

        sum=mark1+mark2+mark3;
        avg=(double)sum/3;

        sc.close();

        return("The sum of the marks for "+ name +" is "+sum+" and the average is "+avg);

    }
}

class inputOutOfRangeException extends Exception{
    public String toString(){
        return "Marks entered is out of range (0..100)";
    }
}