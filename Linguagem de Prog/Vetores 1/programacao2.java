import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		int vetorA[] = new int[20];
		int vetorB[] = new int[20];
		int i, j=0;

		for (i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um numero: ");
			vetorA[i] = salvar.nextInt();
		}
		for (i = 19; i >= 0; i--) {
			vetorB[j] = vetorA[i];
			System.out.println(vetorB[j]);
		}
		
	}
}