import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		String palavra;
		int i;
		char caracteres[];

		Scanner salvar = new Scanner(System.in);
		

		System.out.println("Digite uma palavra: ");
		palavra = salvar.nextLine();

		caracteres = retornarLetras(palavra);
		for(i=0; i < palavra.length(); i++) {
			System.out.println(caracteres[i]);
		}		
	}

	static char[] retornarLetras(String palavra) {
		int i;
		char letras[] = new char[palavra.length()];
		for(i=0; i < palavra.length(); i++) {
			letras[i] = palavra.charAt(i);
		}
		return letras;
		
	}
}