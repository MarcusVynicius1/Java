import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		double numero, numero2, resultado;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();
		System.out.println("Digite um numero: ");
		numero2 = salvar.nextInt();

		resultado = imprimirSoma(numero, numero2);
		if (resultado == 1) {
			System.out.println("Os numeros sao divisiveis");
		} else {
			System.out.println("Os numeros nao sao divisiveis");
		}
	}

	static int imprimirSoma(double numero, double numero2) {

		if (numero % numero2 == 0) {
			return 1;
		} else {
			return 0;
		}

	}
}