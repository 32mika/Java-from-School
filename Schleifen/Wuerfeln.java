package Schleifen;
import java.util.Random;

public class Wuerfeln {

	public static void main(String[] args) {
		int zahl1;
		int zahl2;
		int versuch;
		
		Random rand = new Random();
		zahl1 = 0;
		zahl2 = 0;
		versuch = 1;
		
		while(zahl1 != 6 & zahl2 != 6) {
			
			zahl1 = rand.nextInt(6);
			zahl2 = rand.nextInt(6);
			zahl1++;
			zahl2++;
			
			if(zahl1 > zahl2) {
				System.out.println("Deine erste Zahl gewuerfelte Zahl ist die " + zahl1 + " und die zweite Zahl ist die " + zahl2);
			
			}else {
				System.out.println("Die erste Zahl ist die " + zahl2 + " die zweite Zahl ist die " + zahl1);
			}
			
			if(zahl1 == 6 || zahl2 == 6) {
				System.out.println("Glueckwunsch du hast eine 6 gewuerfelt und das hat " + versuch + " Versuche gedauert.");
			
			}else {
				System.out.println("Immernoch keine 6 gewuerfelt in deinem " + versuch + " Versuch.");
			}
			
			System.out.println();
			versuch++;
		}
		
		
		
		
		
	}

}
