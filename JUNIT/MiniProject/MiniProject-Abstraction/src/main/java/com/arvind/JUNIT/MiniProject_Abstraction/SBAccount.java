package com.arvind.JUNIT.MiniProject_Abstraction;

public class SBAccount extends Account {
	
	private boolean NRI;
	
	public void setNRI(boolean NRI) {
		this.NRI=NRI;
	}
	public boolean getNRI() {
		return this.NRI;
	}
	
    public double calculateInterest(){

        if(NRI){
            setInterestRate(6);
        }else{
            setInterestRate(4);
        }

        return (getInterestRate()*(this.getAmount()/100));
    }
}
