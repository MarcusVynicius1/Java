import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int i, contadorHomens = 0, contadorMulheres = 0;
		char sexo;
		String nome;
		Scanner salvar = new Scanner(System.in);

		for (i=0; i<20; i++) {
			System.out.println("Qual o seu nome? ");
			nome = salvar.next();
			
			System.out.println("Qual o seu sexo?(F ou M) ");
			sexo = salvar.next().charAt(0);
			
			if(sexo == 'F') {
				contadorMulheres++;
			} else {
				if(sexo == 'M') {
					contadorHomens++;				
				} else {
					System.out.println("Sexo inválido.")
				}
			}
		}
		System.out.println("Sao " + contadorMulheres + " mulheres e " + contadorHomens + " homens");

	}
}