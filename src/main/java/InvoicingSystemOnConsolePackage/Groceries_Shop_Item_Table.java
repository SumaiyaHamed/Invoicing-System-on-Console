package InvoicingSystemOnConsolePackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Groceries_Shop_Item_Table {

	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Product " + "(id INTEGER AUTO_INCREMENT," +
		                                      "  product_name  VARCHAR(80), " +
		                                      "quantity FLOAT , "+"price FLOAT , "+"shop_id INTEGER, "+
				                              " PRIMARY KEY (id),"+
		                                      "FOREIGN KEY (shop_id) REFERENCES Shop(id) )";
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

		System.out.println("Enter the product_name:");
		String product_name = sa.next();
		
		System.out.println("Enter the quantity:");
		float quantity = sa.nextFloat();

		
		System.out.println("Enter the price:");
		float price = sa.nextFloat();
		
		
		java.sql.Connection conn1 = DriverManager.getConnection(url, username,
                password);
		try {
		

			String sql = "INSERT INTO Product(product_name,quantity,price)"+" VALUES('"+product_name+"',"+quantity+","+price+")";
						              
			

			
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
	
	
	public static void deleteById() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String username = "root";
		String password = "root";
		Connection conn = null;
		Statement stmt = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e) {
				System.out.println(e);
			}
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created successfully:");
			stmt = (Statement) conn.createStatement();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter any id to delete an Item data :");
			int userinput = scanner.nextInt();
			java.sql.Statement st = conn.createStatement();
			String sql = "delete from Hotels where id ='" + userinput + "'";
			int result = st.executeUpdate(sql);
			System.out.println("Record has been delete in the table successfully..................");
		} catch (SQLException excep) {
			excep.printStackTrace();
		} catch (Exception excep) {
			excep.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Please check it in the MySQL Table. Record is now delete.......");

	}
	
	public static void updateById() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String username = "root";
		String password = "root";
		Connection conn = null;
		Statement stmt = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e) {
				System.out.println(e);
			}
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created successfully:");
			stmt = (Statement) conn.createStatement();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter  id to Update Item data :");
			int userinput = scanner.nextInt();
			System.out.println("Please Enter the new price:");
			String price = scanner.next();
			

			java.sql.Statement st = conn.createStatement();
			String sql = "UPDATE Hotels SET hotel_name='" + price + ",price=" 
					+ "' WHERE id='" + userinput + "'";
			int result = st.executeUpdate(sql);
			System.out.println("updated  successfully...");
		} catch (SQLException excep) {
			excep.printStackTrace();
		} catch (Exception excep) {
			excep.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Please check it in the MySQL Table.......");

	}
	
	
	
	public static void sellectMethod() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String username = "root";
		String password = "root";

		//Scanner sa = new Scanner(System.in);

		//java.sql.Connection conn1 = DriverManager.getConnection(url, username, password);
		
		String sql = "SELECT * FROM Product";
		Connection con = null;
		
		try {
			
			// System.out.println("added successfully");

			Driver driver1 = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver1);
			con = DriverManager.getConnection(url, username, password);
			Statement st = (Statement) con.createStatement();
			 ResultSet n = ((java.sql.Statement) st).executeQuery(sql);

			//ResultSet n = st.executeQuery(sql);
			 while (n.next()) {
			System.out.println("==================================");
			System.out.println(" id:" + n.getString(1));
		    System.out.println(" product_name:" + n.getString(2));
		
		    System.out.println(" quantity:" + n.getString(4));
		    System.out.println(" price:" + n.getString(5));
		  
		    
			System.out.println("==================================");
		}
	
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}
}
	


