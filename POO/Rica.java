
public class Rica extends Pessoa {

	private double dinheiro;
		
	public Rica(String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}

	public void fazCompras() {
		System.out.println("Tem muito dinheiro.");
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public String verificarPessoa() {
		return super.verificarPessoa() + "tem muito dinheiro.";
	}
}
