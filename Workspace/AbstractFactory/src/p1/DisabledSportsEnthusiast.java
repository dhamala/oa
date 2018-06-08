package p1;

public class DisabledSportsEnthusiast extends SportsEnthusiast {
	
	SportsTypeAbstractFactory mySportsTypeAF1 = new DisabledSportsType1(); 
	SportsTypeAbstractFactory mySportsTypeAF2 = new DisabledSportsType2(); 
	
	 
		public SportsEquipment createSports(String s) {
			
			if(s.equals("Bungee-Cricket Disabled"))
			
			return new OutdoorSportsEquipment(mySportsTypeAF1);
			else if (s.equals("Para Gliding-Cricket Disabled"))
			return new OutdoorSportsEquipment(mySportsTypeAF2);	
			else 
			return null; 
		}


}