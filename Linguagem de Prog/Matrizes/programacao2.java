import java.util.Random;

public class programacao1 {

	public static void main(String[] args) {

		int vetorMatrizA[][] = new int[7][2];
		int vetorMatrizB[][] = new int[7][2];
		int vetorMatrizC[][] = new int[7][2];

		int linha, coluna;

		Random gerador = new Random();

		for (linha = 0; linha < 7; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				vetorMatrizA[linha][coluna] = gerador.nextInt(1000);
			}
		}
		for (linha = 0; linha < 7; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				vetorMatrizB[linha][coluna] = gerador.nextInt(1000);
			}
		}
		for (linha = 0; linha < 7; linha++) {
			for (coluna = 0; coluna < 1; coluna++) {
				vetorMatrizC[linha][coluna] = vetorMatrizC[linha][coluna] + vetorMatrizA[linha][coluna];
			}
		}
		for (linha = 0; linha < 7; linha++) {
			for (coluna = 1; coluna < 2; coluna++) {
				vetorMatrizC[linha][coluna] = vetorMatrizC[linha][coluna] + vetorMatrizB[linha][coluna];
			}
		}

		for (linha = 0; linha < 7; linha++) {
			for (coluna = 0; coluna < 2; coluna++) {
				System.out.printf("%3d   ", vetorMatrizC[linha][coluna]);
			}
			System.out.println("");
		}
	}
}