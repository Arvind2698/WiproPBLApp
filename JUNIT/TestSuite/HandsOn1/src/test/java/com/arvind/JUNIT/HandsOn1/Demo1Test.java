package com.arvind.JUNIT.HandsOn1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Demo1Test {

Demo1 demo1;
	
	@Before
	public void createDemo1Object() {
		demo1=new Demo1();
	}
	
	@Test
	public void bothInputMissing() {
		String input1="";
		String input2="";
		
		assertEquals(null, demo1.stringConcat(input1, input2));
	}
	
	@Test
	public void oneInputMissing() {
		String input1="";
		String input2="new string";
		
		assertArrayEquals(input2.toCharArray(), demo1.stringConcat(input1, input2).toCharArray());
		
		input1="new string";
		input2="";
		
		assertArrayEquals(input1.toCharArray(), demo1.stringConcat(input1, input2).toCharArray());
	}
	
	@Test
	public void bothInputsAvailableCheck() {
		String input1="PBL";
		String input2="Wipro";
		
		String resultString=input1+input2;
		
		assertArrayEquals(resultString.toCharArray(),demo1.stringConcat(input1, input2).toCharArray());
	}

}
