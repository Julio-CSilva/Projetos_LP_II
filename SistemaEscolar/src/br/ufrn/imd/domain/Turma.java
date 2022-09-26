package br.ufrn.imd.domain;

public class Turma {
	
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	
	public Double calcuolarMedia() {
		Double mediaTurma;
		mediaTurma = (getAluno1().calcularMedia() + getAluno2().calcularMedia() + getAluno3().calcularMedia())/3;
		
		return mediaTurma;
	}

	public Aluno getAluno1() {
		return aluno1;
	}

	public void setAluno1(Aluno aluno1) {
		this.aluno1 = aluno1;
	}

	public Aluno getAluno2() {
		return aluno2;
	}

	public void setAluno2(Aluno aluno2) {
		this.aluno2 = aluno2;
	}

	public Aluno getAluno3() {
		return aluno3;
	}

	public void setAluno3(Aluno aluno3) {
		this.aluno3 = aluno3;
	}
	
	
}
