package com.arvind.establishingConnection;

import java.sql.*;

public class HandsOn2 {
	public static void main(String[] arg) throws Exception {
		// Class.forName("oracle.jdbc.OracleDriver");
		// in the earlier versions of java it was mandatory to register the driver but now in the later 
		// version we just need to set the class path of the driver and java will automatically detect and load the driver
				
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
