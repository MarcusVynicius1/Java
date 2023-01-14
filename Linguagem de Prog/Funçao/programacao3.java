import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int numero, numero2,soma;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();
		System.out.println("Digite por quanto quer ser multiplicado ");
		numero2 = salvar.nextInt();

		soma = imprimirSoma(numero, numero2);
		
		System.out.println(soma);
	}
	static int imprimirSoma(int numero, int numero2) {
		int soma=0, i;
		
		for(i=0; i < numero2; i++) {
			soma += numero;
		}
		return soma;
	}
}