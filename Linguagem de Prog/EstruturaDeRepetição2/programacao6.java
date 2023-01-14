import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		double N = 0, contPar = 0, contImpar = 0, mediaPar = 0, mediaImpar = 0, somaPar = 0, somaImpar = 0,
				maiorPar = 0, menorImpar = 1000;
		Scanner salvar = new Scanner(System.in);

		while (N > -1) {
			System.out.println("Digite um número: ");
			N = salvar.nextDouble();
			if (N % 2 == 0 && N > 0) {
				if (maiorPar < N) {
					maiorPar = N;
				}
				somaPar += N;
				contPar++;

			} else {
				if (N > 0) {
					if (menorImpar > N) {
						menorImpar = N;
					}
					somaImpar += N;
					contImpar++;

				}
			}

		}
		mediaPar = somaPar / contPar;
		mediaImpar = somaImpar / contImpar;
		System.out.printf("A media dos pares foi: %.2f \nA media dos ímpares foi: %.2f ", mediaPar, mediaImpar);
		System.out.println("\nO maior número par foi: " + maiorPar);
		System.out.println("O menor número impar foi: " + menorImpar);
	}
}