import java.util.Scanner;

public class programacao1 {
	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		float contDeposito = 0, contRetirada = 0, contSaldo = 1000, contExtrato = 0;
		int  operacao;
		do {

			System.out.println("Para depositar, digite 1 ");
			System.out.println("Para fazer uma retirada, digite 2 ");
			System.out.println("Para ver o saldo, digite 3 ");
			System.out.println("Para sair do programa, digite 4 ");
			System.out.println("\nEscolha uma op�ao acima: ");
			operacao = salvar.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Quanto voc� quer depositar? ");
				contDeposito = salvar.nextFloat();
				contSaldo += contDeposito;
				break;
			case 2:
				System.out.println("Quanto voce quer retirar? ");
				contRetirada = salvar.nextFloat();
				if(contSaldo<0) {
					System.out.println("Nao � possivel fazer uma retirada!");
				} else {
				contSaldo = contSaldo - contRetirada;
				}
				break;
			case 3:
				System.out.println("Este � o seu saldo: " + contSaldo + "\n");
				break;
			case 4:
				System.out.println("Voce escolheu sair do programa. ");				
			}

		} while (operacao != 4);

	}
}
