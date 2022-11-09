package Java_schule;
import java.util.Scanner;

public class fHausaufgaben {

	public static void main(String[] args) {
		double R;
		double A;
		double PI;
		double Pd;
		double dd;
		double Ld;
		double I;
		double U;
		String Ps;
		String Ls;
		String ds;
		
		//String P;
		Pd = 0;
		Ld = 0;
		I = 25;
Scanner scan = new Scanner(System.in);

System.out.println("Berechnung des elektrischen Widerstands, mit der Formel R=P(L/A)");
System.out.println("Laenge angeben in Metern : ");
Ls = scan.next();
System.out.println("Durchmesser angeben in Metern : ");
ds = scan.next();
System.out.println("1. <-Eingeben für spezifischen Widerstand von Kupfer 2. Fuer Aluminium 3. Fuer freien Wert");  
Ps = scan.next();

if(Ls.matches("\\d+(\\.\\d{0,20})?")){ 
Ld	= Double.parseDouble(Ls);
}else{
	while(Ls.matches("\\D+")) {
	System.out.println("Die Eingabe fuer die Laenge ist Inkorrekt.");
	System.out.println("Geben sie den Wert fuer die Laenge neu ein: ");
	Ls = scan.next();
	
	}
Ld = Double.parseDouble(Ls);
}

if(ds.matches("\\d+(\\.\\d{0,20})?")){ 
dd = Double.parseDouble(ds);
}else{
	while(ds.matches("\\D+")) {
		System.out.println("Die Eingabe für den Durchmesser ist Inkorrekt.");
		System.out.println("Geben sie den Wert fuer den Durchmesser neu ein: ");
		ds = scan.next();
	}
dd = Double.parseDouble(ds);	
}

if(Ps.matches("[1,2,3]")){ 
	System.out.println();
}else{
	while(!Ps.equals("1") && !Ps.equals("2") && !Ps.equals("3")) {
		System.out.println("Die Eingabe fuer die spezifischen Auswahlmoeglichkeit ist inkorrekt.");
		System.out.println("Bitte Treffen sie ihre Wahl neu: 1. spezifischer Widerstand fuer Kupfer 2. spezifischer Widerstand fuer Aluminium 3. selber gewaehlten Wert");
		Ps = scan.next();
	}
	}


if(Ps.matches("1")){
	Pd = 0.01721;
	
}else if(Ps.matches("2")){
	Pd = 0.265;

	
}else if(Ps.matches("3")) {
	System.out.println("Geben sie ihren selbstbestimmten Wert fuer den spezifischen Widerstand ein: ");
	Ps = scan.next();
		if(Ps.matches("\\d+(\\.\\d{0,20})?")){ 
			Pd = Double.parseDouble(Ps);
			}else{
				while(Ps.matches("\\D+")) {
					System.out.println("Die Eingabe für den spezifischen Widerstand ist Inkorrekt.");
					System.out.println("Geben sie den Wert fuer den spezifischen Widerstand neu ein: ");
					Ps = scan.next();
		}
Pd = Double.parseDouble(Ps);				
		} 
}

scan.close();
PI = Math.PI / 4;	
A = dd*dd*PI;	
R = Pd*(Ld/A);
U = R * I;
System.out.println("Der elektrische Widerstand betraegt: " + R);
System.out.println("Die Spannung betraegt: " + U + " fuer eine Stromstaerke von 25 Ampere.");
	}

}
