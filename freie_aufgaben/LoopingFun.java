package freie_aufgaben;

public class LoopingFun {

	public static void main(String[] args) {
		int count = 1;
		
		
		
		for(int i = 0; i < 100; i++) {
			//System.out.println(count);
			//count = ++count;
			if(count % 3 == 0 & count % 5 == 0){
				System.out.println("foobar");
				}else if(count % 5 == 0){
					System.out.println("bar");
				}else if (count % 3 == 0){
					System.out.println("foo");	
				}else{
					System.out.println(count);
				}
			count = ++count;
				}

		}

	}


