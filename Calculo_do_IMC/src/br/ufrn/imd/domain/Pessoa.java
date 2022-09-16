package br.ufrn.imd.domain;

public class Pessoa {
	
	private double peso;
	private double altura;
	
	
	public double calcularIMC() {
		double imc;
		imc  = this.peso / (Math.pow(this.altura, 2));
		
		return imc;
	}
	
	public String informarIMC(double imc) {
		String classificaçao;
		if(imc < 18.5) {
			classificaçao = "Abaixo do peso";
		} else if (imc >= 18.5 && imc < 25) {
			classificaçao = "Peso normal";
		} else if (imc >= 25 && imc < 30) {
			classificaçao = "Pre-obesidade";
		} else if (imc >= 30 && imc < 35) {
			classificaçao = "Obesidade Grau 1";
		} else if (imc >= 35 && imc < 40) {
			classificaçao = "Obesidade Grau 2";
		} else {
			classificaçao = "Obesidade Grau 3";
		}
		
		return classificaçao;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
