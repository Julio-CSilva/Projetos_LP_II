package br.ufrn.imd.domain;

import java.util.Date;

public class ProdutoDuravel extends Produto{

    private int durabilidade; //expressada em anos


	public ProdutoDuravel(String nome, double preco, String marca, Date dataFabricacao, int durabilidade) {
        super(nome, preco, marca, dataFabricacao);
        //TODO Auto-generated constructor stub
        setDurabilidade(durabilidade);

    }
	
	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}

	
}