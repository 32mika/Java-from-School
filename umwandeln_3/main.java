package umwandeln_3;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int id;
		int eingabe;

		Scanner scan = new Scanner(System.in);
		Umwandeln trans = new Umwandeln();
		
		System.out.println("Bitte geben sie eine in welches Zahlensystem ihre natuerliche Zahl umgewandelt werden soll. 1: Binaersystem 2: Hexadezimal 3: Oktalsystem.");
		id = scan.nextInt();
		
		if(id > 3 | id < 1) {
			System.out.println("Falsche Eingabe");
			System.exit(id);
		}
		
		System.out.println("Bitte geben sie die Zahl ein welche sie umwandeln wollen.");
		eingabe = scan.nextInt();
		
		
		System.out.println("");
		System.out.print(trans.start(eingabe, id));
		
	}

}
