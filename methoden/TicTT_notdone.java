package TicTacToe;

import java.util.*;

public class TicTT_notdone {
	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_RESET = "\u001B[0m";
	private static final String ANSI_BLUE = "\u001B[34m";
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	static boolean fertig = false;
	static String[] alles = {"1", "|", "2", "|", "3", "4", "|", "5", "|", "6", "7", "|", "8", "|", "9"};
	static int[] already_set = new int[9];
	static int round = 0;
	static int null_safe = 8;
		
	
	public static void main(String[] args) {
		anfangen();
		
		System.out.println("1|2|3");
		System.out.println("4|5|6");
		System.out.println("7|8|9");
		
		while(fertig != true) {
			input();
			won();
		
		}	
	}
	
	public static void input() {
		int preKreuz;
		int preNull;
		int[] back = new int[2];
		
		System.out.println("");
		System.out.println("Zahl des Feldes in welches gesetzt wird?");
		preKreuz = scan.nextInt();
		preNull = rand.nextInt(9) +1;
		preKreuz = check(preKreuz);
			
		back = already(preKreuz, preNull);
		preKreuz = back[0];
		preNull = back[1];
		
		output(preKreuz, preNull);
	
	}
	
	public static void won() {
		if(alles[0].equals("X") & alles[2].equals("X") & alles[4].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
		
		}else if(alles[5].equals("X") & alles[7].equals("X") & alles[9].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}else if(alles[10].equals("X") & alles[12].equals("X") & alles[14].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}else if(alles[0].equals("X") & alles[5].equals("X") & alles[10].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}else if(alles[2].equals("X") & alles[7].equals("X") & alles[12].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}else if(alles[4].equals("X") & alles[9].equals("X") & alles[14].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}else if(alles[0].equals("X") & alles[7].equals("X") & alles[14].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}else if(alles[4].equals("X") & alles[7].equals("X") & alles[10].equals("X")) {
			System.out.println("Glueckwunsch du hast gewonnen.");
			System.exit(1);
			
		}
	
		
		
		if(alles[0].equals("O") & alles[2].equals("O") & alles[4].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[5].equals("O") & alles[7].equals("O") & alles[9].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[10].equals("O") & alles[12].equals("O") & alles[14].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[0].equals("O") & alles[5].equals("O") & alles[10].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[2].equals("O") & alles[7].equals("O") & alles[12].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[4].equals("O") & alles[9].equals("O") & alles[14].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[0].equals("O") & alles[7].equals("O") & alles[14].equals("O") ) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}else if(alles[4].equals("O") & alles[7].equals("O") & alles[10].equals("O")) {
			System.out.println("Leider verloren!");
			System.exit(1);
			
		}
	}
	
	public static void output(int preKreuz, int preNull) {
		int count = 0;
			
		if(preKreuz == 1) {
			alles[0] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 2) {
			alles[2] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 3) {
			alles[4] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 4) {
			alles[5] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 5) {
			alles[7] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 6) {
			alles[9] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 7) {
			alles[10] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 8) {
			alles[12] = ANSI_RED + "X" + ANSI_RESET;
		
		}else if(preKreuz == 9) {
			alles[14] = ANSI_RED + "X" + ANSI_RESET;
		
		}
		
		won();
		
		if(preNull == 1) {
			alles[0] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 2) {
			alles[2] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 3) {
			alles[4] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 4) {
			alles[5] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 5) {
			alles[7] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 6) {
			alles[9] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 7) {
			alles[10] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 8) {
			alles[12] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}else if(preNull == 9) {
			alles[14] = ANSI_BLUE + "O" + ANSI_RESET;
		
		}
		
		already_set[round] = preKreuz;
		already_set[null_safe] = preNull;
		
		for(String j : alles) {
			System.out.print(j);
			if(count == 4 | count == 9) {
				System.out.println("");
			
			}
			count++;
		
		}
		round++;
		null_safe--;
		
		if(round == 5) {
			fertig = true;
		}
		
	}
	
	public static int[] already(int preKreuz, int preNull) {
		int[] out = new int[2];
		boolean richtig = false;
		
		for(int i = 0; i < 9; i++) {
			while(richtig != true){
				if(preKreuz == already_set[i]) {
					System.out.println("Doppelte Eingabe. Bitte Wiederholen!");
					preKreuz = scan.nextInt();
					i = 0;
				
				}else if(preNull == already_set[i]){
					preNull = rand.nextInt(9) +1;
					i = 0;
				
				}else if(preNull == preKreuz) {
					preNull = rand.nextInt(9) +1;
					i = 0;
				
				}else if(round == 3) {
					preNull = 10;
					richtig = true;
				
				}else {
					richtig = true;
				
				}
			}
			richtig = false;
	
		}
		out[0] = preKreuz;
		out[1] = preNull;
		
		return out;
	}
	
	public static int check(int eingabe) {
		boolean richtig = false;
		
		while(richtig != true) {
			if(eingabe <= 0 | eingabe >= 10) {
				System.out.println("Falsche Eingabe. Bitte gib eine Zahl von 1-9 an");
				eingabe = scan.nextInt();
			
			}else{
				richtig = true;
				
			}
		}

		return eingabe;
	}
	
	public static void anfangen() {
		String in;
		boolean weiter = false;
		
		System.out.println("Nun wird ausgewaehlt wer anfaengt. Der Computer oder du! Kopf oder Zahl");
		in = scan.next();
		in = in.toLowerCase();
		
		while(weiter != true) {
			if(in.equals("kopf") | in.equals("zahl")) {
				weiter = true;
			
			}else {
				System.out.println("Falsche Eingabe bitte wiederholen!");
				in = scan.next();
			
			}
		}
		System.out.println("");
		System.out.println("Du darfst beginnen!");
	
	}
}