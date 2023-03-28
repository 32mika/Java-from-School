package KFZ_Aufgabe2;

import java.util.*;

public class KFZ {
	private String kennzeichen;
	private int kilometerstand;
	private int tankvolumen;
	private double verbrauch;
	private double tankmenge;
	private static String[] buchstaben = {"a", "b", "c", "d", "e", "f", "g" , "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "y", "z"};
	private static Random rand = new Random();
	
	KFZ(String kennzeichen, int kilometerstand, int tankvolumen, double verbrauch, double tankmenge){
		this.kennzeichen = kennzeichen;
		this.kilometerstand = kilometerstand;
		this.tankvolumen = tankvolumen;
		this.verbrauch = verbrauch;
		this.tankmenge = tankmenge;
		
	}
	
	KFZ(){
		this.kennzeichen = "ESW" + erzKennzeichen();
		this.kilometerstand = 0;
		this.tankvolumen = 60;
		this.verbrauch = 0.06;
		this.tankmenge = tankvolumen;
		
	}
	
	public void tanken(double menge) {
		if(tankmenge + menge > tankvolumen) {
			System.out.println("Du kannst deinen Tank nicht überlaufen lassen");
			System.exit(1);
		
		}
		tankmenge = tankmenge + menge;
		System.out.println("Du hast getankt! Deine Tankfüllung beträgt jetzt: " + tankmenge + " Liter");
	}

	public void fahren(int strecke) {
		if(tankmenge - strecke * verbrauch < 0) {
			System.out.println("Soweit wirst du nicht mehr fahren können!");
			System.exit(1);
			
		}
		kilometerstand = kilometerstand + strecke;
		tankmenge = tankmenge - strecke * verbrauch;
		
		System.out.println("Du bist eine Strecke von " + strecke + "Km gefahren! Dein Kilometerstand ist jetzt bei: " +  kilometerstand);
		
	}
	
	public int maximalFahrbareStrecke() {
		return (int) (tankmenge / verbrauch);
	}

	public void kfzWerte() {
		System.out.println(kennzeichen + " " + kilometerstand + " " + tankvolumen + " " + verbrauch + " " + tankmenge);
	}
	
	private String erzKennzeichen() {
		String gesamt; 
		
		gesamt = buchstaben[rand.nextInt(26)] + buchstaben[rand.nextInt(26)];
		gesamt = gesamt + rand.nextInt(1000);
		
		return gesamt;
	}
	
}
