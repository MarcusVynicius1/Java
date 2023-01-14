import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {
		double altura, peso, pesoidealM, pesoidealF, resultado = 0;
		char sexo;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Qual é a sua altura? ");
		altura = salvar.nextDouble();
		System.out.println("Qual é o seu peso? ");
		peso = salvar.nextDouble();
		System.out.println("Qual é o seu sexo? (M para Masculino ou F para Feminino) ");
		sexo = salvar.next().charAt(0);

		pesoidealM = (72.7 * altura) - 58;
		pesoidealF = (62.1 * altura) - 44.7;

		if (sexo == 'M' || sexo == 'm') {
			resultado = pesoidealM - peso;
		} else {
			resultado = pesoidealF - peso;
		}
		if (resultado > 1) {
			System.out.println("O usuario esta acima do peso! ");
		} else {
			if (resultado < 1 && resultado > 0 || resultado == 0) {
				System.out.println("O usuario esta no peso normal!  ");
			} else {
				System.out.println("O usuario esta abaixo do peso! ");
			}
		}
	}
}