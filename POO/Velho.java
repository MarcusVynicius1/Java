
public class Velho extends Imovel {

	protected double desconto;
	
	public Velho(double preco, double desconto) {
		super(preco);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public String valorFinal() {
		this.preco = this.preco - this.desconto;
		return super.valorFinal() + this.preco;
	}
}
