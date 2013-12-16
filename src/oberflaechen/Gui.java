package oberflaechen;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Gui extends JFrame {

	private JMenuBar jMenuBar;
	private JMenu jMenu;
	private JMenuItem jMenuItem;

	private int height = 250;
	private int width = 250;
	private Dimension size = new Dimension(width, height);

	public Gui() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(size);
		setLocationRelativeTo(null);
		setResizable(true);
		setAlwaysOnTop(false);

		createWidgets();
		addWidgets();

		pack();
	}

	private void createWidgets() {

		jMenuItem = new JMenuItem();
		jMenuItem.setText("MenuItem");

		jMenu = new JMenu();
		jMenu.setText("Menu");
		jMenu.add(jMenuItem);

		jMenuBar = new JMenuBar();
		jMenuBar.add(jMenu);

	}

	private void addWidgets() {
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(jMenuBar, BorderLayout.PAGE_START);
	}

}
