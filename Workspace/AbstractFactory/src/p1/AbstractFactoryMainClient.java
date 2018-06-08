package p1;


public class AbstractFactoryMainClient {

	public static void main(String[] args) {
 
		
		DisabledSportsEnthusiast SunilRamesh = new DisabledSportsEnthusiast(); 
		SportsEquipment mySports; 
		mySports = SunilRamesh.createSports("Bungee-Cricket Disabled"); 
		
		mySports.displayDetails();
		
		mySports = SunilRamesh.createSports("Para Gliding-Cricket Disabled"); 
		
		mySports.displayDetails();
		

	}

}
