package fundamentos;

public class ConversãoTiposPrimitivos {
 public static void main(String[] args) {
	double a = 1.1231548789;
	System.out.println(a);
	
	// para dizar explicitamente qual o tipo coloque o tipo antes da atribuição
	// pode haver perda de informação nessas conversões
	float b = (float) 1.123456789;
	System.out.println(b);
	
	
}
}
