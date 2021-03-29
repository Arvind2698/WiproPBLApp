package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn1 {

    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println( "Negative");
        }else if(num>0){
            System.out.println( "Positive");
        }else{
            System.out.println( "Zero");
        }
        sc.close();
    }
}
