import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {

		String vetorNome[] = new String[200];
		String vetorSexo[] = new String[200];
		int i;

		Scanner salvar = new Scanner(System.in);

		for (i = 0; i < vetorNome.length; i++) {
			System.out.println("Digite o seu nome: ");
			vetorNome[i] = salvar.nextLine();

			System.out.println("Digite o seu sexo: ");
			vetorSexo[i] = salvar.nextLine();

		}
		for (i = 0; i < vetorNome.length; i++) {
			if (vetorSexo[i].equals("feminino")) {
				System.out.println(vetorNome[i]);
			}
		}
		for (i = 0; i < vetorNome.length; i++) {
			if(vetorSexo[i].equals("masculino")) {
				System.out.println(vetorNome[i]);
			}
		}
	}
}