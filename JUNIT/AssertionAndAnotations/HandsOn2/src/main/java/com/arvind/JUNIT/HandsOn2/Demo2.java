package com.arvind.JUNIT.HandsOn2;

public class Demo2 {
	public boolean checkPalindrome(String input) {
		if(input.isBlank()) {
			return false;
		}
		
		char[] arr=input.toCharArray();
		int found=0;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==arr[arr.length-1-i]) {
				
			}else {
				found++;
				break;
			}
		}
		if(found==0) {
			return true;
		}
		
		return false;
	}
}
