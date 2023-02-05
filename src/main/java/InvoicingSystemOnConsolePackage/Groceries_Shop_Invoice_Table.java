package InvoicingSystemOnConsolePackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Groceries_Shop_Invoice_Table {

	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Invoice " + "(id INTEGER AUTO_INCREMENT," + " customer_name  VARCHAR(255), "
				+ " Phone_No INTEGER, " + " invoice_date Date , " + " NO_items INTEGER , " + "total_amount FLOAT , "
				+ "paid_amount FLOAT , " + "balance FLOAT ," + "product_id INTEGER ," + "PRIMARY KEY (id),"
				+ "FOREIGN KEY (product_id) REFERENCES Product(id) )";
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
		Date invoice_date = new Date(System.currentTimeMillis());

		System.out.println("Enter the customer_name:");
		String customer_name = sa.next();

		System.out.println("Enter the Phone_No:");
		int Phone_No = sa.nextInt();

		System.out.println("Enter the NO_items:");
		int NO_items = sa.nextInt();

		System.out.println("Enter the total_amount:");
		float total_amount = sa.nextFloat();

		System.out.println("Enter the paid_amount:");
		float paid_amount = sa.nextFloat();

		System.out.println("Enter the balance:");
		int balance = sa.nextInt();

		java.sql.Connection conn1 = DriverManager.getConnection(url, username, password);
		try {

			String sql = "INSERT INTO Invoice(customer_name,Phone_No,NO_items,total_amount,paid_amount,balance)"
					+ " VALUES('" + customer_name + "'," + Phone_No + "," + NO_items + "," + total_amount + ","
					+ paid_amount + "," + balance + ")";

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

	public static void sellectMethod() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String username = "root";
		String password = "root";

		// Scanner sa = new Scanner(System.in);

		// java.sql.Connection conn1 = DriverManager.getConnection(url, username,
		// password);

		String sql = "SELECT * FROM Invoice";
		Connection con = null;

		try {

			// System.out.println("added successfully");

			Driver driver1 = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver1);
			con = DriverManager.getConnection(url, username, password);
			Statement st = (Statement) con.createStatement();
			ResultSet n = ((java.sql.Statement) st).executeQuery(sql);

			// ResultSet n = st.executeQuery(sql);
			while (n.next()) {
				System.out.println("==================================");
				System.out.println(" id:" + n.getString(1));
				System.out.println(" customer_name:" + n.getString(2));
				// System.out.println(" Phone_No:" + n.getString(3));
				System.out.println(" invoice_date:" + n.getString(4));
				System.out.println(" NO_items:" + n.getString(5));
				System.out.println(" total_amount:" + n.getString(6));
				// System.out.println(" paid_amount:" + n.getString(7));
				System.out.println(" balance:" + n.getString(8));

				System.out.println("==================================");
			}

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

	public static void getById() throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String username = "root";
		String password = "root";

		Scanner sa = new Scanner(System.in);

		System.out.println("Enter id :");
		int user = sa.nextInt();

		String sql = "select * from Invoice where id =" + user;
		Connection con = null;

		try {

			// System.out.println("added successfully");

			Driver driver1 = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(driver1);
			con = DriverManager.getConnection(url, username, password);
			Statement st = (Statement) con.createStatement();
			ResultSet n = ((java.sql.Statement) st).executeQuery(sql);

			// ResultSet n = st.executeQuery(sql);
			while (n.next()) {
				System.out.println("==================================");
				System.out.println(" id:" + n.getString(1));
				System.out.println(" customer_name:" + n.getString(2));
				System.out.println(" Phone_No:" + n.getString(3));
				System.out.println(" invoice_date:" + n.getString(4));
				System.out.println(" NO_items:" + n.getString(5));
				System.out.println(" total_amount:" + n.getString(6));
				System.out.println(" paid_amount:" + n.getString(7));
				System.out.println(" balance:" + n.getString(8));

				System.out.println("==================================");
			}

			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}

}
