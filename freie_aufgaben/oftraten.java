package freie_aufgaben;

import java.util.Scanner;
import java.util.Random;

public class oftraten {

	public static void main(String[] args) {
		int random;
		int userzahl;
		int count;
		boolean wahr = false;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		random = rand.nextInt(101);
		count = 2;
		
		while(wahr != true) {
			System.out.println("Bitte geben sie ihre ganzzahlige Schaetzung ein. 1-100");
			userzahl = scan.nextInt();
			if(random == userzahl) {
				System.out.println("Richtig. Gewonnen");
				wahr = true;
			}else if(random > userzahl) {
				System.out.println("Die Zahl ist groesser als die Schaetzung");
				System.out.println("Sie haben noch " + count + " Versuche uebrig");
				--count;
			}else {
				System.out.println("Die Zahl ist kleiner als die Schaetzung");
				System.out.println("Sie haben noch " + count + " Versuche uebrig");
				--count;
			}
		}
		
		
		
		
		
		
		
		
	}	
}


