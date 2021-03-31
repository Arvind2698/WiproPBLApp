package accounts;

import java.util.InputMismatchException;
import java.util.Scanner;

import accounts.FDAccount;
import accounts.RDAccount;
import accounts.SBAccount;

public class Banking {
    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("    Main Menu");
        System.out.println("===========================");

        System.out.println("    1.Interest Calculator - SB\n    2.Interest Calculator - FD\n    3.Interest Calculator - RD\n    4.Exit\n");
        System.out.print("Enter your Choice(1..4):");

        try{
            int option=sc.nextInt();

            switch(option){
                case 1:
                    SBAccount accSB=new SBAccount();
                    System.out.println("Interest gained: "+accSB.calculateInterest());
                    break;
                case 2:
                    FDAccount accFD=new FDAccount();
                    double resultFD=accFD.calculateInterest();
                    if(resultFD==-1){
                        System.out.println("Amount is out of range");
                    }else if(resultFD==-2){
                        System.out.println("Age is out of range");
                    }else if(resultFD==-3){
                        System.out.println("Days is out of range");
                    }else{
                        System.out.println("Interest gained: "+resultFD);
                    }
                    break;
                case 3:
                    RDAccount accRD=new RDAccount();
                    double resultRD=accRD.calculateInterest();
                    if(resultRD==-1){
                        System.out.println("Month is out of range");
                    }else if(resultRD==-2){
                        System.out.println("Age is out of range");
                    }else{
                        System.out.println("Interest gained: "+resultRD);
                    }
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        }catch(InputMismatchException e){
            System.out.println("Input not in required format");
        }

    }
}
