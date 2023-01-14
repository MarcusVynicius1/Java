import java.util.Scanner;

class programacao {
	public static void main(String[] args) {
		double N = 0;

		Scanner salvar = new Scanner(System.in);
		System.out.println("Digite um numero ");
		N = salvar.nextDouble();
		if (N > 0) {
			System.out.println("positivo");
		} else {
			if (N == 0) {
				System.out.println("nulo");
			} else {
				System.out.println("negativo");
			}
		}
	}

}
