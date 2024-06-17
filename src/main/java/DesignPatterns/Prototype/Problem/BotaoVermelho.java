package DesignPatterns.Prototype.Problem;

import DesignPatterns.Prototype.Botao;
import DesignPatterns.Prototype.tipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul() {
        setCor("AZul");
        setAltura(35);
        setLargura(125);
        setTipoBorda(tipoBordaEnum.TRACEJADA);
    }
}
