package LogicBuilding.LC2;

import java.util.Scanner;

public class Activity2 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.next();
        int input;
        int digitSum=0;

        try{
            input=Integer.valueOf(inputString);
        }catch(NumberFormatException e){
            for(int i=0;i<inputString.length();i++){
                digitSum+=Integer.valueOf(inputString.charAt(i)+"");
            }
            System.out.println("Number of digits: "+digitSum);
            return;
        }finally{
            sc.close();
        }

        while(input>0){
            digitSum+=input%10;
            input=input/10;
        }

        System.out.println("Number of digits: "+digitSum);
    }
}
