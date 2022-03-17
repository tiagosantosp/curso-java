package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		double[] notasAlunos = new double [3];
		notasAlunos[0] = 3.4;
		notasAlunos[1] = 7.2;
		//notasAlunos[2] = 8.9;
		
		System.out.println(Arrays.toString(notasAlunos));
		
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println(notasAlunos[i]);
		}
		
		double[] notasAlunos2 = { 5, 2, 4, 8};
		
		for (int i = 0; i < notasAlunos2.length; i++) {
			System.out.println(notasAlunos2[i]);
		}
	}
}
