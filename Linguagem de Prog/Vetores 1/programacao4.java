import java.util.Random;

public class programacao2 {

	public static void main(String[] args) {
		Random gerador = new Random();
		double vetorNumeros[] = new double[50];
		double maiorNumero[] = new double[50];
		int i, j = 0, k = 0;

		for (i = 0; i < vetorNumeros.length; i++) {
			vetorNumeros[i] = gerador.nextInt(100);
			if (maiorNumero[j] < vetorNumeros[i]) {
				maiorNumero[j] = vetorNumeros[i];
				k = i;
			} else {
				if (maiorNumero[j] == vetorNumeros[i]) {
					System.out.println("Numeros iguais na posição: " + i);
				}
			}
		}
		System.out.println("Maior numero na posiçao: " + k);
		System.out.println("Maior numero foi: " + maiorNumero[j]);
	}
}