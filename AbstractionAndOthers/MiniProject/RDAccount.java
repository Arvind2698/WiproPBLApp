package accounts;
public class RDAccount extends Account {
    private int noOfMonths;
    private int ageOfACHolder;

    public void setNoOfMonths(int noOfMonths){
        this.noOfMonths=noOfMonths;
    }
    public int getNoOfMonths(){
        return this.noOfMonths;
    }
    public void setAge(int age){
        this.ageOfACHolder=age;
    }
    public int getAge(){
        return this.ageOfACHolder;
    }

    public double calculateInterest(){     

        if(ageOfACHolder<0 || ageOfACHolder>100){
            return -2;//age out of bounds
        }

        if(ageOfACHolder<60){
            if(noOfMonths==6){
                setInterestRate(7.5);
            }else if(noOfMonths==9){
                setInterestRate(7.75);
            }else if(noOfMonths==12){
                setInterestRate(8);
            }else if(noOfMonths==15){
                setInterestRate(8.25);
            }else if(noOfMonths==18){
                setInterestRate(8.5);
            }else if(noOfMonths==21){
                setInterestRate(8.75);
            }else{
                return -1;//months out of bounds
            }

        }else if(ageOfACHolder>=60){
            if(noOfMonths==6){
                setInterestRate(8);
            }else if(noOfMonths==9){
                setInterestRate(8.25);
            }else if(noOfMonths==12){
                setInterestRate(8.5);
            }else if(noOfMonths==15){
                setInterestRate(8.75);
            }else if(noOfMonths==18){
                setInterestRate(9);
            }else if(noOfMonths==21){
                setInterestRate(9.25);
            }else{
                return -1;//months out of bounds
            }
        }

        return (getInterestRate()*((this.getAmount()*noOfMonths)/100));

    }

}

