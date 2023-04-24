package Studentendatenbank;

public class test {

	public static void main(String[] args) {

		Studenten top = new Studenten(1000);
		System.out.println(top.statsStudents());
		top.ausgabeDaten();
		
	}

}
