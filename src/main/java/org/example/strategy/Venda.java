package org.example.strategy;

import org.example.model.Produto;

import java.util.List;

public class Venda {
    private List<Produto> produtoList;

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Desconto getDescontoBehaviour() {
        return descontoBehaviour;
    }

    public void setDescontoBehaviour(Desconto descontoBehaviour) {
        this.descontoBehaviour = descontoBehaviour;
    }

    Desconto descontoBehaviour;
    public double getValorVenda(){
        double totalPrecoVendaSemDesconto=produtoList.stream().mapToDouble(produto -> produto.getPreco()).sum();
        if(descontoBehaviour!=null)
            return descontoBehaviour.calcular(totalPrecoVendaSemDesconto);
        else
            return totalPrecoVendaSemDesconto;
    }
}
