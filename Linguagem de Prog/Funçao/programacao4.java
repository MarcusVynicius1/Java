import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		double numero, numero2,soma;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();


		imprimirSoma(numero);
		
	}
	static void imprimirSoma(double numero) {
		double soma=0, divisor = 0;
		
		for(divisor=0; divisor < numero; divisor++) {
			if(numero % divisor == 0) {
				soma += divisor;
			}
		}
		if(soma == numero) {
			System.out.println("A soma dos numeros sao perfeitos.");
		}
		else {
			System.out.println("A soma dos numeros nao sao perfeitos.");
		}
		
	}
}