import java.util.ArrayList;

public class ArrayListDePessoas implements ColecaoDePessoas {
	private ArrayList<Pessoa> listaDePessoas = null;
	private int totalDePessoas;

	public ArrayListDePessoas() {
		listaDePessoas = new ArrayList<Pessoa>();
		new ArrayList<Pessoa>();
		this.totalDePessoas = 0;
	}

	@Override
	public void adicionarPessoa(Pessoa pessoa) {
		this.listaDePessoas.add(pessoa);
		this.totalDePessoas++;
	}

	@Override
	public boolean excluirPessoa() {
		if (this.totalDePessoas > 0) {
			this.listaDePessoas.remove(totalDePessoas);
			this.totalDePessoas--;
			return true;
		}
		return false;
	}

	@Override
	public Pessoa obterPessoa(int indiceDaPessoa) {
		return this.listaDePessoas.get(indiceDaPessoa);
	}

	@Override
	public int obterTotalDePessoas() {
		return this.totalDePessoas;
	}

	@Override
	public void ordenarLista(Ordenador ordenador) {
		ordenador.ordenarPeloMetodoQuickSort(this, 0, this.totalDePessoas - 1);
	}

	@Override
	public void trocarPosicoesEntreDuasPessoas(int i, int j) {
		Pessoa auxiliar;
		auxiliar = this.listaDePessoas.get(i);
		this.listaDePessoas.set(i, this.listaDePessoas.get(j));
		this.listaDePessoas.set(j, auxiliar);

	}

	@Override
	public void alterarPessoa(int posicaoDaPessoa, Pessoa novaPessoa) {
		this.listaDePessoas.set(posicaoDaPessoa, novaPessoa);

	}

	@Override
	public String buscaSequencial(String nomeBuscado) {
		int contador = 0;
		String mostrarNome;
		for (contador = 0; contador < this.totalDePessoas; contador++) {
			if (nomeBuscado.equals(this.listaDePessoas.get(contador).obterNome())) {
				return mostrarNome = this.listaDePessoas.get(contador).retornarPessoa();
			}
		}
		return mostrarNome = "Nome nao encontrado!";
	}	

}
