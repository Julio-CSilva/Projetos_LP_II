package br.ufrn.imd.main;

import br.ufrn.imd.domain.*;
import java.util.Date;

public class LojaView {
    public static void main(String[] args) throws Exception {

        Date data = new Date();

        Deposito d1 = new Deposito();
        ProdutoDuravel pd1 = new ProdutoDuravel("carro", 10.000, "BMW", data, 30);
        ProdutoDuravel pd2 = new ProdutoDuravel("Moto", 5.000, "AUDI", data, 20);
        ProdutoDuravel pd3 = new ProdutoDuravel("Celular", 2.500, "sansung", data, 10);
        ProdutoNaoDuravel pnd1 = new ProdutoNaoDuravel("Chocolate", 10.0, "Garoto", data, data);
        ProdutoNaoDuravel pnd2 = new ProdutoNaoDuravel("Toalha", 20.0, "limp", data, data);
        ProdutoNaoDuravel pnd3 = new ProdutoNaoDuravel("Sabonete", 1.0, "Dove", data, data);

        d1.AdicionarProduto(pd1);
        d1.AdicionarProduto(pd2);
        d1.AdicionarProduto(pd3);
        d1.AdicionarProduto(pnd1);
        d1.AdicionarProduto(pnd2);
        d1.AdicionarProduto(pnd3);

        d1.quantidadeDeposito();

        d1.produtoMaiorValor();
    
    
    
    
    }
}
