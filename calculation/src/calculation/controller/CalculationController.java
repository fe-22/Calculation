package calculation.controller;

import java.text.NumberFormat;
import java.util.Locale;

import calculation.model.Entity;
import calculation.model.service.CalculationService;
import calculation.view.CalculationForm;

public class CalculationController implements IController {
	

public CalculationController() {

}
	private Entity calculation;
	private CalculationForm frame;
	
	

	
    public CalculationController(Entity calculation, CalculationForm frame) {
        this.calculation = calculation;
        
        this.frame = frame;
    }
	
    public void executa(Object view) {
        frame = (CalculationForm) view;
        calculation = new Entity();
        calculation.setValorPrincipal(Double.parseDouble(frame.getTxtValorPrincipal().getText()));

        calculation = calculate(calculation);

        String montante = doubleFormat(calculation.getMontante());
        String juros = doubleFormat(calculation.getTotalJuros());

        frame.getTxtMontante().setText(montante);
        frame.getTxtTotJuros().setText(juros);
    }
	
	private Entity calculate(Entity calculation) {
		CalculationService service	= new CalculationService();
		
		Entity result;
		if(calculation.getTipoDeJuros().getValor()==1) {
			result = service.JurosSimples(calculation);
			
		}else {
			result = service.jurosCompostos(calculation);
		}
		return result;
		
	}
	
	private String doubleFormat(Double aDouble) {
		NumberFormat nf =
				NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		
		nf.setMaximumFractionDigits(2);
		return nf.format(aDouble);
	}
	
	

	
}//* classe que define os metodos para realizar os calculos*//
//*variavel controller e usada para chamar o metodo executa, que realiza o calculo*//
