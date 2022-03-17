package colecoes;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjutoComportado {
	public static void main(String[] args) {
		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		
		lista.add("Tiago");
		lista.add("Dani");
		lista.add("Maria");
		lista.add("Julia");
		
		for(String nome: lista) {
			System.out.println(nome );
		}
		
		
		
		
	}
}
