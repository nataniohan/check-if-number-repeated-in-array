public class Main {

	public static void main(String[] args) {
		int otherNumber; 
		int all=0;
		int[] numero = { 12, 13, 8, 8, 5, 5, 4 };
		otherNumber = numero.length;
		for (int i = 0; i <numero.length; i++){
			for (int x = 0; x <numero.length; x++) {
				if (numero[i] == numero[x]) {
					all++;
				}
			}
		}
		
		int last = all-otherNumber;
		System.out.println(last);
	}
}
