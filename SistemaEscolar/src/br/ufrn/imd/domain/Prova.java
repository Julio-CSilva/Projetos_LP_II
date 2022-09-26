package br.ufrn.imd.domain;

public class Prova {

	private Double notaParte1;
	private Double notaParte2;

	public Prova(Double np1, Double np2){
		setNotaParte1(np1);
		setNotaParte2(np2);
	}
	
	public Double calcularNotaTotal() {
		Double notaProva = getNotaParte1() + getNotaParte2();
		if(notaProva > 10.0) {
			notaProva = 10.0;
		}
		
		return notaProva;
	}

	public Double getNotaParte1() {
		return notaParte1;
	}

	public void setNotaParte1(Double notaParte1) {
		this.notaParte1 = notaParte1;
	}

	public Double getNotaParte2() {
		return notaParte2;
	}

	public void setNotaParte2(Double notaParte2) {
		this.notaParte2 = notaParte2;
	}
	
	
}
