package schleifen;

public class Schleife11 {

	public static void main(String[] args) {
		
		int durchl�ufe = 1;
		for(int i = 1; i <= 21; i++) {
			if(durchl�ufe == 7) {
				System.out.println(i);
				durchl�ufe = 1;			
			}else {
				System.out.print(i);
				durchl�ufe += 1;
			}
		}
		
	}
	
}
