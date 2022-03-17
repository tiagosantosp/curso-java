package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		//Adicionar um elemento ao conjunto
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add("e");
		
		//VER A QUANTIDADE DE ELEMENTOS
		System.out.println(conjunto.size());
		//REMOVER ELEMENTOS
		conjunto.remove("e");
		System.out.println(conjunto.size());

		//BUSCAR UM ELEMENTO
		System.out.println(conjunto.contains("teste"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//ADICIONAIS todos os elementos na outra collection
		//conjunto.addAll(nums);
		
		//Comparar os elementos iguais de 2 collections
		conjunto.retainAll(nums);
		
		//Limpar uma collection
		//conjunto.clear();
		System.out.println(conjunto);
		
	}
}
