import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		String nome[] = new String[50];
		int i;

		for (i = 0; i < nome.length; i++) {
			System.out.println("Digite um nome: ");
			nome[i] = salvar.nextLine();
		}
		for (i = 49; i >= 0; i--) {
			System.out.println(nome[i]);
		}
	}
}