import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {
		double N1, N2;

		Scanner salvar = new Scanner(System.in);
		System.out.println("Digite um numero ");
		N1 = salvar.nextDouble();
		System.out.println("Digite um numero ");
		N2 = salvar.nextDouble();
		if (N1 > N2) {
			System.out.println("NUMERO 1 É MAIOR");
		} else {
			System.out.println("NUMERO 2 É MAIOR");
		}

	}

}
