package physik;

public class Parabel {

	private double aceleration;
	
	public double wayTime(double time) {
		double res;
		res = (0.5*aceleration) * (time*time);
		return res;
	}
	
	private void setAceleration(double aceleration) {
		this.aceleration = aceleration;
	}
	
	public Parabel(double aceleration) {
		setAceleration(aceleration);
	}
	
}
