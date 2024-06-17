package DesignPatterns.TemplateMethod.Problem;

import DesignPatterns.TemplateMethod.VeiculoParaReparo;

public class TestRepararVeiculo {
    public static void main(String[] args) {
        System.out.println("-------------LUXO-----------");

        VeiculoParaReparo veiculoDeLuxo =  new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(50);

        ReparaVeiculoDeLuxoService rpl = new ReparaVeiculoDeLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("--------------COMUM-------------");

        VeiculoParaReparo veiculoComum =  new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();

    }
}
