package application;

import javax.swing.JFrame;

import calculation.view.CalculationForm;

public class Main {
	
	public static void main(String[] args) {
		CalculationForm form = new CalculationForm();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);//*exibição do form*//
	}

}
