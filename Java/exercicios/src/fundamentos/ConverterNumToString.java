package fundamentos;

public class ConverterNumToString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 5000;
		System.out.println(Integer.toString(num2));
		
		System.out.println(("" + num2));
	}
}
