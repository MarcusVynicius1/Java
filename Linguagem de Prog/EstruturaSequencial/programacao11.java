import java.util.Scanner;

public class programacao11 {

	public static void main(String[] args) {
	  
		     Scanner armazenar = new Scanner(System.in);
		     int idade;
		     
		     System.out.println("\nDigite uma idade: ");
		     idade = armazenar.nextInt();
		     
		     if( idade >= 5 && idade <= 7 ) {
		    	 System.out.println("\nIdade para infantil A ");
		    	 
		     }else if(idade >= 8 && idade <= 10) {
		    	 System.out.println("\nIdade para infantil B ");
		    	 
		     }else if( idade >= 11 && idade <= 13 ) {
		    	 System.out.println("\nIdade para juvenil A ");
		    	 
		     }else if( idade >= 14 && idade <= 17 )	{
		    	 System.out.println("\nIdade para juvenil B ");
		    	 
		     }else if(idade >= 18 )	      {
		    	 System.out.println("\nIdade para adulto");
		     }

	}

}
