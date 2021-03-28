package LogicBuilding.LC2;

import java.util.Scanner;

public class Activity5 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();

        for(int i=2;i<=input/2;i++){
            if(input%i == 0){
                System.out.println("Smallest exact divisor of "+input+" is "+i);
                sc.close();
                return;
            }
        }

        System.out.println("Smallest exact divisor of "+input+" is "+input);

        sc.close();
    }
}
