import java.util.ArrayList;
import java.util.Collections;

public class Rennen {

	public static void main(String[] args) {
		
		ArrayList<Auto> rennen = new ArrayList<Auto>();
		
		Auto a1 = new Auto(1, 200, 60, 20);
		Auto a2 = new Auto(2, 200, 60, 20);
		
		rennen.add(a1);
		rennen.add(a2);
		
		Rennstrecke nordschleife = new Rennstrecke("Nordschleife", 20.83, 60);
		
		a1.fahren(nordschleife.racelength, nordschleife.round);
		a2.fahren(nordschleife.racelength, nordschleife.round);
		
		
		for(Auto a : rennen){
			
			a.fahren(nordschleife.racelength, nordschleife.round);
			System.out.println();
		}
		
		Collections.sort(rennen);
		
		for(Auto a : rennen) {
			
			System.out.println(a);
		}
		
		a1.fahren(nordschleife.racelength, nordschleife.round);
		a2.fahren(nordschleife.racelength, nordschleife.round);
		
	//	System.out.println((a1.fahren(nordschleife.racelength, nordschleife.round))/3600+"h");
	//	System.out.println((a2.fahren(nordschleife.racelength, nordschleife.round))/3600+"h");

	}

}

