package package1;

import java.util.ArrayList;
import java.util.Scanner;


public class ItemsList { 
	
	String itemName; 
	float itemPrice; 
	Scanner scan; 
	ArrayList<ItemsList> onlineAL = new ArrayList<ItemsList>();
	
	String getName() { 
		return itemName; 
	}
	
	float getPrice() { 
		return itemPrice; 
	}
	
	ItemsList(String name, float price ){ 
		itemName = name; 
		itemPrice = price;
	}
	
	ItemsList(){ 
		onlineAL.add(new ItemsList("Treadmill", (float) 39500.75)); 
		onlineAL.add(new ItemsList("Football", (float) 795.25)); 
		onlineAL.add(new ItemsList("Bicycle", (float) 19580.5)); 
		onlineAL.add(new ItemsList("Volleyball", (float) 875.25)); 
		onlineAL.add(new ItemsList("Ski-Equipment", (float) 25355.75)); 
		onlineAL.add(new ItemsList("Cricket-Set", (float) 15355.75)); 
		getItemDetails(); 
	}
	
	public String toString() { 
		return  "Item Name: "+ itemName + "\t"+ "Item Price: "+ itemPrice; 
	}
	
	void addItems() { 
		boolean addItem = true;
		int i = 0; 
		scan = new Scanner(System.in) ;
		System.out.println("Enter the Items available for Online Decathlon Store with the price for each"); 
		String response; 
		
		
	
		while(addItem) {
			System.out.println("Enter the name of item# "+(i+1));  
			itemName = scan.next(); 
			System.out.println("Enter the price of item# "+(i+1));  
			itemPrice = scan.nextFloat(); 
			System.out.println("Do you want to add another item?"); 
			response = scan.next(); 
			

			onlineAL.add(new ItemsList(itemName,itemPrice)); 
			
			if(response.equals("YES") || response.equals("yes")  || response.equals("Yes") || response.equals("y")  || response.equals( "Y")) { 
				addItem = true; 
				i++; 
			}
			else { 
				addItem = false; 
			} 
		}
	}
	
	
	void getItemDetails(){ 
		
		for(ItemsList i : onlineAL) { 
		System.out.println(i); 
	    }
		System.out.println("**************************"); 
	}
	
	
	boolean searchItem(String item) { 
		String str; boolean exists = false;  
		for(int j=0; j<onlineAL.size(); j++) { 
			str = onlineAL.get(j).getName(); 
		if(str.equals(item)) { 
			exists = true; System.out.println(str+" present "+exists); break; 
			
		} 
		else { 
			exists = false;
			
		} 
		}
		return exists; 
	}
	
	
	float calculatePrice(int qty,String item) {
		float price = 0; String str;
		for(int j=0; j<onlineAL.size(); j++) { 
			str = onlineAL.get(j).getName(); 
			if(str.equals(item)) {
			price = onlineAL.get(j).getPrice(); break; 
			}
		} 
			return price*qty; 
		
	}
	
}
