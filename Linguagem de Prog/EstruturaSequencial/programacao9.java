import java.util.Scanner;

public class programacao9 {

	public static void main(String[] args) {
	  
		     Scanner armazenar = new Scanner(System.in);
		     double salario, vendas;
		     
		     System.out.println("\nDigite o salário do vendedor: ");
		     salario = armazenar.nextDouble();
		     
		     System.out.println("\nDigite o total de vendas: ");
		      vendas = armazenar.nextDouble();
		      
		      if(vendas > 0 && vendas < 1500) {
		            salario = 0.03 * 1500;
		        }else if( vendas > 1500) {
		            salario = 0.03 * 1500 + (0.05 *(vendas - 1500));
		        }

		        System.out.println("Salário: " + salario);
		      
	}

}
