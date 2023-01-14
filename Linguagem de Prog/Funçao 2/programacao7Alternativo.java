import java.util.Scanner;
import java.util.Random;

public class programacao1 {

	public static void main(String[] args) {
		String palavra;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		palavra = salvar.next();

		System.out.println(pegarLetras(palavra));

	}

	static String pegarLetras(String palavra) {
		int i, auxiliar = 0, auxiliar2 = 0;
		char letraSeparada;
		String palavraEmbaralhada = "";
		char letras[] = new char[palavra.length()];
		Random gerador = new Random();

		for (i = 0; i < palavra.length(); i++) {
			letras[i] = palavra.charAt(i);
		}

		for (i = 0; i < palavra.length(); i++) {
			auxiliar = gerador.nextInt(palavra.length());
			auxiliar2 = gerador.nextInt(palavra.length());

			while (auxiliar == auxiliar2) {
				auxiliar2 = gerador.nextInt(palavra.length());

			}
			letraSeparada = letras[auxiliar];
			letras[auxiliar] = letras[auxiliar2];
			letras[auxiliar2] = letraSeparada;

		}
		for(i=0; i < palavra.length(); i++) {
			palavraEmbaralhada += letras[i];
		}
		return palavraEmbaralhada;
	}

}