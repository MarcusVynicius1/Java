import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {
		String vetorNome[] = new String[5];
		int resultado, i;
		String nome;

		Scanner salvar = new Scanner(System.in);

		for (i = 0; i < vetorNome.length; i++) {
			System.out.println("Digite um nome: ");
			vetorNome[i] = salvar.nextLine();
		}
		System.out.println("Digite um nome para ser procurado ");
		nome = salvar.nextLine();

		resultado = buscarNome(vetorNome, nome);
		if (resultado >= 0) {
			System.out.println("Nome encontrado na posiçao " + resultado);
		} else {
			System.out.println("Nome nao encontrado.");
		}
	}

	static int buscarNome(String vetorNome[], String nome) {
		int i, contador = -1;

		for (i = 0; i < vetorNome.length; i++) {
			if (nome.equals(vetorNome[i])) {
				contador = i;
			}
		}
		if (contador >= 0) {
			return contador;
		} else {
			return -1;
		}
	}
}