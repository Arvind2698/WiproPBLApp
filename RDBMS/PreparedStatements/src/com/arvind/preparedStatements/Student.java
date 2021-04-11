package com.arvind.preparedStatements;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Student {
	private int roll_number;
	private String name;
	private String standard;
	private Date DOB;
	double fees;

	public boolean checkRollNumber(int roll_number) {
		String rollNumberString=roll_number+"";
		if(rollNumberString.matches("^[0-9]{4}$")){
			this.setRoll_number(roll_number);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean checkName(String name) {
		if(name.matches("^[A-Z]{1,20}$")) {
			this.setName(name);
			return true;
		}else {
			return false;
		}
	}
	public boolean checkStandard(String standard) {
		if( (standard.length()>=1 && standard.length()<=3) && ( standard.matches("^[I]{0,3}$") || standard.matches("^[I]?[V]{1}$") || standard.matches("^[V][I]{0,3}$") || standard.matches("^[I]?[X]$") ) ) {
			this.setStandard(standard);
			return true;
		}else {
			return false;
		}
	}
	
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public static Connection createConnection() throws SQLException {
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","HR","HR");
		return connection;
	}	
	
	public static void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}
	public static boolean addStudentToDatabase(Student stu) throws SQLException {
		
		Connection connection=createConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?)");
		
		preparedStatement.setInt(1, stu.getRoll_number());
		preparedStatement.setString(2, stu.getName());
		preparedStatement.setString(3, stu.getStandard());
		preparedStatement.setDate(4, stu.getDOB());
		preparedStatement.setDouble(5, stu.getFees());
		
		if(preparedStatement.executeUpdate()==1) {
			closeConnection(connection);
			return true;
		}
		
		closeConnection(connection);
		return false;
	}
	
	public static boolean addStudentToLog(int roll,String name,String standard,Date leavingDate) throws SQLException {
		Connection connection=createConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO STUDENT_LOG VALUES(?,?,?,?)");
		
		preparedStatement.setInt(1, roll);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, standard);
		preparedStatement.setDate(4, leavingDate);
		
		if(preparedStatement.executeUpdate()==1) {
			closeConnection(connection);
			return true;
		}
		
		closeConnection(connection);
		return false;
	}
	
	public static String[] getStudentByRoll(int roll) throws SQLException {
		Connection connection=createConnection();
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT STUDENT_NAME,STD FROM STUDENT WHERE ROLL_NO="+roll);
	
		String[] result=new String[2];		
		
		while(resultSet.next()) {
			result[0]=resultSet.getString(1);
			result[1]=resultSet.getString(2);
			closeConnection(connection);
			return result;
		}
		
		closeConnection(connection);
		return null;

	}

	public static boolean removeStudent(int roll) throws SQLException {
		
		String[]  arr=getStudentByRoll(roll);
		if(arr==null) {
			return false;
		}
		
		String nameString=arr[0];
		String standardString=arr[1];
		
		java.util.Date date=new java.util.Date();
		Date leavingDate=new Date(date.getYear(), date.getMonth(), date.getDate());
		
		if(addStudentToLog(roll, nameString, standardString, leavingDate)) {
			
			Connection connection=createConnection();
			Statement statement=connection.createStatement();
			statement.execute("DELETE FROM STUDENT WHERE ROLL_NO="+roll);
			closeConnection(connection);
			return true;			
		}else {
			return false;
		}
	}
	
	public static void displayAllStudents() throws SQLException {
		Connection connection=createConnection();
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM STUDENT");
		int resultCounter=0;
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getDate(4)+" "+resultSet.getDouble(5));
			resultCounter++;
		}
		if(resultCounter==0) {
			System.out.println("Database empty");
		}
		closeConnection(connection);
	}
	
	public static void displayOneStudent(int id) throws SQLException {
		Connection connection=createConnection();
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM STUDENT WHERE ROLL_NO="+id);
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getDate(4)+" "+resultSet.getDouble(5));
			closeConnection(connection);
			return;
		}
		
		System.out.println("Student roll number incorrect");
		closeConnection(connection);
	}
	
	public static boolean updateStudentFee(int roll,double fee) throws SQLException{
		Connection connection=createConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE STUDENT SET FEES=? WHERE ROLL_NO=?");
		
		preparedStatement.setDouble(1, fee);
		preparedStatement.setInt(2, roll);
		
		if(preparedStatement.executeUpdate()==1) {
			closeConnection(connection);
			return true;
		}else {
			closeConnection(connection);
			return false;
		}
	}

	
}
