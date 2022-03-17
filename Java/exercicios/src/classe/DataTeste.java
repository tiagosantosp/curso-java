package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(14,11,1994);
		System.out.printf("%d / %d / %d\n",d1.dia, d1.mes, d1.ano);
		System.out.printf("%d / %d / %d",d2.dia, d2.mes, d2.ano);
		
	}
}
