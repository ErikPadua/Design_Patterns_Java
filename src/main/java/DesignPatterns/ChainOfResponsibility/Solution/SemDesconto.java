package DesignPatterns.ChainOfResponsibility.Solution;

import DesignPatterns.ChainOfResponsibility.Carro;
import DesignPatterns.ChainOfResponsibility.Marca;

import java.math.BigDecimal;

public class DescontoValorAlto extends DescontoCarro{


    public DescontoValorAlto(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorvenda = carro.getPreco();

        if(carro.getPreco().compareTo(new BigDecimal(100000.00))> 0){
            return valorvenda.subtract(new BigDecimal(10000));
        }

        return proximoDesconto.aplicaDesconto(carro);
    }
}
