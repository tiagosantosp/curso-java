package controle;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO:");
		int num = teclado.nextInt();
		
		for (int tab = 0; tab < 11; tab++) {
			System.out.printf("\n%d x %d = %d", tab, num, tab * num);
		}
		
		teclado.close();
	}
}
