package br.ufrn.imd.main;

import br.ufrn.imd.domain.*;

public class Main {

	public static void main(String[] args) {
		//Turma 1
		Turma t1 = new Turma();
		//Aluno 1
		Prova p1a1 = new Prova(5.0, 5.0);
		Prova p2a1 = new Prova(6.5, 7.7);
		Aluno a1 = new Aluno(p1a1, p2a1);
		//Aluno 2		
		Prova p1a2 = new Prova(6.0, 6.0);
		Prova p2a2 = new Prova(6.5, 8.7);
		Aluno a2 = new Aluno(p1a2, p2a2);
		//Aluno 3
		Prova p1a3 = new Prova(4.0, 9.0);
		Prova p2a3 = new Prova(6.5, 2.7);
		Aluno a3 = new Aluno(p1a3, p2a3);
		//Adicionando alunos a Turma 1
		t1.setAluno1(a1);
		t1.setAluno2(a2);
		t1.setAluno3(a3);
		
		System.out.println("// Média dos Alunos //\n "
				+ "Aluno 1: "+a1.calcularMedia()+"\n "
				+ "Aluno 2: "+a2.calcularMedia()+"\n "
				+ "Aluno 3: "+a3.calcularMedia()+"\n "
				+ "Média geral da turma: "+t1.calcuolarMedia());
		
	}

}
