package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num==1){
            System.out.println(num+" neither prime nor composite");
            sc.close();
            return;

        }

        if(checkPrime(num)){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }

        sc.close();
    }
    public static boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
