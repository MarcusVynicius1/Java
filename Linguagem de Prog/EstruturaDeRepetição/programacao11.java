package programacao4;

import java.util.Scanner;

public class programacao11 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		int operacao, contDeposito = 0, contRetirada = 0, contSaque = 0, contExtrato = 0;
		do {

			System.out.println("Deposito digite 1 ");
			System.out.println("Retirada digite 2 ");
			System.out.println("Saque digite 3 ");
			System.out.println("Extrato digite 4 ");
			System.out.println("Sair do programa digite 5 ");
			System.out.println("\nEscolha uma opçao acima: ");
			operacao = salvar.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Voce escolheu depósito. ");
				contDeposito++;
				break;
			case 2:
				System.out.println("Voce escolheu retirada. ");
				contRetirada++;
				break;
			case 3:
				System.out.println("Voce escolheu saque. ");
				contSaque++;
				break;
			case 4:
				System.out.println("Voce escolheu extrato. ");
				contExtrato++;
				break;
			case 5:
				System.out.println("Voce escolheu sair do programa. ");
				break;
			}

		} while (operacao != 5);

		System.out.println("Depósito: " + contDeposito + "\nRetirada: " + contRetirada + "\nSaque: " + contSaque
				+ " \nExtrato: " + contExtrato);
	}
}
