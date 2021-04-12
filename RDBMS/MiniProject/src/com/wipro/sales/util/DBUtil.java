package com.wipro.sales.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
		return connection;		
	}
}
