package com.arvind.preparedStatements;

public class HandsOn5 {
	public static void main(String[] arg) throws Exception {
		if(arg.length==0) {
			Student.displayAllStudents();
		}else {
			int studentId=Integer.parseInt(arg[0]);
			Student.displayOneStudent(studentId);
		}
	}
}
