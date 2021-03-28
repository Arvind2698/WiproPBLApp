package LogicBuilding.LC1;

import java.util.Scanner;

public class Activity4 {
    public static void main(String arg[]) {

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        if(input>=0){
            System.out.println("Positive number");
        }else{
            System.out.println("Negative number");
        }

        sc.close();
    }
}
