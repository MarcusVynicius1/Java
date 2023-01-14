import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int i, quantidadeDeLetras;	

		Scanner salvar = new Scanner(System.in);
		
		System.out.println("Quantos caracteres tem a palavra que voce quer digitar? ");
		quantidadeDeLetras = salvar.nextInt();
		
		char caracteres[] = new char[quantidadeDeLetras];
		
		for (i = 0; i < quantidadeDeLetras; i++) {
			System.out.println("Digite uma letra: ");
			caracteres[i] = salvar.next().charAt(0);
		}

		System.out.println("Palavra gerada: " + retornarPalavra(caracteres));
	}

	static String retornarPalavra(char caracteres[]) {
		int i;
		String palavra="";
		for (i = 0; i < caracteres.length; i++) {
			palavra += caracteres[i];
		}
		return palavra;
	}
}