import java.util.Scanner;
public class programacao2 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		int i=0, contador=0, numeroDigitado;
		
		while(i<100) {
			System.out.println("Digite um número: ");
			numeroDigitado = salvar.nextInt();
			contador += numeroDigitado;
			i++;
		}
		System.out.println("A soma dos numeros foram: " + contador);
					
	}

}
