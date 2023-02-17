package methoden;

import java.util.*;

public class ISBN13_zu_ISBN10 {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		String ISBN13;
		String ISBN10;
		
		System.out.println("Bitte geben sie die ISBN ein, welche von einer 13 ISBN zu einer 10 ISBN gemacht werden soll");
		ISBN13 = scan.next();
		
		ISBN10 = del(ISBN13);
		ISBN10 = pZeichen(ISBN10);
		System.out.println("Ihre umgewandelte ISBN10 lautet: " + ISBN10);
		
	}
	
	public static String del(String ISBN13) {
		String ISBN10;
		
		ISBN10 = ISBN13.substring(3, 12);
		
		return ISBN10;
	}
	
	public static String pZeichen(String ISBN10) {
		String zeichen;
		int summe = 0;
		int zahl;
		char[] ziffer = ISBN10.toCharArray(); 
		
		for(int i = 0, j = 1; i < 9; i++, j++) {
			zahl = Character.getNumericValue(ziffer[i]);
			summe = summe + zahl * j;
			
		}
		
		summe = summe % 11;
		
		if(summe == 10) {
			zeichen = "X";
		
		}else {
			zeichen = Integer.toString(summe);
		
		}
		
		ISBN10 = ISBN10 + zeichen;
		
		return ISBN10;
	}
	
}
