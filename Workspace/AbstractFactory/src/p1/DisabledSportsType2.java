package p1;


public class DisabledSportsType2 implements SportsTypeAbstractFactory{
	
	public OutdoorAdventureSports createAdventureSports() { 
		return new ParaGlidingDisabled(); 
		}
	public OutdoorRegularSports createOutdoorRegularSports(){
		return new WheelChairCricket(); 
		}
	/*public IndoorRegularSports createIndoorRegularSports(){
		return new SquashDisabled(); 
		}*/

	
	

}
