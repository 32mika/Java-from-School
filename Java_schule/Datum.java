package Java_schule;
import java.util.Scanner;

public class Datum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tag_h;
		int monat_h;
		int jahr_h;
		int tag_g;
		int monat_g;
		int jahr_g;
		int alter;
		String heute;
		String geburtstag;
	
	
		System.out.println("Bitten geben sie das aktuelle Datum ein, in der Reinfolge: Tag, Monat, Jahr");
		tag_h = scan.nextInt();
		monat_h = scan.nextInt();
		jahr_h = scan.nextInt();
		
		System.out.println("Bitte geben sie nun ihr Geburtsdatum ein, in der selben Reinfolge: ");
		tag_g = scan.nextInt();
		monat_g = scan.nextInt();
		jahr_g = scan.nextInt();
	
		heute = tag_h + "." + monat_h + ".";
		geburtstag = tag_g + "." + monat_g + ".";
	
		if(heute.equals(geburtstag)) {
			System.out.println("Herzlichen Glueckwunsch zum Geburtstag");
		}
		
		alter = jahr_h - jahr_g;
		System.out.println("Sie sind " + alter + " Jahre alt.");
	}
}
