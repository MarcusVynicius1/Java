
public class VIP extends Ingresso {

	protected double valorVIP;
	
	public VIP(double valor, double valorVIP) {
		super(valor);
		this.valorVIP = valorVIP;
	}

	public double getValorVIP() {
		return valorVIP;
	}

	public void setValorVIP(double valorVIP) {
		this.valorVIP = valorVIP;
	}
	
	public String imprimeValor() {
		this.valor = this.valor + this.valorVIP;
		return super.imprimeValor() + this.valor; 
	}
}
