package array;
import java.util.Scanner;
import java.util.Random;


public class wortwechsel {

	public static void main(String[] args) {
		String wort;
		String end;
		String sonderzeichen;
		char[] bst1;
		char[] bst2;
 		int[] zahlen;
		int count;
		int zufallZ;
		int i;
	
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(scan.hasNext()) {
			wort = scan.next(); 
			bst1 = new char[wort.length()]; 
			bst2 = new char[wort.length()];
			zahlen = new int[wort.length() - 2];
			
			sonderzeichen = "";
			count = 0;
			i = 0;
			bst1 = wort.toCharArray();
			bst2 = wort.toCharArray();
			
			System.out.print(bst1[0]);
			
			if(bst1[wort.length() -1] == 46 | bst1[wort.length() -1] == 44 | bst1[wort.length() -1] == 33 | bst1[wort.length() -1] == 63) {
				sonderzeichen = Character.toString(bst1[wort.length()-1]);
				wort = wort.substring(0, wort.length() -1);
				
				bst1 = new char[wort.length()]; 
				bst2 = new char[wort.length()];
				zahlen = new int[wort.length() -2];
				bst1 = wort.toCharArray();
				bst2 = wort.toCharArray();
			
			}
			
			for(int j = 0; i < wort.length() -2; i++) {  
				zufallZ = rand.nextInt(wort.length()-2);
				zufallZ++; 
				zufallZ++;
				count++;
			
				for(int d = 0; d < count; d++){  
					if(zahlen[d] == zufallZ){
						i--;
						count--;
						break;
						
					}else if (d == count-1){
						zahlen[count-1] = zufallZ;
						break;
					}	
				}
			}
			
			for(int e = 1, c = 0; c < zahlen.length; e++, c++) {
				bst1[e] = bst2[zahlen[c]-1];
				System.out.print(bst1[e]);
					
			}
			
			if(sonderzeichen != "") {
				System.out.print(bst1[wort.length()-1]);
				System.out.print(sonderzeichen + " ");
				
			}else {
				System.out.print(bst1[wort.length()-1] + " ");
			
			}
				
		}	
	}
}
