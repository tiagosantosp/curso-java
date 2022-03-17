package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("DIGITE SEU NOME: ");
		String nome = teclado.next();
		System.out.printf("\n\n Nome: %s" , nome);
		
		teclado.close();
	}
}
