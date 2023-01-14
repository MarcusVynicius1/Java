import java.util.Scanner;

public class programacao4 {

	public static void main(String[] args) {
		double pesoTerra, pesoGeral, pesoPlanetas = 0;
		int numeroPlaneta;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite o seu peso: ");
		peso = salvar.nextDouble();

		System.out.println("Digite um numero correspondente ao planeta: ");
		numeroPlaneta = salvar.nextInt();

		switch (numeroPlaneta) {
		case 1:
			pesoPlanetas = pesoGeral * 0.37;
			System.out.printf("O peso em mercurio é: %.3f e o peso na terra é: %.3f", pesoPlanetas, peso);
			break;
		case 2:
			pesoPlanetas = pesoGeral * 0.88;
			System.out.printf("O peso em venus é: %.3f e o peso na terra é: %.3f", pesoPlanetas, peso;
			break;
		case 3:
			pesoPlanetas = pesoGeral * 0.38;
			System.out.printf("O peso em marte é: %.3f e o peso na terra é: %.3f", pesoPlanetas, peso;
			break;
		case 4:
			pesoPlanetas = pesoGeral * 2.64;
			System.out.printf("O peso em jupiter é: %.3f e o peso na terra é: %.3f", pesoPlanetas, peso);
			break;
		case 5:
			pesoPlanetas = pesoGeral * 1.15;
			System.out.printf("O peso em saturno é: %.3f e o peso na terra é: %.3f", pesoPlanetas, peso);
			break;
		case 6:
			pesoPlanetas = pesoGeral * 1.17;
			System.out.printf("O peso em urano é: %.3f e o peso na terra é: %.3f", pesoPlanetas, peso);
			break;
		default:
			System.out.println("O numero digitado nao corresponde a nenhum planeta!");
		}
	}

}
