package fundamentos;

import javax.swing.JOptionPane;

public class DesafioModulo {
	public static void main(String[] args) {
		Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Numero: "));
		Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Numero: "));
		String op = JOptionPane.showInputDialog("Digite a Operação: ");		
		
		Double resultado = op.equals("+") ? num1 + num2 : 0 ;
		resultado = op.equals("-") ? num1 - num2 : resultado;
		resultado = op.equals("*") ? num1 * num2 : resultado;
		resultado = op.equals("/") ? num1 / num2 : resultado;
		JOptionPane.showMessageDialog(null, resultado);
		System.out.print(resultado);	
		
	}
}
