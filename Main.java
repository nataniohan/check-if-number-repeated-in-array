public class Main {

	public static void main(String[] args) {
		int otherNumber = 0; 
		int quantidadeDeValores = 7;
		int[] numero = { 12, 13, 8, 8, 5, 5, 4 };
		for (int i = 0; i <= 6; i++) {
			for (int x = 0; x <= 6; x++) {
				if (numero[i] == numero[x]) {
					otherNumber++;
				}
			}
		}
		
		int last = otherNumber-quantidadeDeValores;
		System.out.println(last);
	}
}
