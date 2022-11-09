package methoden;

public class Round {
	
/*	private double round1;
	private int stellen; */
	
	
	public Round() {
		
	}
	
	public double back(double round1, int stellen) {
		// round1 = zahl welche gerundet werden soll
		// stellen = auf welche stelle hinter dem Komma
		
		
		String rundenauf_s;
		double rundenauf_d;
		
		rundenauf_d = 0;
		rundenauf_s = "1";
		stellen--;
		
		for(int i = stellen; 0 <= i; i--) {
			rundenauf_s = rundenauf_s + "0";
		}
		
		rundenauf_s = rundenauf_s + ".0";
		rundenauf_d = Double.parseDouble(rundenauf_s);
		
		round1 = Math.round(round1*rundenauf_d)/rundenauf_d;
		return round1;
	} 
	
	
	
	
	
}
