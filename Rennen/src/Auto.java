import java.util.Random;

public class Auto implements Comparable<Auto> {
	
	int nummer;
	double vmax;
	double speed;
	double capacity;
	double consumption;
	double energy_remaining;
	double failure;
	double time;
	
	
	public Auto(int nummer, double vmax, double capacity, double consumption){
		
		this.nummer = nummer;
		this.vmax = vmax;
		this.capacity = capacity;
		this.consumption = consumption;
		this.energy_remaining = this.capacity;
		this.speed = this.vmax;
		
	}
	

	public double fahren(double racelength, int round){
		
		Random random = new Random();
		double range = (capacity/consumption)*100;
		double stops = Math.ceil(racelength/range);
		double stoptime = (21*stops) + (capacity*stops) + random.nextInt((int)stops*3);
		double failure = failure();
		speed = failure;
		time = (racelength/speed)*3600+(stoptime*stops);
		time = time/3600;
		
		return time;
		
	}
	
	public double getTime(){
		
		return time;
	}
	
 
 
	public double failure(){
		
		Random random = new Random();
		int failure = random.nextInt(10);
		return vmax-failure;
	}
	
	
	public void aufladen(){
	  
		energy_remaining = capacity;
		speed = speed-80;
	}
 
	
	public String toString(){
		
		return "Startnummer: "+nummer+
				"\n Vmax: "+vmax+
				"\n Derzeitige Durschnittsgeschwindigkeit: "+speed+
				"\n Akkukapazität: "+capacity+
				"\n Restenergie: "+energy_remaining+
				"\n Verbrauch auf 100km: "+consumption+
				"\n Letzte Rennzeit: "+time;

		

	}
	
	@Override
	public int compareTo(Auto auto){
		
		return Double.compare(this.getTime(), auto.getTime());
	}
  
  
}