package schleifen;

public class Schleife11 {

	public static void main(String[] args) {
		
		int durchläufe = 1;
		for(int i = 1; i <= 21; i++) {
			if(durchläufe == 7) {
				System.out.println(i);
				durchläufe = 1;			
			}else {
				System.out.print(i);
				durchläufe += 1;
			}
		}
		
	}
	
}
