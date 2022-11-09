package anjas_Arrack;
import java.util.Scanner;


public class Anja {
		
	
	public static void main(String[] args) throws InterruptedException {
		String entscheidung;
		String[][] Leute;
		int count;
		int wahl;
		boolean alamiert;
		boolean wahr;
		boolean hund;
		boolean wahl1;
		boolean wahl2;
		boolean wahl3;
		boolean wahl4;
				
		Scanner scan = new Scanner(System.in);
		Tasks task = new Tasks();
	
		
		Leute = new String[3][4];
		Leute = task.Schlafen();
		count = 1;
		alamiert = false;
		wahr = false;
		hund = false;
		wahl1 = false;
		wahl2 = false;
		wahl3 = false;
		wahl4 = false;

		
		System.out.println("Deine beste Freundin Paula wurde entfuerht. Du wirst sie nun retten muessen!");
		Thread.sleep(1000);
		System.out.println("Bevor du deine Verfolgung aufnimmst wirst du dich entscheiden muessen, ob du deinen Hund mitnehmen will? Ja oder Nein?");
		
		entscheidung = scan.next();
		
		if(entscheidung.matches("ja") | entscheidung.matches("Ja") | entscheidung.matches("JA")){
			hund = true;
		}else if(entscheidung.matches("nein") | entscheidung.matches("Nein") | entscheidung.matches("NEIN")) {
			hund = false;
		}else {
			System.out.println("Falsche Eingabe");
			System.exit(0);
		}
		
		System.out.println("");
		Thread.sleep(1000);
		System.out.println("Du hast deine Freundin gefunden jetzt musst du nur noch den richtigen Moment abwarten.");
		Thread.sleep(3000);
		System.out.println("Deine Freundin wird jedoch von einem Ritter und einem Bogenschuetzen bewacht.");
		Thread.sleep(4000);
		System.out.println("Somit hast du folgende Moeglichkeiten: ");
		System.out.println("");
		Thread.sleep(3000);
		System.out.println("schnelle Attacke, spionieren, deiner Freundin signalisieren das du hier bist und als letzte Moeglichkeit, eine direkte Rettungsaktion.");
		System.out.println("");
		Thread.sleep(5000);
		System.out.println("Das Problem ist es stehen dir nicht dauerhaft alle Moeglichkeiten zur Verfuegung");
		Thread.sleep(3000);
		
		
		while(wahr != true) {
			
			System.out.println("");
			System.out.println("Wir haben gerde " + task.Zeit() + ":");
			System.out.println(" ");
			
			Leute = task.Schlafen();
			count = 1;
	
			
			for(int i = 1; i < 4; i++) {
				System.out.println("Der " + Leute[i][0] + " ist " + Leute[0][count]);
				Thread.sleep(3000);
				++count;
				
			}
			
			
			if(alamiert == true) {
				Leute[0][1] = "wach";
			}
			
			
			System.out.println("");
			System.out.println("Somit stehen dir folgende Moeglichkeiten zur Verfuegung:");
			System.out.println("");
			Thread.sleep(3000);
			
			if(Leute[0][1].matches("schlafend")) {
				System.out.print("schnelle Attacke (Option 1), ");
				wahl1 = true;
			
			}	
			
			if(Leute[0][1].matches("wach") | Leute[0][2].matches("wach") | Leute[0][3].matches("wach")) {
				System.out.print("die Gruppe spionieren (Option 2), ");
				wahl2 = true;
				
			}
			
			if(Leute[0][2].matches("schlafend") & Leute[0][3].matches("wach")){
				System.out.print("deine Antwesenheit signalisieren (Option 3), ");
				wahl3 = true;
				
			}
			
			if(Leute[0][2].matches("schlafend") & hund == true) {
				System.out.print("Ins Camp schleichen und die Gefangene befreien (Option 4) oder ");
				wahl4 = true;
				
			}
			
			if(Leute[0][1].matches("schlafend") & Leute[0][2].matches("schlafend") & Leute[0][3].matches("wach")) {
				System.out.print("Ins Camp schleichen und die Gefangene befreien (Option 4) oder ");
				wahl4 = true;
				
			}
			
				System.out.println("oder einen weitern Tag abwarten (Option 5).");
			
			System.out.println("");
			System.out.println("Bitte wahlen sie von den zur Verfuegungstehenden Optionen und geben sie die Nummer an.");
			wahl = scan.nextInt();
			System.out.println("");
			Thread.sleep(3000);
		
			if(wahl == 1 & wahl1 == true) {
				System.out.println("Sie waehlen die schnelle Attacke.");
				Thread.sleep(3000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(3000);
				System.out.println("Glueck gehabt sie hatten Erfolg. Ihre Freundin ist nun frei und sie koennen fliehen.");
				System.exit(wahl);
			
			}else if(wahl == 2 & wahl2 == true) {
				System.out.println("Du beobachtest die Gruppe für einen weiteren Tag");
				Thread.sleep(3000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(3000);
				System.out.println("Du hast nichts neues Herausgefunden. Das schein nicht sonderlich effektiv zu sein.");
				count = 1;
			
			}else if(wahl == 3 & wahl3 == true) {
				System.out.println("Sie haben ihrer Freundin ihre Anwesenheit signalisiert. Hat es jemand gehoert?");
				Thread.sleep(3000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(3000);
				System.out.println("Glueck gehabt keiner hat sie gehoert. Ihre Freundin wird dauerhaft wachsam sein.");
				
				alamiert = true;
				
			}else if(wahl == 4 & wahl4 == true) {
				System.out.println("Sie schleichen sich in das Camp ein und probieren ihre Freundin zu befreien.");
				Thread.sleep(3000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(3000);
				System.out.println("Glueck gehabt sie hatten Erfolg. Ihre Freundin ist nun frei und sie koennen fliehen.");
				System.exit(wahl);
				
			}else {
				System.out.println("Sie entscheiden sich einen weiteren Tag zu warten");
				Thread.sleep(3000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(1000);
				System.out.println("...");
				Thread.sleep(3000);
				
		
			}
			
			
		}
		scan.close();
	
	
	
	
	}

}
