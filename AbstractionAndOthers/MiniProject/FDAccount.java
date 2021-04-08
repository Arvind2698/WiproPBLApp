package accounts;

public class FDAccount extends Account {
    private int noOfDays;
    private int ageOfACHolder;

    public void setNoOfDays(int noOfDays){
        this.noOfDays=noOfDays;
    }
    public int getNoOfDays(){
        return this.noOfDays;
    }
    public void setAge(int age){
        this.ageOfACHolder=age;
    }
    public int getAge(){
        return this.ageOfACHolder;
    }

    public double calculateInterest(){        

        if(noOfDays<7 || noOfDays>366){
            return -3;//number of days out of range
        }
        
        if(ageOfACHolder<0 || ageOfACHolder>100){
            return -2;//age out of range
        }
        
        if(this.getAmount()<=0){
            return -1;//amount out of range 
        }

        if(this.getAmount()<10000000){
            if(ageOfACHolder<60){
                if(noOfDays>=7 && noOfDays <=14){
                    setInterestRate(4.5);
                }else if(noOfDays>=15 && noOfDays<=29){
                    setInterestRate(4.75);
                }else if(noOfDays>=30 && noOfDays<=45){
                    setInterestRate(5.50);
                }else if(noOfDays>=46 && noOfDays<=60){
                    setInterestRate(7);
                }else if(noOfDays>=61 && noOfDays<=184){
                    setInterestRate(7.5);
                }else if(noOfDays>=185 && noOfDays<=365){
                    setInterestRate(8);
                }
            }else if(ageOfACHolder>=60){
                if(noOfDays>=7 && noOfDays <=14){
                    setInterestRate(5);
                }else if(noOfDays>=15 && noOfDays<=29){
                    setInterestRate(5.25);
                }else if(noOfDays>=30 && noOfDays<=45){
                    setInterestRate(6);
                }else if(noOfDays>=46 && noOfDays<=60){
                    setInterestRate(7.5);
                }else if(noOfDays>=61 && noOfDays<=184){
                    setInterestRate(8);
                }else if(noOfDays>=185 && noOfDays<=365){
                    setInterestRate(8.5);
                }
            }

        }else if(this.getAmount()>=10000000){
            if(noOfDays>=7 && noOfDays <=14){
                setInterestRate(6.5);
            }else if(noOfDays>=15 && noOfDays<=29){
                setInterestRate(6.75);
            }else if(noOfDays>=30 && noOfDays<=45){
                setInterestRate(6.75);
            }else if(noOfDays>=46 && noOfDays<=60){
                setInterestRate(8);
            }else if(noOfDays>=61 && noOfDays<=184){
                setInterestRate(8.5);
            }else if(noOfDays>=185 && noOfDays<=365){
                setInterestRate(10);
            }
        }
        
        return (getInterestRate()*(this.getAmount()/100));
    }
}

