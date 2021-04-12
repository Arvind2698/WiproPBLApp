package com.arvind.executingQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandsOn2 {
	public static void main(String[] arg) throws SQLException {
		
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
			
			String sql="SELECT FIRST_NAME,LAST_NAME,JOB_ID,SALARY,COMMISSION_PCT FROM EMPLOYEES WHERE SALARY>1000 AND SALARY<4000";
			Statement statement=connection.createStatement();
			ResultSet rSet=statement.executeQuery(sql);
			
			while(rSet.next()) {
				System.out.println(rSet.getString("FIRST_NAME")+" "+rSet.getString("LAST_NAME")+" "+ rSet.getString("JOB_ID") +" "+ rSet.getString("SALARY")+" "+ rSet.getString("COMMISSION_PCT") +"\n");
			}
			
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
