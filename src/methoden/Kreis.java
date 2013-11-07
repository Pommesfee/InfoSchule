package methoden;

public class Kreis {

	public double umfang(double radius) {
		double res;
		res = 2*radius*Math.PI; 
		return res;	
	}

	public double flaeche(double radius) {
		double res;
		res = (radius*radius)*Math.PI; 
		return res;	
	}
	
	public double radiusFromUmfang(double umfang) {
		double res;
		res = umfang/2/Math.PI; 
		return res;	
	}
		
}
