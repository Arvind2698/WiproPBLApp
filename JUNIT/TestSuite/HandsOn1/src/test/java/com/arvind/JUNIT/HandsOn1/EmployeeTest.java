package com.arvind.JUNIT.HandsOn1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void listOfEmployeesNameEmpty() {
		ArrayList<String> employees=new ArrayList<String>();
		
		Employee employee=new Employee();
	
		assertEquals(9,employee.findName(employees, "arvind").toCharArray().length);
		assertArrayEquals("NOT FOUND".toCharArray(),employee.findName(employees, "arvind").toCharArray());
	}
	
	@Test
	public void nameToSearchIsEmpty() {
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("arvind1");
		employees.add("arvind2");
		employees.add("arvind3");
		
		Employee employee=new Employee();
		
		assertEquals(9,employee.findName(employees, "").toCharArray().length);
		assertArrayEquals("NOT FOUND".toCharArray(),employee.findName(employees, "").toCharArray());
	
	}
	
	@Test
	public void nameToSearchIsNotFound() {
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("arvind1");
		employees.add("arvind2");
		employees.add("arvind3");
		
		Employee employee=new Employee();
		
		assertEquals(9,employee.findName(employees, "arvind4").toCharArray().length);
		assertArrayEquals("NOT FOUND".toCharArray(),employee.findName(employees, "arvind4").toCharArray());
	
	}
	
	@Test
	public void nameToSearchIsFound() {
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("arvind1");
		employees.add("arvind2");
		employees.add("arvind3");
		
		Employee employee=new Employee();
		
		assertEquals(5,employee.findName(employees, "arvind3").toCharArray().length);
		assertArrayEquals("FOUND".toCharArray(),employee.findName(employees, "arvind3").toCharArray());
	
	}

}
