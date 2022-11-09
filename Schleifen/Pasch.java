package Schleifen;

import java.util.Random;


public class Pasch {

	public static void main(String[] args) {
		int zahl1;
		int zahl2;
		int versuch;
		
		Random rand = new Random();
		zahl1 = 0;
		zahl2 = 1;
		versuch = 1;
		
		while(zahl1 != zahl2) {
			
			zahl1 = rand.nextInt(6);
			zahl2 = rand.nextInt(6);
			zahl1++;
			zahl2++;
		
			if(zahl1 == zahl2) {
				System.out.println("Sie haben den Pasch " + zahl1 + "-" + zahl2 + " gewuerfelt. Dafuer haben sie " + versuch + " gebraucht.");
				
				
			}
		
			versuch++;
		}
	
	
	
	
	
	}

}
