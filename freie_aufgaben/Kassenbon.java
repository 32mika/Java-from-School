
package freie_aufgaben;
import java.util.Scanner;
public class Kassenbon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] Waren;
		int[] Wmenge;
		double[] Pwaren;
		double Menge;
		double Geld;
		double Gpreis;
		double diff;
		
		
		Gpreis = 0;
		System.out.println("Wie viele Produkte wollen sie kaufen: ");
		Menge = scan.nextDouble();
		System.out.println("Wie viel Geld haben sie zur Verfuegung: ");
		Geld = scan.nextDouble();
		Waren = new String[(int)Menge];
		Pwaren = new double[(int)Menge];
		Wmenge = new int[(int) Menge];
		
		for(int i = 0; i < Menge; i++){
			System.out.println("Geben sie die Ware ein, welche sie kaufen wollen.");
			Waren[i] = scan.next();
			System.out.println("Geben sie den Preis zu dieser Ware ein");
			Pwaren[i] = scan.nextDouble();
			System.out.println("Wie oft möchten sie das Produkt kaufen?");
			Wmenge[i] = scan.nextInt();
			}
		scan.close();
		
		for(int i = 0; i < Menge; i++) {
			Gpreis = Pwaren[i] * Wmenge[i] + Gpreis;
			}
		
		if(Gpreis > Geld) {
			diff = Gpreis - Geld;
			System.out.println("Sie haben nicht genug Geld dabei um alles Waren sie kaufen.");
			System.out.println("Ihnen fehlen " + diff + "EUR um alle Waren zu kaufen.");
			System.exit(0);
			}
		
		for(int i = 0; i < Menge; i++) {
		System.out.println("");
		System.out.println(Waren[i] + " " + Wmenge[i] + " x " + Pwaren[i] + " EUR");
		System.out.println("                          "  + Wmenge[i] * Pwaren[i] + " EUR");
		}
		diff = Geld - Gpreis;
		System.out.println("----------------------------------");
		System.out.println("Gesamt                   " + Gpreis + " EUR");
		System.out.println("Gegeben                  " + Geld + " EUR");
		System.out.println("");
		System.out.println("Zurueck                   " + diff + " EUR");
		
	}

}
