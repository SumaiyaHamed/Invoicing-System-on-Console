package InvoicingSystemOnConsolePackage;

import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ApplicationMainMenu applicationMainMenu= new ApplicationMainMenu();
		Shop_Setting shop_Setting=new Shop_Setting();
		Manage_Shop_Item manage_Shop_Item=new Manage_Shop_Item();
		
		do {
			
			boolean Exit=true;
			while(Exit) {
			applicationMainMenu.main_Menu();
			
			System.out.println("..........................................");

			System.out.println("Please Select Option:");
			int user=sc.nextInt();
			System.out.println("..........................................");

			
			switch(user) {
			case 1:
				boolean shopSettingExit=true;
				while(shopSettingExit) {
				shop_Setting.Shop_Setting_Menu();
				
				System.out.println("..........................................");

				System.out.println("Please Select Option:");
				int user1=sc.nextInt();
				System.out.println("..........................................");

				switch(user1) {
				case 1:
					
				break;
				}
				}
				
				break;
				
            case 2:
				
            	manage_Shop_Item.Manage_Shop_Item_Menu();
				
				break;
			
			}
			
			}
			
		}while (false);
		



	}

}
