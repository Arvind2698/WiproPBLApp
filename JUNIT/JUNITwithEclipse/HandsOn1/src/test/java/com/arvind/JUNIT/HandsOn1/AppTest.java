package com.arvind.JUNIT.HandsOn1;

import org.junit.jupiter.api.*;

public class AppTest{
	Demo1 demo1;
	
	@BeforeEach
	public void createDemo1Object() {
		demo1=new Demo1();
	}
	
	@Test
	@DisplayName("If both inputs are empty then return null")
	public void bothInputMissing() {
		String input1="";
		String input2="";
		
		Assertions.assertEquals(null, demo1.stringConcat(input1, input2));
	}
	
	@Test
	@DisplayName("If one input in empty the other input should be returned")
	public void oneInputMissing() {
		String input1="";
		String input2="new string";
		
		Assertions.assertArrayEquals(input2.toCharArray(), demo1.stringConcat(input1, input2).toCharArray());
		
		input1="new string";
		input2="";
		
		Assertions.assertArrayEquals(input1.toCharArray(), demo1.stringConcat(input1, input2).toCharArray());
	}
	
	@Test
	@DisplayName("If both the inputs are correct their concation must be returned")
	public void bothInputsAvailableCheck() {
		String input1="PBL";
		String input2="Wipro";
		
		String resultString=input1+input2;
		
		Assertions.assertArrayEquals(resultString.toCharArray(),demo1.stringConcat(input1, input2).toCharArray());
	}
}