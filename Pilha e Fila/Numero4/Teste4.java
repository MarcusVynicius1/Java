package Numero4;

public class Teste4 {

	public static void main(String[] args) {

		VetorFila vetor = new VetorFila();
		
		for (int i = 0; i < 20; i++) {
			vetor.enqueue(i+1);
		}

		System.out.println(vetor);

		vetor.dequeue();

		System.out.println(vetor.front());

		System.out.println(vetor.vazio());

		System.out.println(vetor);

	}

}
