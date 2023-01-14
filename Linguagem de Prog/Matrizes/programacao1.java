import java.util.Random;

public class programacao1 {

	public static void main(String[] args) {

		int vetorMatrizA[][] = new int[5][3];
		int vetorMatrizB[][] = new int[5][3];
		int vetorMatrizC[][] = new int[5][3];

		int linha, coluna;

		Random gerador = new Random();

		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				vetorMatrizA[linha][coluna] = gerador.nextInt(1000);
			}
		}
		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				vetorMatrizB[linha][coluna] = gerador.nextInt(1000);
			}
		}
		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				vetorMatrizC[linha][coluna] = vetorMatrizA[linha][coluna] + vetorMatrizB[linha][coluna];
			}
		}

		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.printf("%4d   ", vetorMatrizC[linha][coluna]);
			}
			System.out.println("");
		}
	}
}