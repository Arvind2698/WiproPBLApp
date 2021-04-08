package com.arvind.JUNIT.HandsOn1;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

public class AppTest{
	
	@Test
	@DisplayName("If the list of names is empty result will be not found")
	public void listOfEmployeesNameEmpty() {
		ArrayList<String> employees=new ArrayList<String>();
		
		Employee employee=new Employee();
	
		Assertions.assertEquals(9,employee.findName(employees, "arvind").toCharArray().length);
		Assertions.assertArrayEquals("NOT FOUND".toCharArray(),employee.findName(employees, "arvind").toCharArray());
	}
	
	@Test
	@DisplayName("If the name to search is an empty string result will be not found")
	public void nameToSearchIsEmpty() {
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("arvind1");
		employees.add("arvind2");
		employees.add("arvind3");
		
		Employee employee=new Employee();
		
		Assertions.assertEquals(9,employee.findName(employees, "").toCharArray().length);
		Assertions.assertArrayEquals("NOT FOUND".toCharArray(),employee.findName(employees, "").toCharArray());
	
	}
	
	@Test
	@DisplayName("If the name to search is not present in the list result will be not found")
	public void nameToSearchIsNotFound() {
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("arvind1");
		employees.add("arvind2");
		employees.add("arvind3");
		
		Employee employee=new Employee();
		
		Assertions.assertEquals(9,employee.findName(employees, "arvind4").toCharArray().length);
		Assertions.assertArrayEquals("NOT FOUND".toCharArray(),employee.findName(employees, "arvind4").toCharArray());
	
	}
	
	@Test
	@DisplayName("If the name to search is present in the list result will be found")
	public void nameToSearchIsFound() {
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("arvind1");
		employees.add("arvind2");
		employees.add("arvind3");
		
		Employee employee=new Employee();
		
		Assertions.assertEquals(5,employee.findName(employees, "arvind3").toCharArray().length);
		Assertions.assertArrayEquals("FOUND".toCharArray(),employee.findName(employees, "arvind3").toCharArray());
	
	}
}