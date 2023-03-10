package InvoicingSystemOnConsolePackage;

import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Groceries_Shop_Shop_Table {

	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Shop " + "(id INTEGER AUTO_INCREMENT," + "  shop_name  VARCHAR(255), "
				+ "Tel INTEGER," + "Fax TEXT," + "Email TEXT," + "Website TEXT," + " PRIMARY KEY ( id ))";
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

		System.out.println("Enter the shop_name:");
		String shop_name = sa.next();

		System.out.println("Enter the Tel:");
		int Tel = sa.nextInt();

		System.out.println("Enter the Fax:");
		String Fax = sa.next();

		System.out.println("Enter the Email:");
		String Email = sa.next();

		System.out.println("Enter the Website:");
		String Website = sa.next();

		java.sql.Connection conn1 = DriverManager.getConnection(url, username, password);
		try {

			String sql = "INSERT INTO Shop(shop_name,Tel,Fax,Email,Website)" + " VALUES('" + shop_name + "'," + Tel
					+ ",'" + Fax + "','" + Email + "','" + Website + "')";

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
				System.out.println(" .........................................................................");

			}
			conn1.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}

	}



}
