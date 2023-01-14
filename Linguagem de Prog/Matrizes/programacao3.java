import java.util.Random;
import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {

		char vetorX[][] = new char[4][4];
		char vetorUsuario[][] = new char[4][4];
		int linha, coluna, numeroLinha, numeroColuna, numeroLinha2, numeroColuna2, usuarioLinha, usuarioColuna,
				acertos = 0, tentativas = 0;

		Random gerador = new Random();
		Scanner salvar = new Scanner(System.in);

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				vetorX[linha][coluna] = 'x';
			}
		}
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				vetorUsuario[linha][coluna] = vetorX[linha][coluna];
			}
		}

		System.out.println("Vamos jogar um jogo!");
		System.out.println("Regras do jogo: Achar aonde estão escondidos os 'y', voce terá 15 tentativas para ganhar.");
		System.out.println("Boa Sorte!");

		numeroLinha = gerador.nextInt(4);
		numeroColuna = gerador.nextInt(4);
		vetorX[numeroLinha][numeroColuna] = 'y';
		numeroLinha2 = gerador.nextInt(4);
		numeroColuna2 = gerador.nextInt(4);
		vetorX[numeroLinha2][numeroColuna2] = 'y';

		while (numeroLinha == numeroLinha2 && numeroColuna == numeroColuna2) {
			numeroLinha2 = gerador.nextInt(4);
			numeroColuna2 = gerador.nextInt(4);
			vetorX[numeroLinha2][numeroColuna2] = 'y';
		}
		do {
			for (linha = 0; linha < 4; linha++) {
				for (coluna = 0; coluna < 4; coluna++) {
					System.out.printf("%s  ", vetorUsuario[linha][coluna]);
				}
				System.out.println("");
			}

			System.out.println("Digite a linha para achar o 'Y' ");
			usuarioLinha = salvar.nextInt();
			System.out.println("Digite a coluna para achar o 'Y' ");
			usuarioColuna = salvar.nextInt();

			if (vetorUsuario[usuarioLinha - 1][usuarioColuna - 1] == 'y') {
				System.out.println("Voce ja escolheu essa posição. \nTente Novamente.");
			} else {
				if (vetorUsuario[usuarioLinha - 1][usuarioColuna - 1] == 'o') {
					System.out.println("Voce ja escolheu essa posição. \nTente Novamente.");
				} else {
					if (vetorX[usuarioLinha - 1][usuarioColuna - 1] == 'y') {
						System.out.println("Voce achou o 'Y' ");
						vetorUsuario[usuarioLinha - 1][usuarioColuna - 1] = 'y';
						acertos++;
						tentativas++;
					} else {
						System.out.println("Errrrooou");
						vetorUsuario[usuarioLinha - 1][usuarioColuna - 1] = 'o';
						tentativas++;
					}
				}
			}

		} while (acertos != 2 || tentativas == 15 );
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				System.out.printf("%s  ", vetorX[linha][coluna]);
			}
			System.out.println("");
		}

		if (acertos == 2) {
			System.out.println("Parabéns, voce ganhou!");
			System.out.println("Precisou de " + tentativas + " tentativas para vencer.");
		} else {
			System.out.println("Voce perdeu após errar 15 vezes!");
		}
	}
}