package com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.util.DBUtil;


public class SalesDao {
	public int insertSales(Sales sale) throws SQLException {
		Connection connection=DBUtil.getDBConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO TBL_SALES VALUES(?,?,?,?,?)");
		preparedStatement.setString(1, sale.getSalesID());
		preparedStatement.setDate(2, new Date(sale.getSalesDate().getYear(), sale.getSalesDate().getMonth(), sale.getSalesDate().getDate()) );
		preparedStatement.setString(3, sale.getProductID());
		preparedStatement.setInt(4, sale.getQuantitySold());
		preparedStatement.setDouble(5, sale.getSalesPricePerUnit());
		
		return preparedStatement.executeUpdate();
	}
	
	public static String generateSaleId(java.util.Date saleDate) throws SQLException {
		Connection connection=DBUtil.getDBConnection();
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL");
		
		int SEQ_SALES_ID = 0;
		while(resultSet.next()) {
			SEQ_SALES_ID=resultSet.getInt(1);
		}
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy");
		String saleYear=df.format(saleDate).substring(2, 4);
		String saleId=saleYear+SEQ_SALES_ID;
		
		return saleId;
	}
	
	public ArrayList<SalesReport> getSalesReport() throws SQLException{
		Connection connection=DBUtil.getDBConnection();
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT * FROM V_SALES_REPORT");
		
		ArrayList<SalesReport> salesReports=new ArrayList<SalesReport>();
		while(resultSet.next()) {
			SalesReport report=new SalesReport();
			report.setSalesID(resultSet.getString(1));
			report.setSalesDate(resultSet.getDate(2));
			report.setProductID(resultSet.getString(3));
			report.setProductName(resultSet.getString(4));
			report.setQuantitySold(resultSet.getInt(5));
			report.setProductUnitPrice(resultSet.getDouble(6));
			report.setSalesPricePerUnit(resultSet.getDouble(7));
			report.setProfitAmount(resultSet.getDouble(8));
			salesReports.add(report);
		}
		
		return salesReports;
	}

}
