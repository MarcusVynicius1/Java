import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {

		int vetorNumero[] = new int[5];
		int vetorNumero2[] = new int[5];
		int vetorSomaNumeros[] = new int[5];

		int i, contador=0;
		Scanner salvar = new Scanner(System.in);
	
		for (i = 0; i < vetorNumero.length; i++) {
			System.out.println("Digite um numero: ");
			vetorNumero[i] = salvar.nextInt();

			System.out.println("Digite um numero: ");
			vetorNumero2[i] = salvar.nextInt();
			if(vetorNumero[i] == vetorNumero2[i]) {
				contador++;
			}
		}
		for (i = 0; i < vetorSomaNumeros.length; i++) {
			vetorSomaNumeros[i] = vetorNumero[i] + vetorNumero2[i];
		}
		for (i = 0; i < vetorSomaNumeros.length; i++) {
			System.out.println(vetorSomaNumeros[i]);
		}
		System.out.println("Vetor 1 e Vetor 2 possuem o mesmo numero nas posições " + contador);
	}
}