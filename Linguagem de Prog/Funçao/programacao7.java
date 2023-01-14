import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		char letra;
		int resultado;

		Scanner salvar = new Scanner(System.in);

		System.out.println("Digite um caractere ");
		letra = salvar.next().charAt(0);

		resultado = verificarLetra(letra);
		if (resultado == 1) {
			System.out.println("é uma letra do alfabeto");
		} else {
			System.out.println("nao é uma letra do alfabeto");
		}
	}

	static int verificarLetra(char letra) {
		int i, contador = 0;
		char vetorLetra[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		for(i=0; i<vetorLetra.length; i++) {
			if(letra == vetorLetra[i]) {
				contador++;
			}			
		}
		if(contador == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}