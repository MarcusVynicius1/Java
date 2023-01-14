import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int A, B, C;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Coloque um numero: ");
		A = salvar.nextInt();
		System.out.println("Coloque um numero: ");
		B = salvar.nextInt();
		System.out.println("Coloque um numero: ");
		C = salvar.nextInt();

		if (A > B && A > C && B > C || A > C && A == B || A > B && B == C || A < B && B == C) {
			System.out.println("A ordem é: " + C + ", " + B + "e " + A);
		} else {
			if (A > B && A > C && B < C || A > B && A == C || A > B && B == C) {
				System.out.println("A ordem é: " + B + ", " + C + "e " + A);
			} else {
				if (A < B && B > C && A > C || A < B && A == C) {
					System.out.println("A ordem é: " + C + ", " + A + "e " + B);
				} else {
					if (A < B && B > C && A < C) {
						System.out.println("A ordem é: " + A + ", " + C + "e " + B);
					} else {
						if (A < C && C > B && A < B || A == B && A == C) {
							System.out.println("A ordem é: " + A + ", " + B + "e " + C);
						} else {
							System.out.println("A ordem é: " + B + ", " + A + "e " + C);
						}
					}
				}
			}
		}
	}
}