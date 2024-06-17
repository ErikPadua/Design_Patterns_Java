package DesignPatterns.ChainOfResponsibility.Problem;

import DesignPatterns.ChainOfResponsibility.Carro;
import DesignPatterns.ChainOfResponsibility.Marca;

import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calcularValorVenda(Carro carro){
        BigDecimal valorvenda = carro.getPreco();

        if(Marca.FIAT.equals(carro.getMarca())){
            return valorvenda.subtract(new BigDecimal(1000));
        }
        if(Marca.FORD.equals(carro.getMarca())){
            return valorvenda.subtract(new BigDecimal(2000));
        }
        if(carro.getPreco().compareTo(new BigDecimal(100000.00))> 0){
            return valorvenda.subtract(new BigDecimal(10000));
        }
        return valorvenda;
    }
}
