package controle;

public class Switch {	
	public static void main(String[] args) {
		int nota = 9;
		
		switch(nota) {
		case 10,9:
			System.out.println("NOTA A");
			break;
		case 8,7:
			System.out.println("NOTA B");
			break;
		case 6,5:
			System.out.println("NOTA C");
			break;
		case 4,3:
			System.out.println("NOTA D");
			break;
		case 2,1,0:
			System.out.println("NOTA E");
			break;
		default: 
			System.out.println("Nota Inválida!");
		}
	}
}
