package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Tiago");//put adiciona ou altera
		usuarios.put(1, "Dani");
		usuarios.put(2, "Maria");
		usuarios.put(3, "Julia");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());// verifica se está vazio
		System.out.println(usuarios.keySet()); //mostra as chaves
		
		System.out.println(usuarios.values());//mostra os valores
		System.out.println(usuarios.entrySet());//mostra chave e valor
		
		System.out.println(usuarios.containsKey(2)); //verifica se contem a chave
		System.out.println(usuarios.containsValue("Dani")); //verifica se contem o valor
		
		System.out.println(usuarios.get(3));
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
		
	}
}
