public class programacaoooo {
	
	public static void main(String[] args) {
		int i=0, contador=0;
				
		while(i<1000) {
			if(i%3==0 || i%5==0) {
				contador += i;
			}
			i++;
		}
		System.out.println(contador);

	}

}
