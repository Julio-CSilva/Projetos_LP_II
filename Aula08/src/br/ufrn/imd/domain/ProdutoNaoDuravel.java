package br.ufrn.imd.domain;

import java.util.Date;

public class ProdutoNaoDuravel extends Produto{
	
    private Date dataValidade;
	private String genero; //tipos: alimenticio, limpeza, vestuario, higiene

	public ProdutoNaoDuravel(String nome, double preco, String marca, Date dataFabricacao, Date datav) {
        super(nome, preco, marca, dataFabricacao);
        //TODO Auto-generated constructor stub
        setDataValidade(datav);
    }
	
	
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}