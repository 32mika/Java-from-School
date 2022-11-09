package freie_aufgaben;
import java.util.Scanner;

public class RautenundRechtecke {

	public static void main(String[] args) {
		int hoehe;
		int laenge;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wie hoch soll ihr Rechteck sein?");
		hoehe = scan.nextInt();
		System.out.println("Wie lange soll ihr Rechteck sein?");
		laenge = scan.nextInt();
		
		for(int y = 0; y < hoehe; y++) {
			System.out.println(" ");
			for(int x = 0; x < laenge; x++) {
				System.out.print("#");
			}
		}
		
	
	
	
	
	
	}

}
