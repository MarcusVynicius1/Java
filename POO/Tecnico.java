
public class Tecnico extends Assistente {

	protected float bonusSalarial;

	public Tecnico(String numeroMatricula, String nome, float salario, float bonusSalarial) {
		super(numeroMatricula, nome, salario);
		this.bonusSalarial = bonusSalarial;
	}

	public float getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(float bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	
	public void exibirDados() {
		this.salario = salario + bonusSalarial;
		super.exibirDados();
	}
}
