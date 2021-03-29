package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn12 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(checkPrime(num)){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is not prime");
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
