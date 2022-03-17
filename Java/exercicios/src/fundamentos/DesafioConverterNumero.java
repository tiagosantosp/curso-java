package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConverterNumero {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("1° Salario: ");
		String s2 = JOptionPane.showInputDialog("2° Salario: ");
		String s3 = JOptionPane.showInputDialog("3° Salario: ");
		
		double salario1 = Double.parseDouble(s1.replace(",", "."));
		double salario2 = Double.parseDouble(s2.replace(",", "."));
		double salario3 = Double.parseDouble(s3.replace(",", "."));
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("A média salarial é R$%.2f", media);
	}
}
