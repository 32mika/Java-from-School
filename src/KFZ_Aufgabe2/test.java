package KFZ_Aufgabe2;

public class test {
	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		
		KFZ paul = new KFZ("ESW MK 221", 10324, 80, 0.08, 45.3);
		System.out.println(paul.maximalFahrbareStrecke());
		paul.fahren(565);
		System.out.println(paul.maximalFahrbareStrecke());
		paul.tanken(79);
		paul.fahren(950);
		System.out.println(paul.maximalFahrbareStrecke());
	}

}
