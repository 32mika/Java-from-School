package Schleifen;

public class reverse {

	public static void main(String[] arg) {

		String stringinput = "0110111";

    char[] resultarray = stringinput.toCharArray();
    System.out.println(resultarray);

    for (int i = resultarray.length - 1; i >= 0; i--)
    	System.out.print(resultarray[i]);



	}
}
