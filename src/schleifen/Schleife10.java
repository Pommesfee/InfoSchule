package schleifen;

public class Schleife10 {

	public static void main(String[] args) {
		
		int k = 9;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= k; j++) {
				System.out.print("*");
			}
			System.out.println("");
			k--;
		}
		
	}
	
}
