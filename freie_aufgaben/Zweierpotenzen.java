package freie_aufgaben;

public class Zweierpotenzen {

	public static void main(String[] args) {
		int[] Pot;
		int Z;
		
		
		Z  = 0;
		Pot = new int[20];
		
		for(int i = 0; i < 20; i++) {
			Pot[i] = (int)(Math.pow(2, Z));
			Z = ++Z;
			System.out.println(Pot[i]);
		}
		
	
			
		}
	}


