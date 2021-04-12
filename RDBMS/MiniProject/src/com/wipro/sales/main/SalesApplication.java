package com.wipro.sales.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.wipro.sales.bean.Product;
import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.dao.SalesDao;
import com.wipro.sales.service.Administrator;

public class SalesApplication {
	public static void main(String[] arg) throws SQLException {
		System.out.println("-----------------------");
		System.out.println("SALES APPLICATION MENU");
		System.out.println("-----------------------");
		
		System.out.println("1. Insert Stock\n2. Delete Stock\n3. Insert Sale\n4. View Sales Report");
		
		Scanner scanner=new Scanner(System.in);
		int option=scanner.nextInt();
		
		Administrator administrator=new Administrator();
		switch(option) {
		case 1:
			
			Product product =new Product();
			System.out.println("Enter the name of the product: ");
			String productName=scanner.next();
			System.out.println("Enter the quantity on hand: ");
			int quantityOnHand=scanner.nextInt();
			System.out.println("Enter the product unit price: ");
			double productUnitPrice=scanner.nextDouble();
			System.out.println("Enter the reorder level: ");
			int reorderLevel=scanner.nextInt();
			
			product.setProductName(productName);
			product.setQuantityOnHand(quantityOnHand);
			product.setProductUnitPrice(productUnitPrice);
			product.setReorderLevel(reorderLevel);
						
			String insertStockResult=administrator.insertStock(product);
			if(insertStockResult.equals("Data not valid for insertion") || insertStockResult.equals("Data not inserted") || insertStockResult.equals("Invalid Input..")) {
				System.out.println(insertStockResult);
			}else {
				System.out.println("Stock Added Successfully.. ID: "+insertStockResult);
			}
			
			break;
		case 2:
			
			System.out.println("Enter the product ID: ");
			String deleteProductIdString=scanner.next();
			System.out.println(administrator.deleteStock(deleteProductIdString));
			
			break;
		case 3:
			
			System.out.println("Enter the sale date(dd/mm/yyyy): ");
			Date saleDate=new Date(scanner.next());
			System.out.println("Enter the product Id: ");
			String saleProductId=scanner.next();
			System.out.println("Enter the quantity sold");
			int saleQuantity=scanner.nextInt();
			System.out.println("Enter the price per unit: ");
			double pricePerUnit=scanner.nextDouble();
			
			Sales sale=new Sales();
			
			sale.setSalesDate(saleDate);
			sale.setProductID(saleProductId);
			sale.setQuantitySold(saleQuantity);
			sale.setSalesPricePerUnit(pricePerUnit);
			
			SalesDao salesDao=new SalesDao();
			String saleId=salesDao.generateSaleId(saleDate);
			
			sale.setSalesID(saleId);
			
			System.out.println(administrator.insertSale(sale));
			
			break;
		case 4:
			
			ArrayList<SalesReport> salesReports=administrator.getSalesReport();
			
			if(salesReports.size()==0) {
				System.out.println("No Sales history available");
			}
			
			for(int i=0;i<salesReports.size();i++) {
				SalesReport salesReport=salesReports.get(i);
				System.out.println("Sales Id: "+salesReport.getSalesID());
				System.out.println("Sales Date: "+salesReport.getSalesDate());
				System.out.println("Product Id: "+salesReport.getProductID());
				System.out.println("Product Name: "+salesReport.getProductName());
				System.out.println("Quantity Sold: "+salesReport.getQuantitySold());
				System.out.println("Product unit price: "+salesReport.getProductUnitPrice());
				System.out.println("Product sale price: "+salesReport.getSalesPricePerUnit());
				System.out.println("Profit Amount: "+salesReport.getProfitAmount());
				
				System.out.println("-----------------------------------------------------");
			}
			
			break;
		default:
			System.out.println("Invalid input");
		}
		
		scanner.close();
	}

}
