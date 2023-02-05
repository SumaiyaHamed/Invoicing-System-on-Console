package InvoicingSystemOnConsolePackage;

import java.awt.Menu;
import java.sql.SQLException;
import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		ApplicationMainMenu applicationMainMenu = new ApplicationMainMenu();
		//Shop_Setting shop_Setting = new Shop_Setting();
		//Manage_Shop_Item manage_Shop_Item = new Manage_Shop_Item();
		Groceries_Shop_Invoice_Table groceries_Shop_Invoice_Table = new Groceries_Shop_Invoice_Table();
		Groceries_Shop_Item_Table groceries_Shop_Item_Table = new Groceries_Shop_Item_Table();
		Groceries_Shop_Shop_Table groceries_Shop_Shop_Table = new Groceries_Shop_Shop_Table();

		do {

			boolean mainMenu = true;
			while (mainMenu) {
			//	applicationMainMenu.main_Menu();
				
			 
				applicationMainMenu.getMenuArray(1);
			 

				System.out.println("..........................................");

				System.out.println("Please Select Option:");
				String user = sc.next();
				System.out.println("..........................................");
				int option=Integer.parseInt(user);

				switch (option) {

				case 1:
					boolean shopSettingExit = true;
					while (shopSettingExit) {
						applicationMainMenu.getMenuArray(2);

						System.out.println("..........................................");

						System.out.println("Please Select Option:");
						int user1 = sc.nextInt();
						System.out.println("..........................................");

						switch (user1) {

						case 1:

							break;

						case 2:
							boolean shopSettingExit1 = true;
							while (shopSettingExit1) {

								groceries_Shop_Shop_Table.insertIntoTable();

								System.out.println("If you want to insert more data please press 1 atherwhise press 0");

								int user2 = sc.nextInt();
								if (user2 == 1) {
									groceries_Shop_Shop_Table.insertIntoTable();
								} else {

									shopSettingExit1 = false;

								}
							}

							break;

						case 3:
							shopSettingExit = false;

							break;
						}
					}

					break;

				case 2:

					boolean manageShopExit = true;
					while (manageShopExit) {

						applicationMainMenu.getMenuArray(3);
						
						System.out.println("..........................................");

						System.out.println("Please Select Option:");
						int user1 = sc.nextInt();

						System.out.println("..........................................");

						switch (user1) {

						case 1:

							boolean manageShopExit1 = true;
							while (manageShopExit1) {

								groceries_Shop_Item_Table.insertIntoTable();

								System.out.println("If you want to insert more data please press 1 atherwhise press 0");

								int user2 = sc.nextInt();
								if (user2 == 1) {
									groceries_Shop_Item_Table.insertIntoTable();
								} else {

									manageShopExit1 = false;

								}
							}

							break;

						case 2:

							boolean manageShopExit2 = true;
							while (manageShopExit2) {

								groceries_Shop_Item_Table.deleteById();

								System.out.println("If you want to delete more data please press 1 atherwhise press 0");

								int user2 = sc.nextInt();
								if (user2 == 1) {
									groceries_Shop_Item_Table.deleteById();
								} else {

									manageShopExit2 = false;

								}
							}

							break;

						case 3:

							boolean manageShopExit3 = true;
							while (manageShopExit3) {

								groceries_Shop_Item_Table.updateById();

								System.out.println("If you want to delete more data please press 1 atherwhise press 0");

								int user2 = sc.nextInt();
								if (user2 == 1) {
									groceries_Shop_Item_Table.updateById();
								} else {

									manageShopExit2 = false;

								}
							}

							break;
							
						case 4:

							boolean manageShopExit4 = true;
							while (manageShopExit4) {

								groceries_Shop_Item_Table.sellectMethod();

								System.out.println("If you want to bake to menue press 0");

								int user2 = sc.nextInt();
								if (user2 == 0) {
									manageShopExit2 = false;
								} 
							}

							break;
							
						case 5:
							manageShopExit = false;
							break;

						}
					}

					break;

				case 3:

					boolean invoiceTableExit1 = true;
					while (invoiceTableExit1) {

						groceries_Shop_Invoice_Table.insertIntoTable();

						System.out.println("If you want to insert more data please press 1 atherwhise press 0");

						int user2 = sc.nextInt();
						if (user2 == 1) {
							groceries_Shop_Invoice_Table.insertIntoTable();
						} else {

							invoiceTableExit1 = false;

						}
					}
					break;

				case 4:

					break;

				case 5:
					groceries_Shop_Invoice_Table.sellectMethod();

					break;

				case 6:
					groceries_Shop_Invoice_Table.getById();
					break;

				case 7:

					break;
				case 8:

					System.out.println("If you want to insert more data please press 1 atherwhise press 0");

					int user2 = sc.nextInt();
					if (user2 == 1) {
						applicationMainMenu.getMenuArray(1);
					} else {

						mainMenu = false;

					}

					break;

				}
			}

		} while (false);

	}

}
