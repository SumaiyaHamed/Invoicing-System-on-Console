package InvoicingSystemOnConsolePackage;

import java.sql.SQLException;
import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		ApplicationMainMenu applicationMainMenu = new ApplicationMainMenu();
		Shop_Setting shop_Setting = new Shop_Setting();
		Manage_Shop_Item manage_Shop_Item = new Manage_Shop_Item();
		Groceries_Shop_Invoice_Table groceries_Shop_Invoice_Table = new Groceries_Shop_Invoice_Table();
		Groceries_Shop_Item_Table groceries_Shop_Item_Table = new Groceries_Shop_Item_Table();
		Groceries_Shop_Shop_Table groceries_Shop_Shop_Table = new Groceries_Shop_Shop_Table();
		Groceries_Shop_Invoice_Header_Table groceries_Shop_Invoice_Header_Table = new Groceries_Shop_Invoice_Header_Table();

		do {

			boolean Exit = true;
			while (Exit) {
				applicationMainMenu.main_Menu();

				System.out.println("..........................................");

				System.out.println("Please Select Option:");
				int user = sc.nextInt();
				System.out.println("..........................................");

				switch (user) {

				case 1:

					boolean tableSettingExit = true;
					while (tableSettingExit) {

						System.out.println("1- Create Tables  \r\n" + "2- Insert Into Tables \r\n");

						System.out.println("..........................................");

						System.out.println("Please Select Option:");
						int user1 = sc.nextInt();
						System.out.println("..........................................");

						switch (user1) {

						case 1:

							//groceries_Shop_Invoice_Table.createTable();

							// groceries_Shop_Invoice_Table.createTable();
							// System.out.println("..........................................");
						//	groceries_Shop_Item_Table.createTable();
//				System.out.println("..........................................");
							 groceries_Shop_Shop_Table.createTable();
						
							System.out.println("..........................................");
//				

							break;

						case 2:

							break;

						}

					}
				case 2:
					boolean shopSettingExit = true;
					while (shopSettingExit) {
						shop_Setting.Shop_Setting_Menu();

						System.out.println("..........................................");

						System.out.println("Please Select Option:");
						int user1 = sc.nextInt();
						System.out.println("..........................................");

						switch (user1) {

						case 1:

							break;

						case 2:

							groceries_Shop_Shop_Table.insertIntoTable();

							break;

						case 3:

							break;
						}
					}

					break;

				case 3:

					manage_Shop_Item.Manage_Shop_Item_Menu();

					break;

				}

			}

		} while (false);

	}

}
