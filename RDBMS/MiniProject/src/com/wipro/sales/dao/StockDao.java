package com.wipro.sales.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.wipro.sales.bean.Product;
import com.wipro.sales.util.DBUtil;

public class StockDao {
	public int insertStock(Product product) throws SQLException {
		Connection connection=DBUtil.getDBConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO TBL_STOCK VALUES(?,?,?,?,?)");
		
		preparedStatement.setString(1, product.getProductID());
		preparedStatement.setString(2, product.getProductName());
		preparedStatement.setInt(3, product.getQuantityOnHand());
		preparedStatement.setDouble(4, product.getProductUnitPrice());
		preparedStatement.setInt(5, product.getReorderLevel());
		
		return preparedStatement.executeUpdate();
	}
	
	public String generateProductId(String productName) throws SQLException{
		Connection connection=DBUtil.getDBConnection();	
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("SELECT SEQ_PRODUCT_ID.NEXTVAL FROM DUAL");
		
		int SEQ_SALES_ID = 0;
		while(resultSet.next()) {
			SEQ_SALES_ID=resultSet.getInt(1);
		}
		
		
		String productId=productName.substring(0,2)+SEQ_SALES_ID;
		
		return productId;
	}
	
	public int updateStock(String productId,int soldQty) throws SQLException{
		
		Connection connection=DBUtil.getDBConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT QUANTITY_ON_HAND FROM TBL_STOCK WHERE PRODUCT_ID=?");
		
		preparedStatement.setString(1, productId);
		
		if(preparedStatement.execute()) {
			ResultSet resultSet=preparedStatement.getResultSet();
			int quantity_in_hand=0;
			
			while(resultSet.next()) {
				quantity_in_hand=resultSet.getInt(1);
				break;
			}
			
			int new_quantity_in_hand=quantity_in_hand-soldQty;
			
			PreparedStatement preparedStatement2=connection.prepareStatement("UPDATE TBL_STOCK SET QUANTITY_ON_HAND=? WHERE PRODUCT_ID=?");
			
			preparedStatement2.setInt(1, new_quantity_in_hand);
			preparedStatement2.setString(2, productId);
			
			return preparedStatement2.executeUpdate();
			
		}else {
			return -1;
		}
	}
	
	public Product getStock(String productId) throws SQLException {
		Connection connection=DBUtil.getDBConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM TBL_STOCK WHERE PRODUCT_ID=?");
		
		preparedStatement.setString(1, productId);
		
		if(preparedStatement.execute()) {
			ResultSet resultSet=preparedStatement.getResultSet();
			
			while(resultSet.next()) {
				Product product=new Product();
				product.setProductID(resultSet.getString(1));
				product.setProductName(resultSet.getString(2));
				product.setProductUnitPrice(resultSet.getDouble(4));
				product.setQuantityOnHand(resultSet.getInt(3));
				product.setReorderLevel(resultSet.getInt(5));
				return product;
			}
		}
		
		return null;
		
	}
	
	public int deleteStock(String productId) throws SQLException{
		Connection connection=DBUtil.getDBConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM TBL_STOCK WHERE PRODUCT_ID=?");
		
		preparedStatement.setString(1, productId);
		
		return preparedStatement.executeUpdate();
	}
}
