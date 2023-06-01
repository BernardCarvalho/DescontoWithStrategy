package org.example;


import org.example.model.Produto;
import org.example.strategy.DescontoDefinidoStrategy;
import org.example.strategy.DescontoProgressivoStrategy;
import org.example.strategy.Venda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //forma com strategy
        org.example.strategy.Venda vendaComStrategy = new Venda();
        vendaComStrategy.setProdutoList(List.of(new Produto("arroz",11.8),new Produto("feijao",8.2)));
        System.out.println(vendaComStrategy.getValorVenda());
        vendaComStrategy.setDescontoBehaviour(new DescontoDefinidoStrategy(0.6));
        System.out.println(vendaComStrategy.getValorVenda());
        vendaComStrategy.setDescontoBehaviour(new DescontoProgressivoStrategy(25));
        System.out.println(vendaComStrategy.getValorVenda());
    }
}