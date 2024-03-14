package calculation.view;

import java.awt.GridLayout;

import javax.swing.*;

import calculation.controller.CalculationController;

public class CalculationForm extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel lbValorPrincipal, lbTaxa, lbTipo, lbMeses, lbMontante, lbTotalJuros;
	private JTextField txtValorPrincipal, txtTaxa, txtMeses, txtMontante, txtTotJuros;
	private JRadioButton rdBtnSimples, rBtnComposto;
	private JButton btnCalcular;

	public CalculationForm() {
		setTitle("Calculadora de Juros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new GridLayout(4, 3, 3, 4)); // 4 linhas, 3 colunas, espaçamento horizontal e
																	// vertical entre os componentes

		lbValorPrincipal = new JLabel("Valor Principal:");
		lbTaxa = new JLabel("Taxa (%):");
		lbTipo = new JLabel("Tipo:");
		lbMeses = new JLabel("Meses:");
		lbMontante = new JLabel("Montante:");
		lbTotalJuros = new JLabel("Total de Juros:");

		txtValorPrincipal = new JTextField(10);
		txtTaxa = new JTextField(10);
		txtMeses = new JTextField(10);
		txtMontante = new JTextField(10);
		txtTotJuros = new JTextField(10);

		rdBtnSimples = new JRadioButton("Simples");
		rBtnComposto = new JRadioButton("Composto");
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdBtnSimples);
		btnGroup.add(rBtnComposto);

		btnCalcular = new JButton("Calcular");

		// Adiciona um ouvinte de ação ao botão "Calcular"
		btnCalcular.addActionListener(e -> {
			// Cria uma instância de CalculationController
			CalculationController controller = new CalculationController();
			// Chama o método executa() do controller, passando a instância atual de
			// CalculationForm como argumento
			controller.executa(CalculationForm.this);
		});

		panel.add(lbValorPrincipal);
		panel.add(txtValorPrincipal);
		panel.add(lbTaxa);
		panel.add(txtTaxa);
		panel.add(lbTipo);
		panel.add(rdBtnSimples);
		panel.add(new JLabel()); // Adiciona uma célula vazia para manter o layout consistente
		panel.add(rBtnComposto);
		panel.add(lbMeses);
		panel.add(txtMeses);
		panel.add(lbMontante);
		panel.add(txtMontante);
		panel.add(lbTotalJuros);
		panel.add(txtTotJuros);

		panel.add(new JLabel()); // Adiciona uma célula vazia para manter o layout consistente
		panel.add(btnCalcular);

		add(panel);
		pack(); // Redimensiona o JFrame para ajustar os componentes
		setLocationRelativeTo(null); // Centraliza o JFrame na tela
		setVisible(true);
	}

	public JTextField getTxtValorPrincipal() {
	    return this.txtValorPrincipal;
	}
	
	public JTextField getTxtMontante() {
	    return this.txtMontante;
	}
	
	public JTextField getTxtTotJuros() {
		return this.txtTotJuros;
	}
}

	

	
	
