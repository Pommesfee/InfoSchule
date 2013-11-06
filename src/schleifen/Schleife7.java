package schleifen;

public class Schleife7 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		for (int i = 1; i <= 10; i++) {
			a = i * i;
			b = a + b;
			System.out.println(b);
		}
		
	}
	
}
