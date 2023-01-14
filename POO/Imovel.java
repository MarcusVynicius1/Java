
public class Imovel {
	
	protected double preco;

	public Imovel(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}		
	
	public String valorFinal() {
		return "Valor do imovel: ";
	}
}
