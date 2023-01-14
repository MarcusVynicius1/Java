import java.util.Scanner;

public class programacao10 {

	public static void main(String[] args) {
		int numeroMultiplicado, numeroMultiplicador, i, soma=0;
		
		Scanner salvar = new Scanner(System.in);
		
		System.out.println("Digite um numero para ser multiplicado: ");
		numeroMultiplicado = salvar.nextInt();
		System.out.println("Digite um numero para ser multiplicado: ");
		numeroMultiplicador = salvar.nextInt();
		
		for(i=0; i<numeroMultiplicador; i++ ) {
			soma += numeroMultiplicado;
		}
		System.out.println(soma);

	}

}
