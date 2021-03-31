package accounts;

public abstract class Account {
    private double interestRate;
    private double amount;

    public void setInterestRate(double rate){
        this.interestRate=rate;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }

    public double getInterestRate(){
        return this.interestRate;
    }
    public double getAmount(){
        return this.amount;
    }
    public abstract double calculateInterest();
}
