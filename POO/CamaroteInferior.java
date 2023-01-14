
public class CamaroteInferior extends VIP{

	protected String localizacao;

	public CamaroteInferior(double valor, double valorVIP, String localizacao) {
		super(valor, valorVIP);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}	

	public String local() {
		return this.localizacao;
	}
	
}
