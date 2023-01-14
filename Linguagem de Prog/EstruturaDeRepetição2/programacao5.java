public class programacao1 {
	public static void main(String[] args) {
		double anos=0, cidadeA=7000000, cidadeB=5000000;

		while(cidadeB<cidadeA) {
			cidadeA += cidadeA * 0.02;
			cidadeB += cidadeB * 0.03;
			anos++;
		}
		System.out.println("Foi preciso " + anos + " anos para a cidade B ultrapassar a cidade A.");
	}
}