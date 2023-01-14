import java.util.Scanner;

public class programacao2 {
	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int  area;
		double N, quadrado=0, N2, retangulo=0, triangulo=0, circulo=0;
		do {

			System.out.println("\nPara calcular a area do quadrado digite 1");
			System.out.println("Para calcular a area do retangulo digite 2");
			System.out.println("Para calcular a area do triangulo digite 3");
			System.out.println("Para calcular a area do circulo digite 4");
			System.out.println("Para sair do programa digite 5");
			System.out.println("\nEscolha uma opçao acima: ");
			area = salvar.nextInt();

			switch (area) {
			case 1:
				System.out.println("Voce escolheu calcular a area do quadrado ");
				System.out.println("Qual o tamanho do lado do quadrado? ");
				N = salvar.nextDouble();
				quadrado = N*N;
				System.out.println("A área do quadrado é: " + quadrado);
				break;
			case 2:
				System.out.println("Voce escolheu calcular a area do retangulo ");
				System.out.println("Qual é a base do retangulo? ");
				N = salvar.nextDouble();
				System.out.println("Qual é a altura do retangulo? ");
				N2 = salvar.nextDouble();
				retangulo = N*N2;
				System.out.println("Essa é a área do retangulo: " + retangulo);
				break;
			case 3:
				System.out.println("Voce escolheu calcular a area do triangulo ");
				System.out.println("Qual é a altura do triangulo? ");
				N = salvar.nextDouble();
				System.out.println("Qual é a base do triangulo?");
				N2 = salvar.nextDouble();
				triangulo = (N*N2)/2;
				System.out.println("Essa é a área do triangulo: " + triangulo);
				break;
			case 4:
				System.out.println("Voce escolheu calcular a area do circulo ");
				System.out.println("Qual é o raio do circulo ");
				N = salvar.nextDouble();
				circulo = 3.14 * (N*N);
				System.out.println("Essa é a área do circulo: " + circulo);
				break;
			case 5:
				System.out.println("Voce escolheu sair do programa!");
			}

		} while (area != 5);

	}
}