import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int numero, numero2, resultado;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();

		resultado = imprimirPrimo(numero);
		if (resultado == 1) {
			System.out.println("O numero é primo");
		} else {
			System.out.println("O numero nao é primo");
		}
	}

	static int imprimirPrimo(int numero) {
		int divisor, contador = 0;
		
		for(divisor=2; divisor < numero; divisor++) {
			if(numero % divisor == 0) {
				contador++;
			}
		}
		if (contador == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}