package calculation.model;

import java.util.Objects;

public class Entity {
	
	
	
	private Long id;
	private TipoDeJuros tipoDeJuros;
	private Double valorPrincipal;
	private Double taxa;
	private int meses;
	private Double montante;
	private Double totalJuros;
	
	public Entity() {
		this.tipoDeJuros = new TipoDeJuros();
		this.taxa = 0.0;
		this.totalJuros = 0.0;
	}
	
	
	

	public TipoDeJuros getDeJuros() {
		return this.getDeJuros();
	}
	
	
	


	public Entity(Long id, float tipoDeJuros, Double valorPrincipal, Double taxa, int meses, Double montante,
			Double totalJuros) {
		super();
		this.id = id;
	
		this.valorPrincipal = valorPrincipal;
		this.taxa = taxa;
		this.meses = meses;
		this.montante = montante;
		this.totalJuros = totalJuros;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDeJuros getTipoDeJuros() {
		return tipoDeJuros;
	}

	public void setTipoDeJuros(TipoDeJuros tipoDeJuros) {
		this.tipoDeJuros = tipoDeJuros;
	}

	public Double getValorPrincipal() {
		return valorPrincipal;
	}

	public void setValorPrincipal(Double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}

	public Double getTaxa() {
		return this.taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public Double getMontante() {
		return montante;
	}

	public void setMontante(Double montante) {
		this.montante = montante;
	}

	public Double getTotalJuros() {
		return totalJuros;
	}

	public void setTotalJuros(Double totalJuros) {
		this.totalJuros = totalJuros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		return Objects.equals(id, other.id);
	}


	    // Trate o caso em que getTipoDeJuros() retorna nulo
	    // Por exemplo, lance uma exceção ou defina um valor padrão
	}


	
	


