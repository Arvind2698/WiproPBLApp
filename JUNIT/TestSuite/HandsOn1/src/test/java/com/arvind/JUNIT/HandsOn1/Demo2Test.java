package com.arvind.JUNIT.HandsOn1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void inputStringForCheckIsBlank() {
		Demo2 demo2=new Demo2();
		
		assertFalse(demo2.checkPalindrome(" "));
	}
	
	@Test
	public void inputStringForCheckIsNotPalindrome() {
		Demo2 demo2=new Demo2();
		
		assertFalse(demo2.checkPalindrome("sunday"));
	}
	
	@Test
	public void inputStringForCheckIsPalindrome() {
		Demo2 demo2=new Demo2();
		
		assertTrue(demo2.checkPalindrome("malayalam"));
	}

}
