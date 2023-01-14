
public class ListaEncadeadaSimples implements ColecaoDePessoas {

	No inicio = null;
	int numeroDePessoas = 0;

	@Override
	public void adicionarPessoa(Pessoa pessoa) {
		No novoNo = new No(pessoa);
		No noAtual = this.inicio;
		if (this.inicio != null) {
			while (noAtual.proximo != null) {
				noAtual = noAtual.proximo;
			}
			noAtual.proximo = novoNo;
		} else {
			this.inicio = novoNo;
		}
		numeroDePessoas++;

	}

	@Override
	public boolean excluirPessoa() {
		No noAtual = this.inicio;
		No noAnterior = null;

		if (this.inicio != null) {
			while (noAtual.proximo != null) {
				noAnterior = noAtual;
				noAtual = noAtual.proximo;
			}
			if (noAnterior != null) {
				noAnterior.proximo = null;
			} else {
				this.inicio = null;
			}
			numeroDePessoas--;
			return true;
		}
		return false;
	}

	@Override
	public Pessoa obterPessoa(int posicaoDaPessoa) {
		No noAtual = this.inicio;
		No noAnterior = null;
		int posicaoAtual = 0;
		
		if (this.inicio != null) {
			while ((noAtual != null) && (posicaoDaPessoa != posicaoAtual)) {
				noAnterior = noAtual;
				noAtual = noAtual.proximo;
				posicaoAtual++;
			}
			
			return noAtual.dado;
	
		}
		return null;
	}

	@Override
	public int obterTotalDePessoas() {
		return numeroDePessoas;
	}

	@Override
	public void ordenarLista(Ordenador ordenador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trocarPosicoesEntreDuasPessoas(int i, int j) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterarPessoa(int posicaoDaPessoa, Pessoa novaPessoa) {
		// TODO Auto-generated method stub

	}

	@Override
	public String buscaSequencial(String buscarNome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		String elementos = new String();
		No noAtual = this.inicio;
		while (noAtual != null) {
			elementos = elementos + noAtual.dado + " ";
			noAtual = noAtual.proximo;
		}
		return "ListaEncadeada [ " + elementos + "]";
	}
}
