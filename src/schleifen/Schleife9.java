package schleifen;

public class Schleife9 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			
			int j = i;
			String str = "*";
			for(int k = 1; k <= j; k++) {
				System.out.print(str);
			}
			System.out.println("");
		}
		
	}
	
}
