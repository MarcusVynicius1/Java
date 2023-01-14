import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int numero, resultado;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um numero para fatorar: ");
		numero = salvar.nextInt();		

		resultado = fatorial(numero);
		if (resultado == -1) {
			System.out.println("um numero negativo foi passado.");			
		}
		System.out.println(resultado);
	}

	static int fatorial(int numero) {
		int i;
		
		if(numero < 0) {
			return -1;
		}
		
		for(i=numero; i > 1; i--) {
			numero = numero * (i-1);
		}
		return numero;
		
	}
}