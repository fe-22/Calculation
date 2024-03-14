package calculation.model.service;

import calculation.model.Entity;
import calculation.model.dao.CalculationDao;

public class CalculationService {
         private CalculationDao dao;
         
         public CalculationService() {
        	 this.dao = new CalculationDao();
       }
         
         public Entity JurosSimples(Entity calculation) {
        	 double principal = calculation.getValorPrincipal();
        	 double taxa = calculation.getTaxa()/100;
        	 int meses = calculation.getMeses();
        	 double juros = principal * taxa * meses;
        	 double montante = principal * (1 + (taxa * meses));
        	 calculation.setTotalJuros(juros);
        	 calculation.setMontante(montante);
        	 salvar(calculation);
        	 return calculation;
        	 
         }
         
         public Entity jurosCompostos(Entity calculation) {
             double principal = calculation.getValorPrincipal();
             double taxa = calculation.getTaxa() / 100;
             int meses = calculation.getMeses();
             double montante = principal * Math.pow((1 + taxa), meses);
             double juros = montante - principal;
             calculation.setTotalJuros(juros);
             calculation.setMontante(montante);
             salvar(calculation);
             return calculation;
         }
         
         public void salvar(Entity calculation) {
        	 dao.salvar(calculation);
         }
         
         
	
	
	
}
