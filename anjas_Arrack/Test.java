package anjas_Arrack;
import java.util.Random;

public class Test {
	Random rand = new Random();
	static Tasks task = new Tasks();
	protected static String zustand;
	
	
	public static void main(String[] args) {
			String[][] Leute;
			int count;
			Leute = new String[3][4];
			count = 1;
			
			/*Leute[0][0] = "Ritter";
			Leute[1][0] = "Bogenschuetze";
			Leute[2][0] = "Gefangener";*/
			
			Leute = task.Schlafen();
			
			//for(int i = 0; i < 3; i++) {
				//Leute[i][count] = Tasks.Schlafen2();
				//++count;
				//}
			
			count = 1;
			for(int i = 0; i < 3; i++) {
				
				System.out.println(Leute[i][0]);
				System.out.println(Leute[i][count]);
				++count; 
				}
			
			//Tasks.leute = Leute;
	}
	}
		