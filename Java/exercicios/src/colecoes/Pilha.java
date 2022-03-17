package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Harry Potter");
		livros.add("O pequeno Principe");
		livros.push("Sherlock Holmes");
		
		System.out.println(livros.peek());
		System.out.println(livros.poll());
		System.out.println(livros.peek());
		
	}
}
