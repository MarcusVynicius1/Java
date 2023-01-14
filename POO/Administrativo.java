
public class Administrativo extends Assistente {

	
	protected String turno;
	protected float adicionalNoturno;
	
	public Administrativo(String numeroMatricula, String nome, float salario, String turno, float adicionalNoturno) {
		super(numeroMatricula, nome, salario);
		this.adicionalNoturno = adicionalNoturno;
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public float getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(float adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	
	public void exibirDados() {
		this.salario = salario + adicionalNoturno;
		super.exibirDados();
	}
	
}
