package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a m�dia");
		double media = teclado.nextDouble();
		
		if (media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		teclado.close();
		
	}
}
