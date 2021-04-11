package com.arvind.preparedStatements;

import java.sql.SQLException;
import java.sql.Date;
import java.util.Scanner;

public class HandsOn2 {
	public static void main(String[] arg) throws SQLException {
		
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the Student: ");
		String nameString=sc.next();
		if(!student.checkName(nameString)) {
			System.out.println("Invalid format.. Please try again");
			return;
		}
		
		System.out.println("Enter the Student's roll number: ");
		int roll=sc.nextInt();
		if(!student.checkRollNumber(roll)) {
			System.out.println("Invalid roll number... Please try again");
			return;
		}
		
		System.out.println("Enter the Student's current standard");
		String standarString=sc.next();
		if(!student.checkStandard(standarString)) {
			System.out.println("Invalid standard... Please try again");
			return;
		}

		System.out.println("Enter the Student's DOB(dd/mm/yyyy): ");
		try {
			String dOBString=sc.next();
			java.util.Date date=new java.util.Date(dOBString);
			student.setDOB(new Date(date.getYear(), date.getMonth(), date.getDate()));
		}catch(Exception e) {
			System.out.println("DOB not in correct format... Please try again");
			return;
		}
		
		System.out.println("Enter the Student's fees: ");
		double fees=sc.nextDouble();
		student.setFees(fees);
		
		if(Student.addStudentToDatabase(student)) {
			System.out.println("Student added to database successfully");
		}else {
			System.out.println("Student was not added to database... Please try again");
		}
		
	}
}
