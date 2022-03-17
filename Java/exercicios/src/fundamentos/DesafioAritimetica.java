package fundamentos;

public class DesafioAritimetica {
	public static void main(String[] args) {
		double a = 6 * (3 + 2);
		a = Math.pow(a, 2);
		int d1 = 3 * 2;
		double part1 = a / d1;
		
		double b = (1 - 5) * (2 - 7);
		b = b / 2;
		double part2 = Math.pow(b, 2);
		
		double cima = part1 - part2;
		cima = Math.pow(cima, 3);
		
		double baixo = Math.pow(10, 3);
		
		double resultado = cima / baixo;
		
		System.out.printf("O resultado é %.2f", resultado);
		
	}
}
