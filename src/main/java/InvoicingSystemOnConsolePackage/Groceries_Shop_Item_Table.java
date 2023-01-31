package InvoicingSystemOnConsolePackage;

import java.sql.Driver;
import java.sql.DriverManager;

public class Groceries_Shop_Item_Table {

	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Product " + "(item_ID INTEGER," +
		                                      "  item_name  VARCHAR(255), " +
		                                      "quantity float , "+
				                              " PRIMARY KEY ( item_ID ))";
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
	

}
