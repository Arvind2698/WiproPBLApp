package accounts;

import java.util.Scanner;

public class SBAccount extends Account {
    public double calculateInterest(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the average amount in account: ");
        double amount=sc.nextDouble();

        System.out.print("Is this a NRI account(true/false): ");
        boolean NRI=sc.nextBoolean();

        if(NRI){
            setInterestRate(6);
        }else{
            setInterestRate(4);
        }

        return (getInterestRate()*(amount/100));
    }
}
