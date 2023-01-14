import java.util.Scanner;
public class programacao2 {

	public static void main(String[] args) {
		int i, contador=0, N;
		
		Scanner salvar = new Scanner(System.in);
		System.out.println("Coloque um numero para limitar: ");
		N = salvar.nextInt();
		
		for(i=0; i<N; i++) {
			contador += i;
		}
		System.out.println("A soma dos números foram: " + contador);

	}

}
