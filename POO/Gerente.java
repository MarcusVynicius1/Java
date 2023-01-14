
public class Gerente extends Funcionario {
	
	protected float bonifica;

	public Gerente(String numeroMatricula, String nome, float salario, float bonifica) {
		super(numeroMatricula, nome, salario);		
		this.bonifica = bonifica;
	
	}

	public float getBonifica() {
		return bonifica;
	}

	public void setBonifica(float bonifica) {
		this.bonifica = bonifica;
	}
	
	public void exibirDados() {
		this.salario = salario + bonifica;
		super.exibirDados();
	}
	
}
