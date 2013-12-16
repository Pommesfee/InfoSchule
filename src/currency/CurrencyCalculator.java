package currency;

public class CurrencyCalculator {

	private String[] currency;
	private double[] changeValue;

	private void initValues() {
		// Verfügbare Währungen
		currency = new String[5];
		currency[0] = "Euro";
		currency[1] = "US Dollar";
		currency[2] = "Britisches Pfund";
		currency[3] = "Kanadischer Dollar";
		currency[4] = "Australischer Dolla";

		// Wechselkurs nach Euro(/) und von Euro in Zielwährung(*) !
		changeValue = new double[5];
		changeValue[0] = 1;
		changeValue[1] = 0.72735;
		changeValue[2] = 1.18506;
		changeValue[3] = 0.68688;
		changeValue[4] = 0.65180;
	}

	public double changeValue(String currentCurency, double currentMoney,
			String wishedCurrency) {

		double res = 0;
		double inEuro = 0;
		double inWhishedCurrency = 0;
		//
		for (int i = 0; i < currency.length; i++) {
			// Die Schleife läuft über das Array mit den Währungen und sucht
			// nach einem Treffer zschen eingegebener Währung und vorhandenen
			// Währungen
			if (currency[i].equalsIgnoreCase(currentCurency)) {
				// Wenn ein Treffer gefunden wurde...
				// Umrechnen des gegeben Betrages in Euro
				inEuro = (currentMoney / changeValue[i]);
				System.out.println("In Euro: " + inEuro);
				// Array nach Zielrechnung dursuchen...
				for (int j = 0; j < currency.length; j++) {
					// Wenn gefunden Euro in Zielwährung umrechnen...
					if (currency[j].equalsIgnoreCase(wishedCurrency)) {
						inWhishedCurrency = (inEuro * changeValue[j]);
						System.out.println("In Wished Currency: "
								+ inWhishedCurrency + " (" + wishedCurrency
								+ ")");
						res = inWhishedCurrency;
						return res;
					}
				}
			}
		}
		return res;
	}

	public CurrencyCalculator() {
		initValues();
	}
}
