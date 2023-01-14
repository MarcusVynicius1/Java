import java.util.Scanner;
public class programacao5 {

	public static void main(String[] args) {
		int idade;
		
		Scanner salvar = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = salvar.nextInt();

		switch (idade) {
		case 5:	System.out.println("Infantil A: ");
				break;
		case 6: System.out.println("Infantil A: ");
				break;
		case 7:	System.out.println("Infantil A: ");
				break;
		case 8:	System.out.println("Infantil B: ");
				break;
		case 9:	System.out.println("Infantil B: ");
				break;
		case 10:System.out.println("Infantil B: ");
				break;
		case 11:System.out.println("Juvenil A");
				break;
		case 12:System.out.println("Juvenil A");
				break;
		case 13:System.out.println("Juvenil A");
				break;
		case 14:System.out.println("Juvenil B");
				break;
		case 15:System.out.println("Juvenil B");
				break;
		case 16:System.out.println("Juvenil B");
				break;
		case 17:System.out.println("Juvenil B");
				break;
		case 18:System.out.println("Adulto");
				break;						
		}
		if(idade>18) {
			System.out.println("Adulto");
		}
	}

}
