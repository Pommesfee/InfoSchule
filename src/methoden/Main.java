package methoden;

public class Main {

	public static void main(String[] args) {
		
		double radius = 5;
		double x;
		double y;
		double z;
		
		Kreis kreis = new Kreis();
		x = kreis.umfang(radius);
		y = kreis.flaeche(radius);
		z = kreis.radiusFromUmfang(kreis.umfang(radius));
		
		System.out.println("Kreisumfang: " + x);
		System.out.println("Kreisflaeche: " + y);
		System.out.println("Radius: " + z);
		
		double laenge = 5;
		double seite = 5;
		double xy;
		double yz;
		
		Rechteck rechteck = new Rechteck();
		xy = rechteck.flaeche(laenge, seite);
		yz = rechteck.umfang(laenge, seite);
		
		System.out.println("Rechteckumfang: " + xy);
		System.out.println("Rechteckflaeche: " + yz);
	}
	
}
