package InvoicingSystemOnConsolePackage;

import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Groceries_Shop_Invoice_Table {
	
	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Invoice " + "(invoice_ID INTEGER," +
		                                       " customer_name  VARCHAR(255), "+
				                               " Phone_No INTEGER, " +
                                               " invoice_date Date , " + 
				                               " NO_items INTEGER , " +
				                               "total_amount float , " +
				                               "paid_amount float , " +
				                               "balance float ,"+
				                               "item_ID INTEGER ,"+
				                               "FOREIGN KEY (item_ID) REFERENCES Product(item_ID) ,"+"PRIMARY KEY (invoice_ID))";
		java.sql.Connection conn = null; 
		try {
			Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, user, pass);
			java.sql.Statement st = conn.createStatement();
			int m = st.executeUpdate(sqlDB);
			if (m >= 1) {
				System.out.println("Created table in given database...");
				return true;
			} else {
				System.out.println(" table already Created in given database...");
			}
			conn.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return false;
		

	}
	
	
	public static void insertIntoTable() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String username = "root";
		String password = "root";

		Scanner sa = new Scanner(System.in);
		Date invoice_date=new Date(System.currentTimeMillis());

		System.out.println("Enter the invoice_ID:");
		int invoice_ID = sa.nextInt();
		
		System.out.println("Enter the customer_name:");
		String customer_name = sa.next();

		System.out.println("Enter the Phone_No:");
		int Phone_No = sa.nextInt();
		
//		System.out.println("Enter the invoice_date:");
//		Date invoice_date = sa.nextD;
		
		System.out.println("Enter the NO_items:");
		int NO_items = sa.nextInt();
		
		System.out.println("Enter the total_amount:");
		float total_amount = sa.nextFloat();
		
		System.out.println("Enter the paid_amount:");
		float paid_amount = sa.nextFloat();
		
		System.out.println("Enter the balance:");
		int balance = sa.nextInt();
		
		System.out.println("Enter the item_ID:");
		int item_ID = sa.nextInt();
		
		String sql = "select item_ID  from Product =" + item_ID + "";
		
		java.sql.Connection conn1 = DriverManager.getConnection(url, username,
                password);
		try {
		

			String sql1 = "INSERT INTO Invoice VALUES(?,?,?,?,?,?,?,?,?)";
						              
			
			
			PreparedStatement pstmt = conn1.prepareStatement(sql);
			pstmt.setInt(1, invoice_ID);
			pstmt.setString(2, customer_name);
			pstmt.setInt(3, Phone_No);
			pstmt.setDate(4, invoice_date);
			pstmt.setInt(5, NO_items);
			pstmt.setFloat(6, total_amount);
			pstmt.setFloat(7, paid_amount);
			pstmt.setInt(8, balance);
			pstmt.setInt(9, item_ID);
			pstmt.executeUpdate();
			
			System.out.println("added successfully");
			
			Driver driver1 = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver1);
			conn1 = DriverManager.getConnection(url, username, password);
			Statement st = (Statement) conn1.createStatement();
			int m = ((java.sql.Statement) st).executeUpdate(sql);
			if (m >= 1) {
				System.out.println("Inserte table in database is success...");
			} else {
				System.out.println(" table already Inserte in given database...");
			}
			conn1.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	
	} 


		

}

