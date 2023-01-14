import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int numero, numero2, numero3, soma;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();
		System.out.println("Digite um numero: ");
		numero2 = salvar.nextInt();
		System.out.println("Digite um numero: ");
		numero3 = salvar.nextInt();
		
		imprimirSoma(numero, numero2, numero3);

		
	}
	static void imprimirSoma(int numero, int numero2, int numero3) {
		int soma;
		
		soma = numero + numero2 + numero3;
		System.out.println(soma);
	}
}