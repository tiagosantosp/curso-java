package arrays;

import javax.swing.JOptionPane;

public class DesafioArray {
	public static void main(String[] args) {
		int quantidadeVezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de notas: "));
		
		double[] notas = new double[quantidadeVezes];
		
		for (int i = 0; i < quantidadeVezes; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "° nota:"));
		}
		
		double media = 0;
		
		for(double nota: notas) {
			media += nota;
		}
		
		double resultadoFinal = media / quantidadeVezes;
		
		System.out.printf("Sua média é %.1f", resultadoFinal);
	}
}
