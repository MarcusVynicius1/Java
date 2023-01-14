import java.util.Random;

public class programacao2 {

	public static void main(String[] args) {
		int vetorNumero[] = new int[5];
		int i;

		Random gerador = new Random();

		for (i = 0; i < vetorNumero.length; i++) {
			vetorNumero[i] = gerador.nextInt(100);
			System.out.println(vetorNumero[i]);
		}
		System.out.println("--------------------------------------------");

		ordemDecrescente(vetorNumero);
	}

	static void ordemDecrescente(int vetorNumero[]) {
		int i, j;
		int auxiliar;
		for (i = 0; i < 4; i++) {
			for (j = i + 1; j < 5; j++) {
				if (vetorNumero[i] < vetorNumero[j]) {
					auxiliar = vetorNumero[i];
					vetorNumero[i] = vetorNumero[j];
					vetorNumero[j] = auxiliar;
				}
			}
		}
		for (i = 0; i < 5; i++) {
			System.out.println(vetorNumero[i]);
		}
	}
}