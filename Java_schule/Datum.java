package java_schule;

import java.util.Scanner;

public class Datum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Tag_heute;
		int Monat_heute;
		int Jahr_heute;
		int Geburtstag;
		int Geburtsmonat;
		int Geburtsjahr;
		int alter;
		String heute;
		String GeburtK;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcher Tag ist heute?");
		Tag_heute = scan.nextInt();
		System.out.println("Welcher Monat ist heute?");
		Monat_heute = scan.nextInt();
		System.out.println("Welches Jahr ist heute?");
		Jahr_heute = scan.nextInt();
		
		System.out.println("An welchem Tag hast du Geburtstag?");
		Geburtstag = scan.nextInt();
		System.out.println("in welchem Monat hast du Geburtstag?");
		Geburtsmonat = scan.nextInt();
		System.out.println("In welchem Jahr hast du Geburtstag?");
		Geburtsjahr = scan.nextInt();
		scan.close();
		
		
		if(Monat_heute < Geburtsmonat){
			Jahr_heute = Jahr_heute-1;
			alter = Jahr_heute - Geburtsjahr;
		}
		
		else if(Monat_heute == Geburtsmonat) {
			if(Tag_heute < Geburtstag) {
				alter = --Jahr_heute - Geburtsjahr; 
			}else {
				alter = Jahr_heute - Geburtsjahr;
			}
		}else {
			alter = Jahr_heute - Geburtsjahr;
		}
		
		heute = Tag_heute + "." + Monat_heute;
		GeburtK = Geburtstag + "." + Geburtsmonat;
		if(heute.equals(GeburtK)) {
			System.out.println("Alles gute zum Geburtstag");
		}
	
		heute = Tag_heute + "." + Monat_heute + "." + Jahr_heute;
		GeburtK = Geburtstag + "." + Geburtsmonat + "." + Geburtsjahr;
		
		System.out.println("Sie sind " + alter + " Jahre alt.");
		System.out.println("Heute ist der " + heute);
		System.out.println("Dein Geburtstag ist der " + GeburtK);
	
	
	
	
	}

}
