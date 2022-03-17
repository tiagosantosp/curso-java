package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO:");
		int num = teclado.nextInt();
		
		int tab = 0;
		while (tab < 11) {
			System.out.printf("\n%d x %d = %d", tab, num, tab * num);
			tab++;
		}
		
		teclado.close();
	}
}
