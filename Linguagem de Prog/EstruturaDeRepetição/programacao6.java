import java.util.Scanner;
public class programacaooo {

	public static void main(String[] args) {
		int N1, N2, i, contador=0;
		
		Scanner salvar = new Scanner(System.in);
		
		System.out.println("coloque um limite inferior");
		N1 = salvar.nextInt();
		System.out.println("coloque um limite inferior");
		N2 = salvar.nextInt();
		
		for(i=N1; i<N2; i++) {
			if(i%2==0) {
				System.out.println(i);
				contador += i;
			}
		}
		System.out.println("\nA soma total dos numeros pares foi: " + contador);
		
	}

}
