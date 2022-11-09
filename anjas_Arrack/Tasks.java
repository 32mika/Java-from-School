package anjas_Arrack;
import java.util.Random;

public class Tasks {
	static Random rand = new Random();
	protected boolean random1;
	protected static String zustand;
	protected static String[][] leute;
	//Tasks task = new Tasks();
	
	public Tasks() {
		/*this.eingabe = eingabe;
		this.was = was;*/
	}
	
	public boolean Rand() {
		boolean random1;
		
		random1 = rand.nextInt(101) < 50; 
		this.random1 = random1;
		
		return random1;
	}
	
	public String Zeit() { 
		String Zeit;
		
		if(rand.nextInt(101) < 50) {
			Zeit = "Nacht";
		}else{
			Zeit = "Tag";
			}
			
		return Zeit;
	}

	public String[][] Schlafen() {
		String[][] Leute;
		Leute = new String[4][4];
		
		Leute[1][0] = "Ritter";
		Leute[2][0] = "Bogenschuetze";
		Leute[3][0] = "Gefangener";
		
		
		for(int i = 1; i < 4; i++) {
			Leute[0][i] = Tasks.Schlafen2();
			//++count;
		}
		
		
		return Leute;
	}
	
	public static String Schlafen2() {
		String zustand2;
		
		if(rand.nextInt(101) < 50) {
			zustand2 = "schlafend";
		}else {
			zustand2 = "wach";
		}
			
		return zustand2;
	}
}