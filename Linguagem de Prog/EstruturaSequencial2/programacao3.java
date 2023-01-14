import java.util.Scanner;
public class programacao3 {

	public static void main(String[] args) {
		int numero;
		
		Scanner salvar = new Scanner(System.in);		
		
		System.out.println("Escolha um mês de acordo com o numero[1-12]: ");
		numero = salvar.nextInt();
		switch(numero) {
		case 1:  System.out.println("Janeiro");
			break;
		case 2:  System.out.println("fevereiro");
			break;
		case 3:  System.out.println("março");
			break;
		case 4:  System.out.println("abril");
			break;
		case 5:  System.out.println("maio");
			break;
		case 6:  System.out.println("junho");
			break;
		case 7:  System.out.println("julho");
			break;
		case 8:  System.out.println("agosto");
			break;
		case 9:	 System.out.println("setembro");
			break;
		case 10: System.out.println("outubro");
			break;
		case 11: System.out.println("novembro");
			break;
		case 12: System.out.println("dezembro");
			break;
		default: System.out.println("Este numero de mês não é válido!");
		}

	}

}
