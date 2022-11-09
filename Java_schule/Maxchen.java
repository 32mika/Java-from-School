package Java_schule;
import java.util.Scanner;

public class Maxchen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int wert1;
		int wert2;
		int Punkte;
		boolean gr;
		Punkte = 0;
	
		System.out.println("Bitte geben sie die Augenzahl ihres ersten Wurf ein: ");
		wert1 = scan.nextInt();
		System.out.println("Jetzt den zweiten Wurf bitte: ");
		wert2 = scan.nextInt();
		scan.close();
	
		if(wert1 > 6 | wert1 < 0 | wert2 > 6 | wert2 < 0) {
			System.out.println("Fehler bei der Wert eingabe");
			System.exit(wert1);
		}
	
		if(wert1 == 1 & wert2 == 2 | wert1 == 2 & wert2 == 1) {
			System.out.println("Glueckwunsch sie haben ein Maexchen geworfen.");
			Punkte = 1000;
		}else if(wert1 == wert2){
			System.out.println("Sie haben einen Pasch geworfen.");
			Punkte = wert1 * 100;
		}else{
			System.out.println("Sie haben keinen speziellen Wert geworfen.");
			if(wert1 > wert2) {
				gr = true;
			}else {
				gr = false;
			}if(gr = true) {
				Punkte = 10 * wert1 + wert2;
			}else {
				Punkte = 10 * wert2 + wert1;
			}
			 
		}
		
		System.out.println("Sie haben " + Punkte + " Punkte erreicht.");
		
	
	
	}

}
