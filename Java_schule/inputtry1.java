package Java_schule;
import java.util.Scanner;


public class inputtry1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String Ps;
		double Pd;
		double x;
		x = 12;

		System.out.println("Wert für Ps eingeben: ");
		Ps = scan.next();
		//Pd = Double.parseDouble(Ps);

		while (Ps == "\\d+(\\.\\d{0,20})?"){
			System.out.println("Falsche Eingabe für Ps bitte neu eingeben: ");	
			Ps = scan.next();
	} 


System.out.println("Eingabe erfolgreich Ps: " + Ps );	
	}
}

// if(Ps.matches("-?\\d*")){