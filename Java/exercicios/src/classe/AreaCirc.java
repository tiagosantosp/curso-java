package classe;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.14;
	
	AreaCirc (double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}
	
}
