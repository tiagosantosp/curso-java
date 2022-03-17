package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Tiago"));
		usuarios.add(new Usuario("Dani"));
		usuarios.add(new Usuario("Maria"));
		
		boolean result = usuarios.contains(new Usuario("Dani"));
		
		System.out.println(result);
	}
}
