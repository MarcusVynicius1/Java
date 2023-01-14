import java.util.Random;

public class programacao1 {

	public static void main(String[] args) {

		float vetorMatrizAltura[][] = new float[5][10];
		float maiorAltura = 0;
		int linha, coluna;

		Random gerador = new Random();

		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 10; coluna++) {
				vetorMatrizAltura[linha][coluna] = gerador.nextFloat() + 1;
			}
		}

		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 10; coluna++) {
				if (maiorAltura < vetorMatrizAltura[linha][coluna]) {
					maiorAltura = vetorMatrizAltura[linha][coluna];
				}
				System.out.printf("%.2f   ", vetorMatrizAltura[linha][coluna]);
			}
			System.out.printf("A maior altura da delegação %d foi: %.2f metros.", (linha + 1), maiorAltura);
			maiorAltura = 0;
			System.out.println("");
		}
	}
}