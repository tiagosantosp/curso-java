package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.add("Tiago");
		fila.add("Pedro");
		fila.add("Maria");
		fila.offer("Bia");// offer adiciona apenas se tiver vagas na fila
		
		System.out.println(fila.peek());//pega o primeiro elemento da fila sem remover
		System.out.println(fila.element());//caso a fila esteja vazia retorna erro
		
		System.out.println(fila.poll());//retorna o primeiro elemento da fila removendo
	}
}
