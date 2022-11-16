package Schleifen;
import java.util.Scanner;

public class happynumbers {
	
	
	public static void main(String[] args) throws InterruptedException {
		String eingabe_s; 
		String[] eingabe_a;
		int eingabe_i;
		int count;
		int eingabehoch;
		int zw_gesamt;
		int gesamt;
		
		Scanner scan = new Scanner(System.in);
		count = 0;
		zw_gesamt = 0;
		gesamt = 0;
		
		System.out.println("Geben sie die ganze Zahl ein, fuer welche sie die Happy Numbers Zahlenreihe haben wollen.");
		eingabe_i = scan.nextInt();
		eingabe_s = Integer.toString(eingabe_i);
		eingabe_a = new String[eingabe_s.length()];
		
		while(gesamt != 1.0 & count < 21) {
			eingabe_a = eingabe_s.split("(?<=.)");
			
		for(int i = 0; i < eingabe_s.length(); i++) {
			eingabe_i = Integer.parseInt(eingabe_a[i]);
			eingabehoch = (int)Math.pow(eingabe_i, 2);
			zw_gesamt = zw_gesamt + eingabehoch;
			
			
		}
		
		gesamt = zw_gesamt;
		zw_gesamt = 0;
		
		System.out.print(gesamt);
		System.out.print(" -> ");
		
		eingabe_s = Integer.toString(gesamt);
		count++;
	}
		
		if(gesamt == 1) {
			System.out.print("die eingegebene Zahl ist eine froehliche Zahl");
		
		}else {
			System.out.print("die eingegebene Zahl ist eine unglueckliche Zahl");
		
		}
		
		
		
		
		}
}
