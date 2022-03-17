package fundamentos;

public class DesafioLogico {
	public static void main(String[] args) {
		//2 trabalhos
		//se 2 trabalhos derem certo compra tv de 50"
		//se 1 trabalho der certo tv de 30" 
		//se 1 ou 2 trabalhos vamos tomar sorvete no shopping  
		//caso não tenha nenhum trabalho fica sem tv e sem sorvete.
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		if (trabalho1 && trabalho2) {
			System.out.println("TV DE 50''");
			System.out.println("Vamos tomar sorvete");
		} else if (trabalho1 || trabalho2) {
			System.out.println("TV DE 32''");
			System.out.println("Vamos tomar sorvete");
		} else {
			System.out.println("Ficar em casa sem TV!");
		}
		
	}

}
