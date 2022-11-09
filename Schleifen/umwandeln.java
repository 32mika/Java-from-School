package Schleifen;
import java.util.Scanner;

public class umwandeln {

	public static void main(String[] args) {
		int zahl;
		int zahl_s;
		int rest_i;
		String rest_s;
		char[] reverse;
		
		Scanner scan = new Scanner(System.in);
		rest_s = "";
		
		System.out.println("Geben sie die Zahl an, welche sie in eine Binaerzahl umwandeln wollen.");
		zahl = scan.nextInt();
		zahl_s = zahl;

		
		while(zahl != 0) {			
			zahl = zahl / 2;
			rest_i = zahl_s % 2;
			rest_s = rest_s + Integer.toString(rest_i);
			zahl_s = zahl;
			
		}
		
		reverse = new char[rest_s.length()];
		reverse = rest_s.toCharArray();
		rest_s = "";
		
		for(int i = reverse.length - 1; i >= 0; i--) {
			rest_s = rest_s + reverse[i];

		}
		
		System.out.println("Die Dezimalzahlumgewandelt in eine Binaerzahl sieht wie folgt aus: " + rest_s);
		
		
	}

}
