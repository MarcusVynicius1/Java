
public class Ingresso {
	
	protected double valor;
	
	Ingresso(double valor){
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String imprimeValor() {
		return "valor do ingresso: ";
	}
}
