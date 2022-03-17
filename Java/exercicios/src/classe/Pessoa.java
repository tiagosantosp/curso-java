package classe;

public class Pessoa {
	double peso;
	String nome;
	
	Pessoa (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public void comer(Comida c) {
		System.out.println("Comeu " + c.nome);
		peso += c.peso;
	}
}
