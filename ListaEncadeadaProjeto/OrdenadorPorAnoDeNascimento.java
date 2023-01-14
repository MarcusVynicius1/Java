//implementar a interface Ordenador
public class OrdenadorPorAnoDeNascimento implements Ordenador {

	@Override
	public void ordenarPeloMetodoBolha(ColecaoDePessoas listaDePessoas) {
		int i, j;
		int totalDePessoas = listaDePessoas.obterTotalDePessoas();

		for (i = 0; i < totalDePessoas; i++) {
			for (j = 0; j < totalDePessoas - i - 1; j++) {
				if (listaDePessoas.obterPessoa(j).obterAnoDeNacimento() > listaDePessoas.obterPessoa(j + 1)
						.obterAnoDeNacimento()) {
					listaDePessoas.trocarPosicoesEntreDuasPessoas(j, j + 1);
				}
			}
		}
	}

	@Override
	public void ordenarPeloMetodoSelecao(ColecaoDePessoas listaDePessoas) {
		int tamanho = listaDePessoas.obterTotalDePessoas();
        for(int i = 0; i < tamanho; i++){
          int menorAno = i;
          for(int j = i + 1; j < tamanho; j++){
              if(listaDePessoas.obterPessoa(j).obterAnoDeNacimento() < listaDePessoas.obterPessoa(menorAno).obterAnoDeNacimento()){
                  menorAno = j;
              }

          }
          listaDePessoas.trocarPosicoesEntreDuasPessoas(menorAno, i);

     
      } 

	}

	@Override
	public void ordenarPeloMetodoInsercao(ColecaoDePessoas listaDePessoas) {
		int tamanho = listaDePessoas.obterTotalDePessoas();
        int j;
        Pessoa auxiliar;

        for(int i = 1; i < tamanho; i++ ){
            auxiliar = listaDePessoas.obterPessoa(i);
            j = i -1;
            while (j >= 0 && listaDePessoas.obterPessoa(j).obterAnoDeNacimento() > auxiliar.obterAnoDeNacimento()) {
                
                Pessoa p = listaDePessoas.obterPessoa(j);
                listaDePessoas.alterarPessoa(j+1, p);
                j--;
            }
            listaDePessoas.alterarPessoa(j+1, auxiliar);
        }  

	}

	@Override
	public void ordenarPeloMetodoQuickSort(ColecaoDePessoas listaDePessoas, int inicio, int fim) {
		int posicaoPivo;

		if (fim > inicio) {
			posicaoPivo = particionarVetor(listaDePessoas, inicio, fim);
			ordenarPeloMetodoQuickSort(listaDePessoas, inicio, posicaoPivo - 1);
			ordenarPeloMetodoQuickSort(listaDePessoas, posicaoPivo + 1, fim);
		}

	}

	private static int particionarVetor(ColecaoDePessoas listaDePessoas, int inicio, int fim) {
		int esquerda, direita, pivo;
		esquerda = inicio;
		direita = fim;
		pivo = listaDePessoas.obterPessoa(inicio).obterAnoDeNacimento();
		while (esquerda < direita) {
			while (listaDePessoas.obterPessoa(esquerda).obterAnoDeNacimento() <= pivo && esquerda < fim) {
				esquerda++;
			}
			while (listaDePessoas.obterPessoa(direita).obterAnoDeNacimento() > pivo && direita > inicio) {
				direita--;
			}
			if (esquerda < direita) {
				listaDePessoas.trocarPosicoesEntreDuasPessoas(direita, esquerda);
				esquerda++;
				direita--;
			}
		}
		listaDePessoas.trocarPosicoesEntreDuasPessoas(inicio, direita);
		return direita;
	}
	
	public Pessoa buscarAnoDeNascimento(ColecaoDePessoas listaDePessoas, int numeroBuscado, int fim) {
        int contador = 0;
        Pessoa receberN = null;
        for(contador = 0; contador < fim-1; contador++) {
            receberN = listaDePessoas.obterPessoa(contador);
            if(numeroBuscado == receberN.obterAnoDeNacimento()) {
                return receberN;
            }
        }
        return receberN = null;
    }

}
