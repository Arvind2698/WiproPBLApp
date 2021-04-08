package com.arvind.JUNIT.HandsOn1;

public class Demo1 {
	public String stringConcat(String input1,String input2) {
		
		if(input1.length()==0 && input2.length()==0) {
			return null;
		}
		
		if(input1.length()==0) {
			return input2;
		}
		if(input2.length()==0) {
			return input1;
		}
		String resultString=input1.concat(input2);
		return resultString;
	}
}
