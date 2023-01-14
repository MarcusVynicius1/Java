import java.util.Scanner;

public class programacao10 {

	public static void main(String[] args) {
	  
		     Scanner armazenar = new Scanner(System.in);
		     int numero;
		     System.out.println("\nDigite um ano com 4 dígitos: ");
		     numero = armazenar.nextInt();
		      if((numero % 4 == 0) || (numero % 4 == 0 && numero % 100 == 0 && numero % 400 == 0)) {
		      System.out.println(numero + " é ano bissexto.");
		      }else if( numero % 4 == 0 && numero % 100 == 0 ) {
		       System.out.println(numero + " não é ano bissexto.");
		      }else {
		    	  System.out.println(numero + " não é ano bissexto.");
		      }
		      

	}

}
