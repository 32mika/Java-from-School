package Java_schule;
import java.util.Scanner;

public class Handytarif {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double minuten;
		double preis_m;
		double preis_b;
		double gesamt;
		
		preis_m = 0.248;
		preis_b = 22.98;
		
		
		System.out.println("Bitte geben sie an wie viele Minuten sie telefoniert haben.");
		minuten = scan.nextDouble();
		
		if(minuten > 30){
			minuten = minuten - 30;
			gesamt = minuten * preis_m + preis_b;
		}else {
			gesamt = preis_b;
		}
		System.out.println("Sie muessen " + gesamt + "EUR zahlen.");
	}

}
