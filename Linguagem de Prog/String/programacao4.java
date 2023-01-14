import java.util.Scanner;

public class programacao4 {

	public static void main(String[] args) {
		String palavra1, palavra2;
		Scanner salvar = new Scanner(System.in);	

			System.out.println("Digite uma palavra ");
			palavra1 = salvar.next();
			System.out.println("Digite outra palavra ");
			palavra2 = salvar.next();
			
			if(palavra1.length()<palavra2.length()) {
				System.out.println("A palavra " + palavra1 + " foi a menor.");
			} else {
				if(palavra1.length()>palavra2.length()) {
					System.out.println("A palavra " + palavra2 + " foi a menor.");
				} else {
					System.out.println("As palavras sao iguais.");
				}
			}
	}
}
