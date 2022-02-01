package coreJavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food> foodlist = new ArrayList<>();
		ManageFood managefood = new ManageFood();
		int select;
		
		Scanner bp = new Scanner(System.in);
		do {
			Menumain();
			select = Integer.parseInt(bp.nextLine());
			switch (select) {
			case 1:
				do {
					MenuManageFood();
					select = Integer.parseInt(bp.nextLine());
					switch (select) {
					case 1:
						managefood.bp();
						break;
					case 2:
						managefood.print();
						managefood.EditFood();
						break;
					case 3:
						managefood.print();
						managefood.DeleteFood();
						break;
					case 4:
						//managefood.search();
						managefood.print();
						managefood.PrintOrder();
						break;
					//case 0:
						//System.out.println("Back");
						//break;
					default:
						break;
					}
				}while (select !=0);
				break;
			case 2:
				do {
					MenuOrder();
					select = Integer.parseInt(bp.nextLine());
					switch (select) {
					case 1:
						managefood.print();
						managefood.Price();
						break;
                    case 0:
						System.out.println("Back");
						break;
					default:
						break;
					}
				}while (select !=0);
				break;
			
			default:
				break;
			}
		}while (select !=3);

				
	}
			static void MenuManageFood() {
				
				System.out.println(".............MENU MANAGE FOOD.............");
				System.out.println("0. Back To Main Menu");
				System.out.println("1. Add Food In Menu List");
				System.out.println("2. Edit Food Name In Menu ");
				System.out.println("3. Delete Food From Menu");
				System.out.println("4. Print Ordered Table Information");
				//System.out.println("5. Payment");
				System.out.println("..........................................");
				System.out.println("Select");
			}
		static void MenuOrder() {
	
			System.out.println(".............MENU ORDER.............");
			System.out.println("0. Back To Main Menu");
			System.out.println("1. Print Total Payment");
			System.out.println("....................................");
			System.out.println("Select");
			
		}
		static void Menumain() {
			System.out.println("*********** WELCOME TO RAJE RESTAURANT ***************************");
			
			System.out.println("******************************************************************");
			System.out.println(" Welcome to our place !! You will find happiness and food here !! ");
			System.out.println("******************************************************************");
			System.out.println(".............MENU MAIN.............");
			System.out.println("1. Manage Food");
			System.out.println("2. Manage Order");
			System.out.println("3. Exit");
		
		//managefood.bp();
		//managefood.print();
		
		//managefood.Price();
		//managefood.PrintOrder();
		

	}

}
