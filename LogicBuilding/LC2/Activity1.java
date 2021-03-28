package LogicBuilding.LC2;

import java.util.Scanner;

public class Activity1 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        int input;

        try{
            input=Integer.valueOf(inputString);
        }catch(NumberFormatException e){
            System.out.println("Number of digits: "+inputString.length());
            return;
        }finally{
            sc.close();
        }

        int digitCount=0;

        while(input>0){
            input=input/10;
            digitCount++;
        }

        System.out.println("Number of digits: "+digitCount);
    }
}
