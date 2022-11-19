package umwandeln_3;

public class Umwandeln {
		private static int eingabe;
	
		Umwandeln(){
			
		}
		
		
		public String start(int eingabe_Zahl, int id_umwandeln) {
			Umwandeln.eingabe = eingabe_Zahl;
			String return1;
			return1 = "";
			
			if(id_umwandeln == 1) {
				System.out.println("Ihre Zahl ins Binaersystem umgewandelt lautet: ");
				return1 = Umwandeln.ZahlBin();
			
			}else if(id_umwandeln == 2) {
				System.out.println("Ihre Zahl ins Hexadezimalsystem umgewandelt lautet: ");
				return1 = Umwandeln.ZahlHex();
				
			}else if(id_umwandeln == 3) {
				System.out.println("Ihre Zahl ins Oktalsystem umgewandelt lautet: ");
				return1 = Umwandeln.ZahlOkt();
			
			}
			
			return return1;
		} 
		
		public static String ZahlHex() {
			int eingabe1;
			int quotient;
			int rest;
			String return1 = "";
			char[] return_char;
			
			eingabe1 = Umwandeln.eingabe;
			quotient = eingabe1;
			
			while(quotient != 0){
				rest = quotient % 16; 
				quotient = quotient / 16;
				
				if(rest < 10) {
					return1 = return1 + rest;
					
				}else if(rest == 10) {
					return1 = return1 + "A";
					
				}else if(rest == 11) {
					return1 = return1 + "B";
				
				}else if(rest == 12) {
					return1 = return1 + "C";
					
				}else if(rest == 13) {
					return1 = return1 + "D";
					
				}else if(rest == 14) {
					return1 = return1 + "E";
					
				}else if(rest == 15) {
					return1 = return1 + "F";
				
				}
			}
			
			return_char = new char[return1.length()];
			return_char = return1.toCharArray();
			return1 = "";
			
			for (int i = return_char.length - 1; i >= 0; i--) {
				return1 = return1 + return_char[i];
			}
			
			return return1;
		
		}
		
		public static String ZahlOkt() {
			int eingabe1;
			int quotient;
			int rest;
			String return1 = "";
			char[] return_char;
			
			eingabe1 = eingabe;
			quotient = eingabe1;
			
			while(quotient != 0){
				rest = quotient % 8;
				quotient = quotient / 8;
				return1 = return1 + rest;
			
			}
			
			return_char = new char[return1.length()];
			return_char = return1.toCharArray();
			return1 = "";
			
			for (int i = return_char.length - 1; i >= 0; i--) {
				return1 = return1 + return_char[i];
			}
			
			return return1;
		
		}
		
		public static String ZahlBin() {
			int zahl;
			int zahl_s;
			int rest_i;
			String rest_s;
			char[] reverse;
			
			
			zahl = (int)eingabe;
			zahl_s = zahl;
			rest_s = "";

			
			while(zahl != 0) {			
				zahl = zahl / 2;
				rest_i = zahl_s % 2;
				rest_s = rest_s + Integer.toString(rest_i);
				zahl_s = zahl;
				
			}
			
			reverse = new char[rest_s.length()];
			reverse = rest_s.toCharArray();
			rest_s = "";
			
			for(int i = reverse.length - 1; i >= 0; i--) {
				rest_s = rest_s + reverse[i];

			}
		
			return rest_s;
	}

}