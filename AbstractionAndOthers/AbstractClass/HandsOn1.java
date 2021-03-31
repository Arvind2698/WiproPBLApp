package AbstractionAndOthers.AbstractClass;

public class HandsOn1 {
    public static void main(String[] arg){
        ICICIBank i=new ICICIBank();

        System.out.println("ICICI BANK");
        System.out.println("Savings Account:"+i.getFixedDepositInterestRate());
        System.out.println("Fixed Deposit"+i.getSavingsInterestRate());

        KotMBank k=new KotMBank();

        System.out.println("KotM BANK");
        System.out.println("Savings Account:"+k.getFixedDepositInterestRate());
        System.out.println("Fixed Deposit"+k.getSavingsInterestRate());


        GeneralBank g1=new ICICIBank();
        GeneralBank g2=new KotMBank();

        System.out.println("Using abstract class reference");
        System.out.println("ICICI BANK");
        System.out.println("Savings Account:"+g1.getFixedDepositInterestRate());
        System.out.println("Fixed Deposit"+g1.getSavingsInterestRate());

        System.out.println("KotM BANK");
        System.out.println("Savings Account:"+g2.getFixedDepositInterestRate());
        System.out.println("Fixed Deposit"+g2.getSavingsInterestRate());
    }
}

abstract class GeneralBank{
    public abstract double getSavingsInterestRate();
    public abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
    private double savingsInterest=4;
    private double fixedDepositInterest=8.5;

    public double getFixedDepositInterestRate(){
        return this.fixedDepositInterest;
    }

    public double getSavingsInterestRate(){
        return this.savingsInterest;
    }
}

class KotMBank extends GeneralBank{
    private double savingsInterest=6;
    private double fixedDepositInterest=9;

    public double getFixedDepositInterestRate(){
        return this.fixedDepositInterest;
    }

    public double getSavingsInterestRate(){
        return this.savingsInterest;
    }
}