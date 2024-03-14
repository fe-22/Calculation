package calculation.controller;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public interface IController {
	
	public void executa(Object view);
	
	default void start(JLabel statusJLabel) {
		SwingUtilities.invokeLater(() ->{
			statusJLabel.setText("Iniciando o controle da aplicação...");
		});
	}

}
