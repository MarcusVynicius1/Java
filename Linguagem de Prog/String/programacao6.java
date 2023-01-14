import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int i;
		char letra;
		String nome;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Qual é o seu nome? ");
		nome = salvar.next();

		for (i = 0; i < nome.length(); i++) {
			letra = nome.charAt(i);
			System.out.println(letra);
		}

	}
}