package Java_schule;
import java.util.Scanner;

public class Raviolita {

	public static void main(String[] args) {
		double PI;
		PI = Math.PI;
		double u;
		double h;
		double dboden;
		double fboden;
		double fmantel;
		double fgesamt;
		double v;
		Scanner scan = new Scanner(System.in);


		System.out.println("Geben sie den Wert fuer den Umfang ein: ");
		u = scan.nextDouble();
		System.out.println("Geben sie den Wert fuer die Hoehe ein: ");
		h = scan.nextDouble();
		scan.close();
		
		dboden = u/PI;
		fboden = PI*Math.pow(dboden/2, 2);
		fmantel = u * h;
		fgesamt = 2 * fboden + fmantel;
		v = fboden * h;

		System.out.println("Der Durchmesser der Dose betraegt: " + dboden);
		System.out.println("Die Flaeche des Dosenbodens betraegt: " + fboden);
		System.out.println("Die Mantelflaeche der Dose betraegt: " + fmantel);
		System.out.println("Die Gesamtflaeche der Dose betraegt: " + fgesamt);
		System.out.println("Das Volumen der Dose betraegt: " + v);
	}

}
