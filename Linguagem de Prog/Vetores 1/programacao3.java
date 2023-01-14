import java.util.Scanner;

public class programacao2 {

	public static void main(String[] args) {
		Scanner salvar = new Scanner(System.in);
		double vetorNumeros[] = new double[20];
		double media = 0;
		int i, j=0;
		

		for (i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Digite um numero: ");
			vetorNumeros[i] = salvar.nextInt();
			media[j] += vetorNumeros[i];
		}
		media = media / 20;
		for(i = 0; i < vetorNumeros.length; i++) {
			if(vetorNumeros[i]>media[j]) {
				System.out.println("Número: " + vetorNumeros[i]);
				System.out.println("posição: " + i);
			}
		}
	}
}