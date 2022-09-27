package br.ufrn.imd.domain;

import java.util.ArrayList;

public class Deposito {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<>();
	
	public void AdicionarProduto(Produto produto) {
		listaProdutos.add(produto);
        System.out.println("Produto adicionado!");
	}
	
	public void RemoverProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	public void quantidadeDeposito() {
		
		System.out.println("Quantidade de produtos em Estoque: "+listaProdutos.size());
	}
	
	public void depositoVazio() {
		if(listaProdutos.size() == 0) {
			System.out.println("O Deposito está vazio!");
		} else {
			System.out.println("Existem Produtos dentro do Deposito!");
		}
	}
	
	public void produtoMaiorValor() {
		String produtoMaior = "";
		double valor = 0;
		
		for(Produto produto: listaProdutos) {
			if(produto.getPreco() > valor) {
				valor = produto.getPreco();
				produtoMaior = produto.getNome();
			}
		}
        System.out.println(produtoMaior+" é o produto de maior valor do estoque!");
	}
	
}