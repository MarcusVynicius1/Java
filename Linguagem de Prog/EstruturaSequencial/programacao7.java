import java.util.Scanner;

public class programacao7 {

	public static void main(String[] args) {
		double i, cont=0, N=0, N1=0;
		Scanner salvar = new Scanner(System.in);
			
			System.out.println("digite um numero: ");
			N1 = salvar.nextDouble();

			if(N1>0 && N1<100) {
				System.out.println("Esta compreendido entre 0 e 100! ");
			} else {
				System.out.println("Nao esta compreendido entre 0 e 100! ");
			}
			
		
	}
}
