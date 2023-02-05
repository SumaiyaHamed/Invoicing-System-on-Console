package InvoicingSystemOnConsolePackage;

import java.util.Arrays;
import java.util.List;

public class ApplicationMainMenu {

	public static void getMenuArray(int option) {

		List<String> mainMenu = Arrays.asList("_____Main menu____", "1-Shop Settings", "2- Manage Shop Items ",
				"3- Create New Invoice ", "4- Report: Statistics ", "5- Report: All Invoices  ",
				"6- Search (1) Invoice ", "7- Program Statistics ", "8- Exit ");

		List<String> shopSettingMenu = Arrays.asList("_____Shop_Setting_Menu____", "1- Load Data ",
				"2- Set Shop Name and Set Invoice Header ", "3- Go Back ");
		
		List<String> manageSettingMenu = Arrays.asList("_____Manage_Shop_Item_Menu____", " 1- Add Items ",
				" 2- Delete Items ", "3- Change Item Price ", "4- Report All Items ", "3- Go Back ");
		
		switch(option) {
		
		case 1:
			
			PrintMenu(mainMenu);
			break;
			
case 2:
			
			PrintMenu(manageSettingMenu);
			break;
			
case 3:
	
	PrintMenu(shopSettingMenu);
	break;
		
		}
		

	}

	private static void PrintMenu(List<String> PrintMenu) {
		// TODO Auto-generated method stub
		
		   for (String x: PrintMenu) {
		    	
				System.out.println(x);

		    }
		
	}

}
