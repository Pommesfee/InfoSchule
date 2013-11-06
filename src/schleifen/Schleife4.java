package schleifen;

public class Schleife4 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		int c = 0;
		for (int i = 0; i <= 19; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);

		}
		
	}
	
}
