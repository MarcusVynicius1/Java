
public class CamaroteSuperior extends VIP{
	
	protected double valorCamaroteSup;

	public CamaroteSuperior(double valor, double valorVIP, double valorCamaroteSup) {
		super(valor, valorVIP);
		this.valorCamaroteSup = valorCamaroteSup;
	}

	public double getValorCamaroteSup() {
		return valorCamaroteSup;
	}

	public void setValorCamaroteSup(double valorCamaroteSup) {
		this.valorCamaroteSup = valorCamaroteSup;
	}	
	
	public String imprimeValor() {
		this.valor = this.valor + this.valorCamaroteSup;
		return super.imprimeValor(); 
	}
}
