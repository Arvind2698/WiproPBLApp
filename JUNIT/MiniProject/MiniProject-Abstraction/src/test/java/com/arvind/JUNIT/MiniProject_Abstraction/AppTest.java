package com.arvind.JUNIT.MiniProject_Abstraction;

import org.junit.jupiter.api.*;

public class AppTest{
	
	@Nested
	class SBAccountTest{
		@Test
		@DisplayName("SB Account interest for NRI account should be 6 and should return correct interest amount")
		public void SBAccountForNRIAccountType() {
			SBAccount accSb=new SBAccount();
			accSb.setAmount(1000);
			accSb.setNRI(true);
			
			Assertions.assertEquals(60,accSb.calculateInterest() ); 
			Assertions.assertEquals(6, accSb.getInterestRate());
		}
		
		@Test
		@DisplayName("SB Account interest for non-NRI account should be 4 and should return correct interest amount")
		public void SBAccountForNonNRIAccountType() {
			SBAccount accSb=new SBAccount();
			accSb.setAmount(1000);
			accSb.setNRI(false);
			
			Assertions.assertEquals(40,accSb.calculateInterest() ); 
			Assertions.assertEquals(4, accSb.getInterestRate());
		}
	}
	
	@Nested
	class FDAccountTest{
		@Test
		@DisplayName("FD Account the number of days should not be greater then 366 and less 7")
		public void FDAccountNumberOfDaysOutOfRange() {
			FDAccount accFD=new FDAccount();
			
			accFD.setAge(22);
			accFD.setAmount(1000);
			accFD.setNoOfDays(2);
			
			Assertions.assertEquals(-3, accFD.calculateInterest()); 
		}
		
		@Test
		@DisplayName("FD Account the age of the account holder should not be greater than 0 and less than 100")
		public void FDAccountHolderAgeOutOfRange() {
			FDAccount accFD=new FDAccount();
			
			accFD.setAge(102);
			accFD.setAmount(1000);
			accFD.setNoOfDays(200);
			
			Assertions.assertEquals(-2, accFD.calculateInterest()); 
		}
		
		@Test
		@DisplayName("FD Account the amount be greater than 0 ")
		public void FDAccountAmountZero() {
			FDAccount accFD=new FDAccount();
			
			accFD.setAge(22);
			accFD.setAmount(0);
			accFD.setNoOfDays(200);
			
			Assertions.assertEquals(-1, accFD.calculateInterest()); 
		}
		
		@Test
		@DisplayName("FD Account with the correct input interest amount would be as expexted")
		public void FDAccountValidInputCheck() {
			FDAccount accFD=new FDAccount();
			
			accFD.setAge(22);
			accFD.setAmount(1000);
			accFD.setNoOfDays(100);
			
			Assertions.assertEquals(75, accFD.calculateInterest()); 
		}
	}
	
	@Nested
	class RDAccountTest{
		@Test
		@DisplayName("RD Account the age of the account holder should be greater than 0 and less than 100")
		public void RDAccountHolderAgeOutOfRange() {
			RDAccount accRD=new RDAccount();
			
			accRD.setAge(102);
			accRD.setAmount(1000);
			accRD.setNoOfMonths(9);
			
			Assertions.assertEquals(-2, accRD.calculateInterest()); 
		}
		
		@Test
		@DisplayName("RD Account the number of months should be between 6 and 21")
		public void RDAccountMonthsOutOfRange() {
			RDAccount accRD=new RDAccount();
			
			accRD.setAge(22);
			accRD.setAmount(1000);
			accRD.setNoOfMonths(4);
			
			Assertions.assertEquals(-1, accRD.calculateInterest()); 
		}
		
		@Test
		@DisplayName("RD Account with the correct input expected interest rate should be achived")
		public void RDAccountValidInputCheck() {
			RDAccount accRD=new RDAccount();
			
			accRD.setAge(22);
			accRD.setAmount(1000);
			accRD.setNoOfMonths(12);
			
			Assertions.assertEquals(960, accRD.calculateInterest()); 
		}
	}
	
}