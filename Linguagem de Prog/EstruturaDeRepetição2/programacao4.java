import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		int N, i, contPar = 0, contImpar = 0;

		for (i = 0; i < 20; i++) {
			System.out.println("Digite um n�mero: ");
			N = salvar.nextInt();
			if (N % 2 == 0) {
				contPar += N;
			} else {
				contImpar++;
			}
			
		}
		System.out.println("A soma dos n�meros pares foi: " + contPar);
		System.out.println("S�o " + contImpar + " N�meros impares. ");
	}
}