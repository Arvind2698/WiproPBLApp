package com.arvind.preparedStatements;

public class HandsOn3 {
	public static void main(String[] arg){
		int rollToDelte=Integer.parseInt(arg[0]);
		
		try {
			if(Student.removeStudent(rollToDelte)) {
				System.out.println("Student removed from main reconds and added to log");
			}else {
				System.out.println("Student not found...");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured... Please try again "+e.getMessage());
		}
	}
}
