
public class Novo extends Imovel{

	protected double adicional;
	
	public Novo(double preco, double adicional) {
		super(preco);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public String valorFinal() {
		this.preco = this.preco + this.adicional;
		return super.valorFinal() + this.preco;
	}
}
