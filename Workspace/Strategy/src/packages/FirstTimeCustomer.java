package packages;

//The logic of DiscountType12 can vary, but the FirstTimeCustomer is always "tied" to it 
public class FirstTimeCustomer extends DecathlonCustomer {
	
		
	 FirstTimeCustomer() {
			super();
			iCC = new DiscountType2(); 
			
		} 
		
		public void display() { 
			
			System.out.println("\nHello Welcome to Decathlon!Congratulations for visiting our store for first time"); 
			super.display(); 
		}

	}
