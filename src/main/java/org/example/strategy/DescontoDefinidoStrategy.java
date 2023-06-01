package org.example.strategy;

public class DescontoDefinidoStrategy implements Desconto{

    double indiceDesconto;

    public DescontoDefinidoStrategy(double indiceDesconto) {
        this.indiceDesconto = 1-indiceDesconto;
    }

    @Override
    public double calcular(double precoTotalVenda) {
        return precoTotalVenda*indiceDesconto;
    }
}
