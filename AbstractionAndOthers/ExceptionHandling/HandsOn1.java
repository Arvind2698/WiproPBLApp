package AbstractionAndOthers.ExceptionHandling;

import java.util.Scanner;

public class HandsOn1 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        try{
            int number=Integer.parseInt(input);
            System.out.println("Square of Number: "+Math.pow(number,2));
        }catch(NumberFormatException e){
            System.out.println("Entered input is not a valid form of an integer.");
        }finally{
            sc.close();
        }
    }
}