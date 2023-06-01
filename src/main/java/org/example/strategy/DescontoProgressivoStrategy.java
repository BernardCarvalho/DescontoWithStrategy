package org.example.strategy;

public class DescontoProgressivoStrategy implements Desconto {
    private double valorDescontoProgressivo;

    public DescontoProgressivoStrategy(double valorDescontoProgressivo){

        this.valorDescontoProgressivo = valorDescontoProgressivo;
    }

    @Override
    public double calcular(double precoTotalVenda) {
        double precoDescontado=precoTotalVenda/valorDescontoProgressivo;
        if(precoDescontado*5>precoTotalVenda)
            return precoTotalVenda;
        return precoTotalVenda-precoDescontado;


    }
}
