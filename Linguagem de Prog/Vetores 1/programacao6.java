import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {

		String vetorNome[] = new String[30];
		int vetorIdade[] = new int[30];
		int i;
		double mediaIdade = 0;

		Scanner salvar = new Scanner(System.in);

		for (i = 0; i < vetorNome.length; i++) {
			System.out.println("Digite o seu nome: ");
			vetorNome[i] = salvar.next();

			System.out.println("Digite a sua idade: ");
			vetorIdade[i] = salvar.nextInt();

			mediaIdade += vetorIdade[i];
		}
		mediaIdade = mediaIdade / 30;
		for (i = 0; i < vetorNome.length; i++) {
			if (vetorIdade[i] > mediaIdade) {
				System.out.println(vetorNome[i]);
			}
		}
	}
}