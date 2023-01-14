package Numero1;

public class Teste {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		for(int i = 0; i < 10; i++) {		
			pilha.push(i);
		}
		
		System.out.println(pilha);
		

		pilha.pop();

		
		for(int i = 0; i < 1; i++) {
			System.out.println(pilha.getTop());
		}
		
		System.out.println(pilha.vazio());
	
		
		System.out.println(pilha);
		
	}

}
