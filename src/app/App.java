package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controller.Controle;

public class App {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		new Controle();

	}

}
