import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		int N, i;

		System.out.println("Digite um numero para fazer o fatorial: ");
		N = salvar.nextInt();

		for (i = N; i > 1; i--) {
			N = N * (i - 1);
		}
		System.out.println(N);
	}
}