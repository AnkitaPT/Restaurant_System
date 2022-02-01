package coreJavaProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {
	ArrayList<Food> foodlist = new ArrayList<Food>();
	ArrayList<GuestOrder> guestorder = new ArrayList<>();
	Food Food;
	public GuestOrder GuestOrder;
	public int SelectFood;
	
	public ManageFood() {
		
	}
	Scanner bp = new Scanner(System.in);
	
	public void bp() {
		System.out.println("Enter Number Of Foods To Add In Menu");
		int n = Integer.parseInt(bp.nextLine());
		for(int i = 0; i< n;i++) {
		Food food = new Food();
		food.input();
		foodlist.add(food);
		}
	}
	public void print() {
		for(int i = 0;i<foodlist.size(); i++) {
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		}
			
	}
	
	public void Price() {
		float PriceFood = 0;
		float Totalpayment = 0;
		int number;
		GuestOrder guest = new GuestOrder();
		guest.input();
		guestorder.add(guest);
		for(int i = 0; i < 10; i++) {
			System.out.println("Select Food "+(i+1));
			SelectFood = bp.nextInt();
			if(SelectFood==0) {
				guest.setTotalPayment(Totalpayment);
				System.out.println("Total Payment: " +Totalpayment);
				//System.out.println(Totalpayment);
				System.out.println("Thank You For Visiting Our Restaurant, See You Again");
				break;
			}
			else {
				System.out.println("Enter Number Of Plates Ordered");
				number = bp.nextInt();
				Food food = foodlist.get(SelectFood-1);
				//number = bp.nextInt();
				guest.setEatList(food);
				guest.setEatList(food);
				PriceFood = food.Price*number;
			}
			Totalpayment+=PriceFood;
			//System.out.println("Order Finished");
			System.out.println("Payment "+(i+1)+" Is:");
			System.out.println(" "+PriceFood);
			System.out.println(" To Finish Order Enter 0");	
		}
	}
	public void PrintOrder() {
		for(int i = 0;i < guestorder.size(); i++) {
			guestorder.get(i).print();
		}
	}
	
	 public void search() {
	    	Scanner bp = new Scanner(System.in);
	    	 String idtable;
	    	 int up=0;
	    	 System.out.println("Enter Table Number For Payment");
	    	 idtable = bp.nextLine();
	    	 for(int i = 0;i <  guestorder.size(); i++) {
	    		 if(guestorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
	    			guestorder.get(i).print();
	    			up++;
	    		 }
}
	    	 if(up==0) {
	    		 System.out.println(" No Table Number "+idtable);
	    	 }
	 }
	 public String EditName() {
		 System.out.println("Enter Food Name To Edit: ");
		 return bp.nextLine();
	 }
	 public float EditPrice() {
		 System.out.println("Enter Food Price To Edit: ");
		 return bp.nextFloat();
	 }
	 public void EditFood() {
		 String namefood;
		 int up=0;
		 System.out.println("Enter Food Name Which You Want To Fix");
		 namefood =bp.nextLine();
		 for(int i = 0;i <foodlist.size();i++) {
			 if(foodlist.get(i).getName().equals(namefood)) {
				up++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				System.out.println("Edited Successfully");
				break;
			 }
		 }
		 if(up==0) 
		 {
		 System.out.println(" Food Name Is Not Available "+namefood);	 
		 }
		 
	 }
	 public void DeleteFood() {
		 String deletefood;
		 int up=0;
		 System.out.println("Enter Food Name To Delete");
		 deletefood=bp.nextLine();
		 //deletefood=bp.nextLine();
		 for(int i = 0; i <foodlist.size();i++) {
			 if(foodlist.get(i).getName().equals(deletefood)) {
				up++;
				foodlist.remove(i);
				System.out.println("Deleted The Food");
			    break;  
			 }
		 }
		 if(up==0) 
		 {
		 System.out.println(" Food Name Is Not Available "+deletefood);	 
		 }
		 
		 
	 }
}