package classe;

//import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "tiago Santos";
		u1.email = "tiago_s.p@hotmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "tiago Santos";
		u2.email = "tiago_s.p@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		//System.out.println(u1.equals(new Date()));
	}
}
