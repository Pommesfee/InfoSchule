package currency.gui;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import currency.CurrencyCalculator;

public class CurrencyCalculatorGui extends JFrame{
	
	private JLabel lblCurCur;
	private JLabel lblWishedCur;
	private JTextField betragCurCur;
	private JTextField betragWishedCur;
	private JComboBox curCurChoose;
	private JComboBox wishedCurChoose;
	private JButton btnChangeCur;
	
	private CurrencyCalculator cc = new CurrencyCalculator();
	
	public CurrencyCalculatorGui() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Währungs-Umrechner");
		
		createWidgets();
		addWidgets();
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void addWidgets() {
		getContentPane().setLayout(new GridLayout(3, 3, 5, 5));
		
		getContentPane().add(lblCurCur);
		getContentPane().add(Box.createHorizontalGlue());
		getContentPane().add(lblWishedCur);
		getContentPane().add(curCurChoose);
		getContentPane().add(btnChangeCur);
		getContentPane().add(wishedCurChoose);
		getContentPane().add(betragCurCur);
		getContentPane().add(Box.createHorizontalGlue());
		getContentPane().add(betragWishedCur);
	}
	
	private void createWidgets() {

		lblCurCur = new JLabel();
		lblCurCur.setText("Währung in meinem Besitz:");
		
		curCurChoose = new JComboBox(new Object[] { "Euro", "US Dollar", "Britisches Pfund", "Kanadische Dollar", "Australische Dollar" });
	
		betragCurCur = new JTextField();
		betragCurCur.addCaretListener(new TextFieldListener());
		
		btnChangeCur = new JButton();
		btnChangeCur.setText("Change \n Currency");
		btnChangeCur.addActionListener(new ButtonListener());
		
		lblWishedCur = new JLabel();
		lblWishedCur.setText("Geünschte Währung:");
		
		wishedCurChoose = new JComboBox(new Object[] { "Euro", "US Dollar", "Britisches Pfund", "Kanadische Dollar", "Australische Dollar"});
		
		betragWishedCur = new JTextField();
		betragWishedCur.addCaretListener(new TextFieldListener());
		
	}
	
	private class TextFieldListener implements CaretListener {

		@Override
		public void caretUpdate(CaretEvent e) {
			if(e.getSource() == betragCurCur) {
				double res =0;
				String currentCurency = curCurChoose.getSelectedItem().toString();
				String wishedCurrency = wishedCurChoose.getSelectedItem().toString();
				
				// Muss verbessert werden...
				double currentMoney = Integer.parseInt(betragCurCur.getText());
				
				res = cc.changeValue(currentCurency, currentMoney, wishedCurrency);
				System.out.println("res: " + res);
				betragWishedCur.setText(Double.toString(res));
			}
			if(e.getSource() == betragWishedCur) {
				double res =0;
				String currentCurency = curCurChoose.getSelectedItem().toString();
				String wishedCurrency = wishedCurChoose.getSelectedItem().toString();
				
				// Muss verbessert werden...
				double currentMoney = Integer.parseInt(betragWishedCur.getText());
				
				res = cc.changeValue(currentCurency, currentMoney, wishedCurrency);
				System.out.println("res: " + res);
				betragCurCur.setText(Double.toString(res));
			}
		}

	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnChangeCur) {
				int selIndCur = 0;
				int selIndWish = 0;
				selIndCur = curCurChoose.getSelectedIndex();
				selIndWish = wishedCurChoose.getSelectedIndex();
				curCurChoose.setSelectedIndex(selIndWish);
				wishedCurChoose.setSelectedIndex(selIndCur);
				String strTextCur = "";
				String strTextWish = "";
				strTextCur = betragCurCur.getText();
				strTextWish = betragWishedCur.getText();
				betragCurCur.setText(strTextWish);
				betragWishedCur.setText(strTextCur);
			}
		}
		
	}
	
}
