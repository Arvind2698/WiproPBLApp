package AbstractionAndOthers.ExceptionHandling;

import java.util.Scanner;

public class HandsOn9 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        try{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println("The quotient the number "+(double)num1/num2);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            sc.close();
            System.out.println("Finally block running");
        }

    }
}
