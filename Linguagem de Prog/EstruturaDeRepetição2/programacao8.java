import java.util.Scanner;

public class programacao1 {
	public static void main(String[] args) {
		int i, contSim = 0, contNao = 0, contFemininoSim = 0, contMasculinoNao = 0, porcentagemFeminino = 0, contadorFeminino = 0, contadorMasculino = 0,
				porcentagemMasculino = 0;
		char resposta, sexo;
		Scanner salvar = new Scanner(System.in);

		for (i = 0; i < 2000; i++) {
			System.out.println("Gostou do produto? ");
			resposta = salvar.next().charAt(0);
			System.out.println("Qual o seu sexo?(M ou F) ");
			sexo = salvar.next().charAt(0);

			if (resposta == 'S' || resposta == 's') {
				contSim++;
			} else {
				contNao++;
			}
			if (sexo == 'F' || sexo == 'f') {
				if (resposta == 'S' || resposta == 's') {
					contFemininoSim++;
				}
				contadorFeminino++;
			} else {
				if (sexo == 'M' || sexo == 'm') {
					if (resposta == 'N' || resposta == 'n') {
						contMasculinoNao++;
					}
					contadorMasculino++;
				}
			}
		}
		if (contSim == contNao) {
			System.out.println("O produto é indiferente!");
		} else {
			if (contSim > contNao) {
				System.out.println("O produto foi aprovado!");
			} else {
				System.out.println("O produto foi reprovado!");
			}
		}
		porcentagemMasculino = (100 * contMasculinoNao) / (contadorMasculino + contMasculinoNao);
		porcentagemFeminino = (100 * contFemininoSim) / (contadorFeminino + contFemininoSim);
		System.out.println(contSim + " pessoas responderam sim!" + "\n" + contNao + " pessoas responderam nao!");
		System.out.println(porcentagemFeminino + "% mulheres responderam sim");
		System.out.println(porcentagemMasculino + "% dos homens responderam nao");

	}
}