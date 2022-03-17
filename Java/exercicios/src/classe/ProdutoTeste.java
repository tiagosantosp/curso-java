package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Note");
		p1.preco = 4000.00;
		p1.nome = "Notebook";
		p1.desconto = 0.25;
		
		Produto p2 = new Produto("");
		p2.preco = 1.25;
		p2.nome = "lapis";
		p2.desconto = 0.10;
		
		System.out.println(p1.nome);
		System.out.println(p1.precoComDesconto());
	}
}
