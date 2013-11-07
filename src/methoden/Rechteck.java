package methoden;

public class Rechteck {

	public double flaeche(double laenge, double seite) {
		double res;
		res = laenge * seite;
		return res;
	}
	
	public double umfang(double laenge, double seite) {
		double res;
		res = (laenge * 2) + (seite * 2);
		return res;
	}
	
}
