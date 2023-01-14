import java.util.Scanner;
public class programacao9 {

	public static void main(String[] args) {
		int numero, contador = 0;
		
		Scanner salvar = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = salvar.nextInt();
		
		while(numero>0) {
			System.out.println("Digite um numero: ");
			numero = salvar.nextInt();
			contador ++;
		}
		System.out.println("Foram digitados " + contador + " números.");

	}

}
