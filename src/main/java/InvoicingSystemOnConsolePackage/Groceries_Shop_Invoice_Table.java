package InvoicingSystemOnConsolePackage;

import java.sql.Driver;
import java.sql.DriverManager;

public class Groceries_Shop_Invoice_Table {
	
	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Invoice "+"(item_ID" + "REFRENCE Item(id)," +
		                                       " customer_name  VARCHAR(255), "+
				                               " Phone.No INTEGER, " +
                                               " invoice_date Date , " + 
				                               " NO.items INTEGER , " +
				                               "total_amount float , " +
				                               "paid_amount float , " +
				                               "balance float , " ;
		java.sql.Connection conn = null;
		try {
			Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
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
