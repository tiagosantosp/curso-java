package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("tiago");
		lista.add(u1);
		lista.add(new Usuario("Dani"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Julia"));
		lista.add(new Usuario("Tania"));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		System.out.println();
		
		System.out.println(lista.get(2).nome);// Acessar pelo indice
		System.out.println(lista.get(0)); //  utilizando o ToString
	}
}
