package p1;
public class DiscountDemo {

	public static void main(String[] args) {
		Store s =new Store();
		Customer c1 = new Customer(s,"sachin");
		Customer c2 = new Customer(s,"sahana");
		Customer c3 = new Customer(s,"Bhavana");
		s.setDiscount(10.0f,"Holi");
		s.unRegister(c2);
		s.setDiscount(20.0f,"New Year");	
		}

}