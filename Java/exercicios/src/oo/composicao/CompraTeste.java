package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		
		c1.cliente = "Tiago";
		
		c1.itens.add(new Item("sabonete", 1, 1.99));
		c1.itens.add(new Item("pasta de dente", 1, 2.50));
		c1.itens.add(new Item("shampoo", 1, 12));
		
		
	
		System.out.printf("O valor total é R$ %.2f" , c1.getValorTotal());
		
	}
}
