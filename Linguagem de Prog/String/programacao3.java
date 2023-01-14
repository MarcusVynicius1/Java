import java.util.Scanner;

public class programacao3 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		int N, i, contPar = 0, contImpar = 0;

		for (i = 0; i < 20; i++) {
			System.out.println("Digite um número: ");
			N = salvar.nextInt();
			if (N % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			
		}
		System.out.println("São " + contPar + " Números pares. ");
		System.out.println("São " + contImpar + " Números impares. ");
	}
}