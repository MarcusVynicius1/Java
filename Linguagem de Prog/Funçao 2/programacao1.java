import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int vetorNumero[] = new int[5];
		int resultado, i;

		Scanner salvar = new Scanner(System.in);

		for (i = 0; i < vetorNumero.length; i++) {
			System.out.println("Digite um numero: ");
			vetorNumero[i] = salvar.nextInt();
		}

		resultado = numeroNegativo(vetorNumero);
		System.out.println("Quantidade de numeros negativos: " + resultado);
	}

	static int numeroNegativo(int vetorNumero[]) {
		int i, contador = 0;
		for (i = 0; i < vetorNumero.length; i++) {
			if (vetorNumero[i] < 0) {
				contador++;
			}
		}

		return contador;

	}
}