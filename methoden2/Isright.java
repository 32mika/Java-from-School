package methoden2;

public class Isright {

	private double eingabe;
	private int was;
	
	public Isright() {
		/*this.eingabe = eingabe;
		this.was = was;*/
	}
	
	public String Zahl(String eingabe_s) {
		// eingabe = user input1 welcher geprüft wird. Grund test ist ob er eine Zahl ist.
		// was = user input2 welcher angeben soll was der Input 1 sein sollte. Bsp. double oder int 
		// was = 1 = double oder was = 2 = int
		String passt;
		
		if(!eingabe_s.matches("\\d+(\\.\\d{0,200})?")) {
			passt = "false";
			return passt;
		}else if(eingabe_s.matches("\\d+(\\.\\d{0,200})?")){
			return eingabe_s;
		}
		
		
		return eingabe_s;
	}

	public String Test(String eingabe){
		// Metohe zum Prüfen auf Datentyp. Nur möglichkeit zur Prüfung auf Int oder Double
		
		
		if(eingabe.matches("\\d+")){
			eingabe = "Int";
		}else if(eingabe.matches("\\d+(\\.\\d{0,200})?")){
			eingabe = "Double";
		}else{
			eingabe = "Keiner der zutreffenden Datentypen";
		}
		
		return eingabe;
	}


}