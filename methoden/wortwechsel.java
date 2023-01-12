package array;
import java.util.Scanner;
import java.util.Random;

// Funktioniert noch nicht

public class wortwechsel {

	public static void main(String[] args) {
		String wort;
		String end;
		char[] bst1;
		char[] bst2;
 		int[] zahlen;
		int count;
		int zufallZ;
		int i;
		
		//boolean doppelt;
		
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(scan.hasNext()) {
			wort = scan.next(); // 7
			bst1 = new char[wort.length()]; // arr größe 7
			zahlen = new int[wort.length() - 2]; // arr größe 7
			
			count = 0;
			i = 0;
			bst1 = wort.toCharArray();
			bst2 = wort.toCharArray();
			
			//System.out.print(bst1[0]);
			
			
			for(int j = 0; i < wort.length() -2; i++) {  // i bis 5
				zufallZ = rand.nextInt(wort.length()-2);
				zufallZ++; 
				zufallZ++;
				count++;
				
				
				for(int d = 0; d < count; d++){  // count 2
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
			
			for(int e = 1, c = 0; e < zahlen.length + 2; e++, c++) {
				System.out.println(bst2[c] + "");
				
				//bst1[e] = bst2[zahlen[c]];
				//System.out.print(bst1[e]);
				
			}
		
		
		}
		
		
	}

}
