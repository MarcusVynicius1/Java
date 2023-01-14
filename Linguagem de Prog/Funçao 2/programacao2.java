import java.util.Random;

public class programacao1 {

	public static void main(String[] args) {
		int vetorNumero[] = new int[5];
		int i;

		Random gerador = new Random();

		for (i = 0; i < vetorNumero.length; i++) {
			vetorNumero[i] = gerador.nextInt(100);
			System.out.println(vetorNumero[i]);
		}
		System.out.println("--------------------------------------------");

		inverterNumero(vetorNumero);
		
	}

	static void inverterNumero(int vetorNumero[]) {
		int i, j=0;
		int vetorInverso[] = new int[5];
		for (i = 4; i >= 0; i--) {
			vetorInverso[j] = vetorNumero[i];
			j++;
			
		}
		for (i = 0; i < vetorNumero.length; i++) {
			System.out.println(vetorInverso[i]);
		}

	}
}