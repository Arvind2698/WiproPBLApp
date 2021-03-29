package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn15 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int sum=0;
        while(num>=1){
            sum+=num%10;
            num=num/10;
        }

        System.out.println("The sum of the digits of are "+sum);

        sc.close();
    }
}
