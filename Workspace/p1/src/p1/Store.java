package p1;
import java.util.ArrayList;

public class Store {
	ArrayList<Observer> customer=new ArrayList<>();
	float per=0.0f;
	
	public void register(Observer o) {
		customer.add(o);
	}
	
	public void unRegister(Observer o) {
		int index=customer.indexOf(o);
		if(index>=0) {
			customer.remove(index);
			System.out.println(o+ "is removed");
		}
	}
	
	public void notifyObserver() {
		for(Observer o:customer) {
			o.update(per);
		}
	}
	
	public void setDiscount(float per,String fest) {
		System.out.println("Happy "+ fest);
		this.per = per;
		notifyObserver();
	}
}