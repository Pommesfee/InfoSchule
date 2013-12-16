package currency;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import currency.gui.CurrencyCalculatorGui;

public class CurrencyCalculatorMain {

	public static void main(String[] args) {

		 String currentCurrency = "Britisches Pfund";
		 double currentMoney = 10;
		 String wishedCurrency = "US Dollar";
		 double res = 0;
		
		 CurrencyCalculator curCalc = new CurrencyCalculator();
		 res = curCalc
		 .changeValue(currentCurrency, currentMoney, wishedCurrency);

		
		// Ignorier... nur für Anzeige der Gui
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		CurrencyCalculatorGui ccGui = new CurrencyCalculatorGui();
	}

}
