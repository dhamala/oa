package p1;


public class DisabledSportsType1 implements SportsTypeAbstractFactory{
	
	public OutdoorAdventureSports createAdventureSports() { 
		return new BungeeJumpingDisabled(); 
		}
	public OutdoorRegularSports createOutdoorRegularSports(){
		return new WheelChairCricket(); 
		}
	

	
	

}
