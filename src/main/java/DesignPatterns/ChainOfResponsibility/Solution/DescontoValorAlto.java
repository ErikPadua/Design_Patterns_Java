package DesignPatterns.ChainOfResponsibility.Solution;

import DesignPatterns.ChainOfResponsibility.Carro;
import DesignPatterns.ChainOfResponsibility.Marca;

import java.math.BigDecimal;

public class DescontoFIAT extends DescontoCarro{


    public DescontoFIAT(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorvenda = carro.getPreco();

        if(Marca.FIAT.equals(carro.getMarca())){
            return valorvenda.subtract(new BigDecimal(1000));
        }

        return proximoDesconto.aplicaDesconto(carro);
    }
}
