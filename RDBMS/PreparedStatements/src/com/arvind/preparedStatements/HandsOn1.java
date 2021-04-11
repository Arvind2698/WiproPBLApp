package com.arvind.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HandsOn1 {
	public static void main(String[] arg) throws SQLException, Exception {
		
		DOAclass obj=new DOAclass();
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
		
		int option=Integer.parseInt(arg[0]);

		switch (option) {
		case 1: 
			if(obj.addData(connection, arg)) {
				System.out.println("Record inserted to database");
			}else {
				System.out.println("Record not inserted to database");
			}
			break;
	
		case 2:
			int idDelete=Integer.parseInt(arg[1]);
			if(obj.deleteSingleRecord(connection, idDelete)) {
				System.out.println("Record deleted");
			}else {
				System.out.println("Record not deleted");
			}
			break;
			
		case 3:
			int idUpdate=Integer.parseInt(arg[1]);
			int salaryUpdate=Integer.parseInt(arg[2]);
			
			if(obj.updateSingleSalary(connection, idUpdate, salaryUpdate)) {
				System.out.println("Recored updated");
			}else {
				System.out.println("Record not updated");
			}
			break;
			
		case 4:
			if(arg.length==1) {
				obj.displayData(obj.getAllData(connection));
			}else {
				int idDisplay=Integer.parseInt(arg[1]);
				obj.displayData(obj.getSingeRecord(connection,idDisplay));
			}
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		
		connection.close();
		
	}
}
