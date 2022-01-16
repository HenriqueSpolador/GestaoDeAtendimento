package gestao;

public class Rodovias {
	
	public String rodoviaDigitada;
	public double kmDigitado;
	public String sentido;
	public String acostamento;
	

	public Rodovias() {
		super();
		
	}

	public Rodovias(String rodovia, double km, String sentido, String acostamento) {
		super();
		this.rodoviaDigitada = rodovia;
		this.kmDigitado = km;
		this.sentido = sentido;
		this.acostamento = acostamento;
	}

	public String getRodovia() {
		return rodoviaDigitada;
	}

	public void setRodovia(String rodovia) {
		this.rodoviaDigitada = rodovia;
	}

	public double getKm() {
		return kmDigitado;
	}

	public void setKm(double km) {
		this.kmDigitado = km;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	public String isAcostamento() {
		return acostamento;
	}

	public void setAcostamento(String acostamento) {
		this.acostamento = acostamento;
	}
	
	
	
}


