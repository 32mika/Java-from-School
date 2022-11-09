package Java_schule;
import java.util.Scanner;
public class Umrechner {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double StSekunden;
	double Jahre;
	double Stunden;
	double Minuten;
	double Sekunden;
	double Tage;

System.out.println("Geben sie die Anzahl an Sekunden ein, welche sie umrechen wollen: ");	
StSekunden = scan.nextDouble();


Jahre = (int) (StSekunden/60/60/24/365);
Tage = (int) (StSekunden/60/60/24%365);
Stunden = (int) (StSekunden/60/60%24);
Minuten = (int) (StSekunden/60%60);
Sekunden = (int) (StSekunden%60);

System.out.println("Die Sekunden entsprechen: " + Jahre + " Jahren " + Tage + " Tagen " + Stunden + " Stunden " + Minuten + " Minuten und " + Sekunden + " Sekunden.");
	}

}
