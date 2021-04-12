package com.arvind.executingQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandsOn1 {
	public static void main(String[] arg) throws SQLException {
		
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
			
			String sql="SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME FROM EMPLOYEES";
			Statement statement=connection.createStatement();
			ResultSet rSet=statement.executeQuery(sql);
			
			while(rSet.next()) {
				System.out.println(rSet.getInt(1)+" "+rSet.getString("FIRST_NAME")+" "+rSet.getString("LAST_NAME")+"\n");
			}
			
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connection failed");
		}
	}
}
