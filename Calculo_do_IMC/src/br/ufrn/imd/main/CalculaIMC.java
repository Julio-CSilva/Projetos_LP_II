package br.ufrn.imd.main;

import java.util.Scanner;

import br.ufrn.imd.domain.Pessoa;

/**
 * Calculadora de IMC;
 * @author julio
 * 15/09/2022
 * Criação de uma classe chamada Pessoa, onde tem os atributos: altura e peso, e metodos: calcularIMC e 
 * informarIMC, onde informa em qual nivel se encontra o IMC do Objeto instanciado.
 */

public class CalculaIMC {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		double peso, altura, imc;
		String classificaçao;
		
		System.out.println("Digite seu peso: ");
		peso = teclado.nextDouble();
		p1.setPeso(peso);
		
		System.out.println("Digite sua altura: ");
		altura = teclado.nextDouble();
		p1.setAltura(altura);
		
		imc = p1.calcularIMC();
		classificaçao = p1.informarIMC(imc);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Peso    => "+peso);
		System.out.println("Altura  => "+altura);
		System.out.printf("IMC     => %.2f\n", imc);
		System.out.println("Pessoa com: "+classificaçao);		
		
		teclado.close();
	}

}
