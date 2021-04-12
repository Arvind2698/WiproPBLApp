package com.wipro.sales.service;

import java.util.ArrayList;
import java.util.Date;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;

import com.wipro.sales.bean.Product;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.dao.SalesDao;
import com.wipro.sales.dao.StockDao;

public class Administrator {
	public String insertStock(Product product) throws SQLException {
		if( product==null || product.getProductName().length()<2 ) {
			return "Data not valid for insertion";
		}else{
			try {
				StockDao stockDao=new StockDao();
				String productId=stockDao.generateProductId(product.getProductName());
				product.setProductID(productId);
				int result=stockDao.insertStock(product);
				if(result==1) {
					return productId;
				}else {
					return "Data not inserted";
				}
			}catch (SQLIntegrityConstraintViolationException e) {
				// TODO: handle exception
				return "Invalid Input..";
			}
		}
	}
	
	public String deleteStock(String productId) throws SQLException {
		StockDao stockDao=new StockDao();
		int result=stockDao.deleteStock(productId);
		if(result==1) {
			return "Deleted";
		}else {
			return "Record can not be deleted";
		}
	}
	
	public String insertSale(Sales sale) throws SQLException {
		if(sale==null) {
			return "Object not valid for insertion";
		}
		String productIdString=sale.getProductID();
		StockDao stockDao=new StockDao();
		
		Product product=stockDao.getStock(productIdString);
		
		if(product==null) {
			return "Unknown product for sale";
		}else {
			if(product.getQuantityOnHand()>=sale.getQuantitySold()) {
				
				Date currentDate=new Date();
				SimpleDateFormat dFormat=new SimpleDateFormat("dd/mm/yyyy");
				dFormat.format(currentDate);
				
				if(sale.getSalesDate().compareTo(currentDate)>0) {
					return "Invalid Date ";
				}else {
					
					try {
						SalesDao salesDao=new SalesDao();
						int result=salesDao.insertSales(sale);
						
						if(result==1) {
							
							if(stockDao.updateStock(productIdString, sale.getQuantitySold()) == 1){
								return "Sale Completed";
							}else {
								return "Error";
							}
							
							
						}else {
							return "Error";
						}
					}catch (SQLIntegrityConstraintViolationException e) {
						// TODO: handle exception
						return "Invalid Input";
					}
					
					
				}
				
				
			}else {
				return "Not enough stock in hand for sale";
			}
		}
		
	}
	
	public ArrayList<SalesReport> getSalesReport() throws SQLException{
		SalesDao salesDao=new SalesDao();
		
		return salesDao.getSalesReport();
	}
	
	
}
