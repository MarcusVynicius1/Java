import java.util.Scanner;

public class programacao2 {
	public static void main(String[] args) {
		int numero, divisor;
		boolean primo = true;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		numero = salvar.nextInt();
		divisor = 2;

		while (divisor < numero) {
			if (numero % divisor == 0) {
				primo = false;
			}
			divisor++;
		}
		if (primo == true) {
			System.out.println("O n�mero � primo. ");
		} else {
			System.out.println("O n�mero n�o � primo. ");
		}
	}
}