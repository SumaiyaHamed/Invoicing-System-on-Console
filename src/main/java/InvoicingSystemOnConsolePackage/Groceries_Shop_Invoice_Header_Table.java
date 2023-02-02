package InvoicingSystemOnConsolePackage;

import java.sql.Driver;
import java.sql.DriverManager;

public class Groceries_Shop_Invoice_Header_Table {
	
	public static boolean createTable() {

		String url = "jdbc:mysql://localhost:3306/Groceries_Shop";
		String user = "root";
		String pass = "root";
		String sqlDB = "CREATE TABLE Header " + "(id INTEGER AUTO_INCREMENT," +"Tel INTEGER,"+"Fax TEXT," +"Email TEXT,"+"Website TEXT,"+"detales_id INTEGER "+" REFERENCES Shop(shop_id)ON DELETE CASCADE ,"+
                
                " PRIMARY KEY ( id ))";
				
				
				
				
				
			
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
