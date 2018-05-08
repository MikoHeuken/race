
public class Rennstrecke {

	double length;
	int round;
	double racelength;
	String name;
	
	
	public Rennstrecke(String name, double length, int round){
		
		this.name = name;
		this.length = length;
		this.round = round;
		racelength = length*round;
		
	}
	
}
