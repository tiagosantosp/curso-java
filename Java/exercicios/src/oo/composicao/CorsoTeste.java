package oo.composicao;

public class CorsoTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Tiago");
		Aluno a2 = new Aluno ("Maria");
		Aluno a3 = new Aluno ("Dani");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("React");
		Curso c3 = new Curso("Python");
		
		c1.adicionarAluno(a1);
		c1.adicionarAluno(a2);
		
		c2.adicionarAluno(a1);
		c2.adicionarAluno(a3);
		
		a1.adicionarCurso(c3);
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);
		
		for (Aluno aluno: c1.alunos) {
			System.out.println("Curso: 1");
			System.out.println("NOME: " + aluno.nome);
		}
	}
	
	
}
