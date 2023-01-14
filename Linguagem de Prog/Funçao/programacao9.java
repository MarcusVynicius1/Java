import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int numero;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();

		imprimirMensagem(numero);

	}

	static void imprimirMensagem(int numero) {
		int i, j;
		for (i = 0; i < numero; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("%d  ", i);
			}
			System.out.println("");
		}
	}
}