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
                    System.out.print("Enter the average amount in account: ");
                    double amount=sc.nextDouble();
                    System.out.print("Is this a NRI account(true/false): ");
                    boolean NRI=sc.nextBoolean();
                    
                    SBAccount accSB=new SBAccount();
                    accSB.setAmount(amount);
                    accSB.setNRI(NRI);
                    
                    System.out.println("Interest gained: "+accSB.calculateInterest());
                    break;
             
                case 2:
                    FDAccount accFD=new FDAccount();
                    
                    System.out.print("Enter the FD amount: ");
                    double amountFD=sc.nextDouble();
                    accFD.setAmount(amountFD);
                    System.out.print("Enter the number of days: ");
                    int daysFD=sc.nextInt();
                    accFD.setNoOfDays(daysFD);
                    System.out.print("Enter your age: ");
                    int ageFD=sc.nextInt();
                    accFD.setAge(ageFD);
                                        
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
                    
                    System.out.print("Enter the monthly amount: ");
                    double amountRD=sc.nextDouble();
                    accRD.setAmount(amountRD);
                    System.out.print("Enter the number of months(6,9,12,15...): ");
                    int monthsRD=sc.nextInt();
                    accRD.setNoOfMonths(monthsRD);
                    System.out.print("Enter your age: ");
                    int ageRD=sc.nextInt();
                    accRD.setAge(ageRD);
                    
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

        sc.close();

    }
}