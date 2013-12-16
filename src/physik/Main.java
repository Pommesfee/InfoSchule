package physik;

public class Main {

	public static void main(String[] args) {
		
		double aceleration = 9.81; // m/s^2
		Parabel parabel = new Parabel(aceleration);
		for (int i = 0; i < 100; i++) {
			double d = parabel.wayTime(i);
			System.out.println(d);
		}
	}
	
}
