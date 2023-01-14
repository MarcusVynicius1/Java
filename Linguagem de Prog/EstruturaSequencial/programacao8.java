import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
	  
		     Scanner armazenar = new Scanner(System.in);
		     double salario, prestacao;
		     
		     System.out.println("\nDigite o seu salário bruto: ");
		     salario = armazenar.nextDouble();
		     
		     System.out.println("\nDigite o valor da prestação: ");
		      prestacao = armazenar.nextDouble();
		      
		      if(prestacao <= 0.3 * salario) {
		    	  System.out.println("empréstimo concedido.");
		      }else {
		    	  System.out.println("empréstimo não concedido");
		      }

	}

}
