package com.arvind.preparedStatements;

public class HandsOn4 {
	public static void main(String[] arg) throws Exception {
		if(arg.length==2) {
			int studentId=Integer.parseInt(arg[0]);
			double updatedFee=Double.parseDouble(arg[1]);
			
			if(Student.updateStudentFee(studentId, updatedFee)) {
				System.out.println("Student fee updated");
			}else {
				System.out.println("No student found");
			}
			
		}else {
			System.out.println("Invalid input... Please try again");
		}
	}
}
