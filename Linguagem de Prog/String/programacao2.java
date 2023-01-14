import java.util.Scanner;

public class programacao1 {

	public static void main(String[] args) {
		int i;
		double altura, mediaAltura = 0, somaAltura=0, menorAltura = 3, maiorAltura = 0;
		String nome, nomeMaisAlto="";
		Scanner salvar = new Scanner(System.in);

		for (i=0; i<20; i++) {
			System.out.println("Qual o seu nome? ");
			nome = salvar.next();
			
			System.out.println("Qual a sua altura? ");
			altura = salvar.nextDouble();
			
			if(menorAltura>altura) {
				menorAltura = altura;
			} else {
				if(maiorAltura<altura) {
					maiorAltura = altura;
					nomeMaisAlto = nome;
									
				}
			}
			somaAltura += altura;
		}
		mediaAltura = somaAltura/20;
		System.out.printf("A media das alturas foi: %.2f ", mediaAltura);
		System.out.println("\nA menor altura foi: " + menorAltura);
		System.out.println("A pessoa mais alta se chama: " + nomeMaisAlto);

	}
}