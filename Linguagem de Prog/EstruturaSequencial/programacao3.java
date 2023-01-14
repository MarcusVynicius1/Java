import java.util.Scanner;

public class programacao3 {

	public static void main(String[] args) {
		char sexo;

		Scanner salvar = new Scanner(System.in);
		System.out.println("Digite um numero ");
		sexo = salvar.next().charAt(0);
		if (sexo == 'F' || sexo == 'f') {
			System.out.println("Sexo feminino");
		} else {
			if (sexo == 'M' || sexo == 'm') {
				System.out.println("Sexo masculino");
			} else {
				System.out.println("Sexo invalido");
			}
		}

	}

}
