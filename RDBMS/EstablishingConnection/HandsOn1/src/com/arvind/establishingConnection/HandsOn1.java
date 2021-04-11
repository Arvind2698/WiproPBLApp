package com.arvind.establishingConnection;

import java.sql.*;

public class HandsOn1 {
	public static void main(String[] arg) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
			
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
			System.out.println("Connection successful");
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Connection failed");
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
