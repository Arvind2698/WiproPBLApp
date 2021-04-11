package com.arvind.preparedStatements;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DOAclass {
	
	public ResultSet getAllData(Connection connection) throws Exception {
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM EMP");
		return resultSet;
	}
	
	public ResultSet getSingeRecord(Connection connection,int id) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMP WHERE ID=?");
		preparedStatement.setInt(1, id);
		if(preparedStatement.execute()) {
			return preparedStatement.getResultSet();
		}
		return null;
	}
	
	public boolean addData(Connection connection,String[] arg) throws Exception {
		int id=Integer.parseInt(arg[1]);
		String nameString=arg[2];
		String gradeString=arg[3];
		String dOJString=arg[4];
		int salary=Integer.parseInt(arg[5]);
		
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMP VALUES (?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, nameString);
		preparedStatement.setString(3, gradeString);
		preparedStatement.setString(4, dOJString);
		preparedStatement.setInt(5, salary);
		
		if(preparedStatement.executeUpdate()==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deleteSingleRecord(Connection connection,int id) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM EMP WHERE ID=?");
		preparedStatement.setInt(1, id);
		
		if(preparedStatement.executeUpdate()==1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean updateSingleSalary(Connection connection,int id,int updatedSalary) throws SQLException {
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE EMP SET SALARY=? WHERE ID=?");
		
		preparedStatement.setInt(1, updatedSalary);
		preparedStatement.setInt(2, id);
		
		if(preparedStatement.executeUpdate()==1) {
			return true;
		}else {
			return false;
		}
	}
		
	public void displayData(ResultSet resultSet) throws SQLException {
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getInt(5));
		}
	}
}
