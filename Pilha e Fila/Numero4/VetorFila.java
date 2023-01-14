package Numero4;

import Numero1.No;
import Numero3.TAD;

public class VetorFila implements TAD {

	int contador = 0;
	int contadorFila = 0;
	No topo = null;
	int vetorN[] = new int[20];

	@Override
	public void enqueue(int dado) {
		if (contador < 20) {
			vetorN[this.contador] = dado;
			this.contador++;
		}
	}

	@Override
	public boolean dequeue() {
		vetorN[contadorFila] = 0;
		this.contadorFila++;
		return true;
	}

	@Override
	public boolean vazio() {
		if (vetorN[this.contadorFila] != 0) {
			return false;
		}
		return true;

	}

	@Override
	public int front() {
		return vetorN[this.contadorFila];
	}

	@Override
	public String toString() {
		String elementos = new String();
		for (int i = this.contadorFila; i < this.contador; i++) {
			elementos = elementos + vetorN[i] + " ";
		}
		return "Pilha encadeada	[ " + elementos + "]";
	}

}
