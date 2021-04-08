package com.arvind.JUNIT.HandsOn2;

import org.junit.jupiter.api.*;

public class AppTest{
	@Test
	@DisplayName("If the input is blank the result would be false")
	public void inputStringForCheckIsBlank() {
		Demo2 demo2=new Demo2();
		
		Assertions.assertFalse(demo2.checkPalindrome(" "));
	}
	
	@Test
	@DisplayName("If the input not a palindrome the result would be false")
	public void inputStringForCheckIsNotPalindrome() {
		Demo2 demo2=new Demo2();
		
		Assertions.assertFalse(demo2.checkPalindrome("sunday"));
	}
	
	@Test
	@DisplayName("If the input is a palindrome the result would be true")
	public void inputStringForCheckIsPalindrome() {
		Demo2 demo2=new Demo2();
		
		Assertions.assertTrue(demo2.checkPalindrome("malayalam"));
	}
}