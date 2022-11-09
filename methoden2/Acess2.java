package methoden2;

public class Acess2 {

	public static void main(String[] args) {
		Isright test = new Isright();
		String x;
		String y;
		
		x = test.Zahl("1.312321312a");
		
		y = test.Test("12.0a");
		System.out.println(y);
	}
}
