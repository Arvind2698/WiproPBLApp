package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn8 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        switch(ch){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Color Code Input");

        }
        sc.close();
    }
}
