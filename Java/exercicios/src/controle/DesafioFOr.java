package controle;

public class DesafioFOr {
	public static void main(String[] args) {
		
		String valor = "#"; 
		for (; !valor.equals("######") ;) {
			System.out.println(valor);
			valor += "#";
		}
	}
}
