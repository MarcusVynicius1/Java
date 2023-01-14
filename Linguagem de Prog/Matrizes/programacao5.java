import java.util.Random;

public class programacao1 {

	public static void main(String[] args) {

		int vetorMatrizA[][][] = new int[5][4][2];

		int linha, coluna, profundidade;

		Random gerador = new Random();

		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				for(profundidade = 0; profundidade < 2; profundidade++) {
					vetorMatrizA[linha][coluna][profundidade] = gerador.nextInt(1000);
				}				
			}
		}

		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				for(profundidade = 0; profundidade < 1; profundidade++) {
					System.out.printf("%3d   ", vetorMatrizA[linha][coluna][profundidade]);
				}				
			}
			System.out.println("");
		}
		System.out.println("---------------------");
		for (linha = 0; linha < 5; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				for(profundidade = 1; profundidade < 2; profundidade++) {
					System.out.printf("%3d   ", vetorMatrizA[linha][coluna][profundidade]);
				}				
			}
			System.out.println("");
		}
	}
}