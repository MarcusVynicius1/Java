import java.util.Scanner;

public class Testar {

	public static void main(String[] args) {

		Scanner salvar = new Scanner(System.in);
		int n;

		Tecnico assistenteTec = new Tecnico("202220212020", "Marcus", 2000, 400);
		assistenteTec.exibirDados();
		Administrativo assistenteAdm = new Administrativo("201920202021", "Carlos", 2300, "noite", 400);
		assistenteAdm.exibirDados();

		System.out.println();

		Cachorro animal1 = new Cachorro("Bob", "labrador");
		System.out.println(animal1.Late());
		Gato animal2 = new Gato("Tico", "siames");
		System.out.println(animal2.Mia());
		System.out.println(animal1.caminha());
		System.out.println(animal2.caminha());

		System.out.println();

		Rica rica = new Rica("Carol", 30, 300000.000);
		System.out.println(rica.verificarPessoa());
		Pobre pobre = new Pobre("Joana", 35);
		System.out.println(pobre.verificarPessoa());
		Miseravel miseravel = new Miseravel("Maria", 40);
		System.out.println(miseravel.verificarPessoa());

		System.out.println();

		CamaroteInferior camInf = new CamaroteInferior(100, 50, "Setor B");
		CamaroteSuperior camSup = new CamaroteSuperior(100, 50, 80);
		System.out.println("Digite 1 para o ingresso normal, digite 2 para o ingresso VIP.");
		n = salvar.nextInt();
		if (n == 1) {
			System.out.println("Ingresso do tipo normal.");
		} else {
			System.out.println("Digite 1 para camarote superior ou 2 para camarote inferior.");
			n = salvar.nextInt();
			if (n == 1) {
				System.out.println("Camarote superior");
				System.out.printf("%s", camSup.imprimeValor());
			} else {
				System.out.println("Camarote inferior");
				System.out.printf("%s", camInf.imprimeValor());
			}
		}
		
		System.out.println();
		System.out.println();
		
		Novo imovel1 = new Novo(500.570, 100.000);
		Velho imovel2 = new Velho(70.570, 15.000);
		
		System.out.println("Digite 1 para um imóvel novo, digite 2 para um imóvel velho.");
		n = salvar.nextInt();
		
		if(n == 1) {
			System.out.printf("%.24s", imovel1.valorFinal());
		} else {
			System.out.printf("%.23s", imovel2.valorFinal());
		}
	}

}
