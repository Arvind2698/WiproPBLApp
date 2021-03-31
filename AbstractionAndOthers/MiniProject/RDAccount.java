package accounts;

import java.util.Scanner;
public class RDAccount extends Account {
    private int noOfMonths;
    private double monthlyAmount;
    private int ageOfACHolder;

    public void setNoOfMonths(int noOfMonths){
        this.noOfMonths=noOfMonths;
    }
    public void setMonthlyAmount(double monthlyAmount){
        this.monthlyAmount=monthlyAmount;
    }
    public int getNoOfMonths(){
        return this.noOfMonths;
    }
    public double getMonthlyAmount(){
        return this.monthlyAmount;
    }
    public void setAge(int age){
        this.ageOfACHolder=age;
    }
    public int setAge(){
        return this.ageOfACHolder;
    }

    public double calculateInterest(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the monthly amount: ");
        double amount=sc.nextDouble();
        setMonthlyAmount(amount);
        System.out.print("Enter the number of months(6,9,12,15...): ");
        int months=sc.nextInt();
        setNoOfMonths(months);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        setAge(age);

        if(age<60){
            if(months==6){
                setInterestRate(7.5);
            }else if(months==9){
                setInterestRate(7.75);
            }else if(months==12){
                setInterestRate(8);
            }else if(months==15){
                setInterestRate(8.25);
            }else if(months==18){
                setInterestRate(8.5);
            }else if(months==21){
                setInterestRate(8.75);
            }else{
                return -1;
            }

        }else if(age>=60){
            if(months==6){
                setInterestRate(8);
            }else if(months==9){
                setInterestRate(8.25);
            }else if(months==12){
                setInterestRate(8.5);
            }else if(months==15){
                setInterestRate(8.75);
            }else if(months==18){
                setInterestRate(9);
            }else if(months==21){
                setInterestRate(9.25);
            }else{
                return -1;
            }
        }if(age<0 || age>100){
            return -2;
        }

        return (getInterestRate()*((amount*months)/100));

    }

}
