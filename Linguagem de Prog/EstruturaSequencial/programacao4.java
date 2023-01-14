package programacao4;

import java.util.Scanner;

public class programacao4 {

	public static void main(String[] args) {
		char letra;

		Scanner salvar = new Scanner(System.in);
		System.out.println("Digite uma letra maiscula: ");
		letra = salvar.next().charAt(0);
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("É uma vogal! ");
		} else {
			System.out.println("É uma consoante! ");
		}

	}

}
