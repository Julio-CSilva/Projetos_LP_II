package br.ufrn.imd.domain;

public class Aluno {
	
	private Prova prova1;
	private Prova prova2;

	public Aluno(Prova p1, Prova p2){
		setProva1(p1);
		setProva2(p2);
	}
	
	public Double calcularMedia() {
		Double notaMediaAluno = (getProva1().calcularNotaTotal() + getProva2().calcularNotaTotal())/2;
		
		return notaMediaAluno;
	}

	public Prova getProva1() {
		return prova1;
	}

	public void setProva1(Prova prova1) {
		this.prova1 = prova1;
	}

	public Prova getProva2() {
		return prova2;
	}

	public void setProva2(Prova prova2) {
		this.prova2 = prova2;
	}
	
	
}
