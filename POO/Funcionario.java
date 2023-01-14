
public class Funcionario {
	
	protected String nome;
	protected String numeroMatricula;
	protected float salario;
	
	Funcionario(String numeroMatricula, String nome, float salario){
		this.numeroMatricula = numeroMatricula;
		this.nome = nome;
		this.salario = salario;
	}
			
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + this.nome + "\nNumero de matricula: " + this.numeroMatricula);
	}

}
