import java.util.Scanner;

public class programacao1 {
	public static void main(String[] args) {
		double i, mediaTurma = 0, mediaFeminino = 0, maiorAltura = 0, menorAltura = 1000, altura, contFeminino = 0, contAlturaFeminino = 0, alturaTurma = 0;
		char sexo;

		Scanner salvar = new Scanner(System.in);

		for (i = 0; i < 50; i++) {
			System.out.println("Qual é a sua altura? ");
			altura = salvar.nextDouble();
			System.out.println("Qual o seu sexo?(M ou F) ");
			sexo = salvar.next().charAt(0);
			if (maiorAltura < altura) {
				maiorAltura = altura;
			} else {
				if (menorAltura > altura) {
					menorAltura = altura;
				}
			}
			if (sexo == 'F' || sexo == 'f') {
				contAlturaFeminino += altura;
				contFeminino++;
			}
			alturaTurma += altura;
		}

		mediaTurma = alturaTurma / 50;
		mediaFeminino = contAlturaFeminino / contFeminino;
		System.out.printf("A media da altura das mulheres foi %.2f e a media da altura da turma foi %.2f", mediaFeminino,
				mediaTurma);
		System.out.println(
				"\nA maior altura da turma foi: " + maiorAltura + "\nE a menor altura da turma foi: " + menorAltura);
	}
}