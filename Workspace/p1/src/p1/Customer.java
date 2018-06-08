package p1;

public class Customer implements Observer {
	Store store;
	String name;
	public Customer(Store store,String name) {
		this.store = store;
		this.name = name;
		store.register(this);
	}
	
	@Override
	public void update(float per) {
		System.out.println(this+" you have a discount of:"+per+"%");
	}
	
	public String toString() {
		return name;
	}

}
