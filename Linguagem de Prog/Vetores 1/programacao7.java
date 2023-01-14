import java.util.Random;

public class programacao2 {

	public static void main(String[] args) {


		int vetorProduto[] = new int[500];
		int vetorValor[] = new int[500];
		int vetorValorProduto [] = new int[500];
		int valorTotal=0;

		int i;
		Random gerador = new Random();
	
		for (i = 0; i < vetorProduto.length; i++) {
			vetorProduto[i] = gerador.nextInt(100);			
			vetorValor[i] = gerador.nextInt(100);
			
			vetorValorProduto[i] = vetorValor[i] * vetorProduto[i];
			valorTotal += vetorValorProduto[i];
						
		}
		for (i = 0; i < vetorProduto.length; i++) {
			System.out.println("Valor arrecadado com o produto " + i + " é " + vetorValorProduto[i] + " reais");
		}
		System.out.println("Valor total arrecadado: " + valorTotal + " reais");
	}
}