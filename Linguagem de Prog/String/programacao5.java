import java.util.Scanner;

public class programacao4 {

	public static void main(String[] args) {
		String palavra1, palavra2;
		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite uma palavra ");
		palavra1 = salvar.next();
		System.out.println("Digite outra palavra ");
		palavra2 = salvar.next();

		System.out.println("A palavra 1 " + palavra1 + " possui o seguinte comprimento: " + palavra1.length());
		System.out.println("A palavra 2 " + palavra2 + " possui o seguinte comprimento: " + palavra2.length());

		if (palavra1.length() == palavra2.length()) {
			System.out.println("As palavras tem o mesmo comprimento. ");
		} else {
			System.out.println("As palavras nao tem o mesmo comprimento. ");
		}
		if(palavra1.equals(palavra2)) {
			System.out.println("As palavras possuem o mesmo conteudo.");
		} else {
			System.out.println("As palavras nao possuem o mesmo conteudo. ");
		}
	}
}
