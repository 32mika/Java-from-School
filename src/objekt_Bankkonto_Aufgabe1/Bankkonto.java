package objekt_Bankkonto_Aufgabe1;

import java.util.*;

public class Bankkonto {
	public String vorname;
	public String nachname;
	public long kontonummer;
	public double kontostand;
	public double dispolimit;
	public String[] kontolog = new String[100];
	public int zahlKonto = 0;
	public static Random rand = new Random();
	public static Scanner scan = new Scanner(System.in);
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_BLUE = "\u001B[34m";
	private static final String ANSI_PURPLE = "\u001B[35m";
	
	public Bankkonto(String vorname, String nachname, long kontonummer, double kontostand, double dispolimit){
		this.vorname = vorname;
		this.nachname = nachname;
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		this.dispolimit = dispolimit;
	
	}

	public Bankkonto(String vorname, String nachname, double nettoEinkommen){
		this.vorname = vorname;
		this.nachname = nachname;
		this.kontonummer = kontonummer();
		this.kontostand = 0;
		this.dispolimit = nettoEinkommen * 3;
	
	}
	
	public void start() throws InterruptedException{
		String auswahl;
		double zahlung;
		
		Thread.sleep(1000);
		System.out.println("");
		System.out.println("Bitte waehlen sie zwischen folgenden optionen: ");
		System.out.println("1 - Einzahlung");
		System.out.println("2 - Auszahlung");
		System.out.println("3 - Ausgabe des Kontostandes");
		System.out.println("4 - Ausgabe der Kontobewegungen");
		System.out.println("5 - Ausgabe der Daten des Kontoeigentuemers");
		System.out.println("6 - Beenden des Programms");
		
		auswahl = scan.next();
		
		if(!auswahl.matches("[1-6]")){
			System.out.println("Falsche Eingabe!");
			System.exit(1);
		
		}
		
		if(auswahl.matches("1")) {
			System.out.println("In welcher hoehe soll ihre Einzahlung statt finden?");
			zahlung = scan.nextDouble();	
			einzahlung(zahlung);
			
		}else if(auswahl.matches("2")) {
			System.out.println("In welcher hoehe soll ihre Auszahlung statt finden?");
			zahlung = scan.nextDouble();	
			auszahlung(zahlung);
		
		}else if(auswahl.matches("3")) {
			ausgabeKontostand();
		
		}else if(auswahl.matches("4")) {
			ausgabeKontobewegungen();
		
		}else if(auswahl.matches("5")) {
			System.out.println("Vorname: " + vorname + " Nachname: " + nachname + " Kontonummer:  " + kontonummer + " Kontostand: " + kontostand + " Dispolimit " + dispolimit);
			start();
			
		}else if(auswahl.matches("6")){
			System.out.println("Programm wird beendet...");
			System.exit(1);
		
		}else {
			System.out.println("Ein Fehler ist aufgetreten, bitte versuchen sie es erneut");
		
		}
	}
	
	private long kontonummer() {
		return rand.nextLong(9999999999l);
	}
	
	private void einzahlung(double einzahlung) throws InterruptedException{
		kontolog[zahlKonto] = ANSI_BLUE + "EINZAHLUNG: Konto von " + ANSI_PURPLE + kontostand + "EUR" + ANSI_BLUE + " zu " + ANSI_PURPLE + (kontostand + einzahlung) 
		+ "EUR" + ANSI_BLUE + " Einzahlung um " + ANSI_PURPLE + einzahlung + "EUR" + ANSI_RESET;
		kontostand = kontostand + einzahlung;
		System.out.println(kontolog[zahlKonto]);
		zahlKonto++;
		start();
	}	

	private void auszahlung(double auszahlung) throws InterruptedException{
		if(kontostand - auszahlung < dispolimit){
			System.out.println(ANSI_RED + "Auszahlung nicht möglich! Dispolimit würde erreicht werden" + ANSI_RESET);
		
		}else{
			kontolog[zahlKonto] = ANSI_BLUE + "AUSZAHLUNG: Konto von " + ANSI_PURPLE + kontostand + "EUR" + ANSI_BLUE + " zu " + ANSI_PURPLE + (kontostand - auszahlung) 
					+ "EUR" + ANSI_BLUE + " Auszahlung um " + ANSI_PURPLE + auszahlung + "EUR" + ANSI_RESET;
			kontostand = kontostand - auszahlung;
			System.out.println(kontolog[zahlKonto]);
			zahlKonto++;
		
		}
		start();
	}
	
	private void ausgabeKontostand() throws InterruptedException{
		System.out.println(ANSI_BLUE + "Ihr Kontostand betraegt " + ANSI_PURPLE + kontostand + "EUR " + ANSI_RESET);
		start();
	}
	
	private void ausgabeKontobewegungen() throws InterruptedException{
		for(int i = 0; i < zahlKonto; i++) {
			System.out.println(kontolog[i]);
		
		}
		start();
	}
}
