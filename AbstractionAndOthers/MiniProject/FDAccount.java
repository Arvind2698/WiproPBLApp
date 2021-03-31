package accounts;

import java.util.Scanner;

public class FDAccount extends Account {
    private int noOfDays;
    private int ageOfACHolder;

    public void setNoOfDays(int noOfDays){
        this.noOfDays=noOfDays;
    }
    public void setAge(int age){
        this.ageOfACHolder=age;
    }
    public int getNoOfDays(){
        return this.noOfDays;
    }
    public int setAge(){
        return this.ageOfACHolder;
    }

    public double calculateInterest(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the FD amount: ");
        double amount=sc.nextDouble();
        setAmount(amount);
        System.out.print("Enter the number of days: ");
        int days=sc.nextInt();
        setNoOfDays(days);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        setAge(age);

        if(days<7 || days>366){
            return -3;
        }

        if(amount<10000000){
            if(age<60){
                if(days>=7 && days <=14){
                    setInterestRate(4.5);
                }else if(days>=15 && days<=29){
                    setInterestRate(4.75);
                }else if(days>=30 && days<=45){
                    setInterestRate(5.50);
                }else if(days>=46 && days<=60){
                    setInterestRate(7);
                }else if(days>=61 && days<=184){
                    setInterestRate(7.5);
                }else if(days>=185 && days<=365){
                    setInterestRate(8);
                }
            }else if(age>=60){
                if(days>=7 && days <=14){
                    setInterestRate(5);
                }else if(days>=15 && days<=29){
                    setInterestRate(5.25);
                }else if(days>=30 && days<=45){
                    setInterestRate(6);
                }else if(days>=46 && days<=60){
                    setInterestRate(7.5);
                }else if(days>=61 && days<=184){
                    setInterestRate(8);
                }else if(days>=185 && days<=365){
                    setInterestRate(8.5);
                }
            }else if(age<0 || age>100){
                return -2;
            }

        }else if(amount>=10000000){
            if(days>=7 && days <=14){
                setInterestRate(6.5);
            }else if(days>=15 && days<=29){
                setInterestRate(6.75);
            }else if(days>=30 && days<=45){
                setInterestRate(6.75);
            }else if(days>=46 && days<=60){
                setInterestRate(8);
            }else if(days>=61 && days<=184){
                setInterestRate(8.5);
            }else if(days>=185 && days<=365){
                setInterestRate(10);
            }
        }else if(amount<0 || amount>10000000){
            return -1;
        }

        return (getInterestRate()*(amount/100));
    }
}
