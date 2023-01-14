
public class Miseravel extends Pessoa {

	public Miseravel(String nome, int idade) {
		super(nome, idade);

	}

	public void mendiga() {
		
	}
	
	public String verificarPessoa() {
		return super.verificarPessoa() + "nao tem dinheiro.";
	}
}
