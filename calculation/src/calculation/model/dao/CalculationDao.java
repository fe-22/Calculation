package calculation.model.dao;

import calculation.model.Entity;
import calculation.model.TipoDeJuros;

public class CalculationDao {
	
	private void save(String insert, TipoDeJuros tipoDeJuros, Double valorPrincipal, Double taxa, int meses,
			Double montante, Double totalJuros) {
		
		
	}

    public void salvar(Entity c) {
    	String insert = "INSERT INTO CALCULOS (TIPO_De_Juros, VALOR_PRINCIPAL, TAXA, MESES, MONTANTE, TOTAL_DE_JUROS) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        save(insert, c.getTipoDeJuros(), c.getValorPrincipal(), c.getTaxa(), c.getMeses(), c.getMontante(),
             c.getTotalJuros());
    }


}
//* classe responsável pela interação com o banco de dados*//