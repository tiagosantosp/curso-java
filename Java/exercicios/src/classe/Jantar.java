package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Tiago", 79.5);
		
		System.out.println(p.nome);
		System.out.println(p.peso);
		System.out.println();
		
		Comida c1 = new Comida("Macarrão", 0.5);
		Comida c2 = new Comida("Feijoada", 1.5);
		
		p.comer(c2);
		
		System.out.println(p.nome);
		System.out.println(p.peso);
		System.out.println();
		
		p.comer(c1);
		
		System.out.println(p.nome);
		System.out.println(p.peso);
		System.out.println();
		
	}
}
