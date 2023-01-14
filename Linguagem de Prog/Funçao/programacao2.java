import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {

		int numero;
		char verificacao;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();

		verificacao = verificarNumero(numero);
		System.out.println(verificacao);
	}

	static char verificarNumero(int numero) {
		if (numero > 0) {
			return 'P';
		} else {
			return 'N';
		}
	}
}