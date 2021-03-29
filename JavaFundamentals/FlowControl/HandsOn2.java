package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn2 {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(num +" is "+oddEven(num));

        sc.close();
    }
    public static String oddEven(int num){
        if(num%2==0){
            return "Even";
        }
        return "Odd";
    }
}
