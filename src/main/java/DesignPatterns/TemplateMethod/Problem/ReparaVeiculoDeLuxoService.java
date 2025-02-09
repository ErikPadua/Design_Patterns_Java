package DesignPatterns.TemplateMethod.Problem;

import DesignPatterns.TemplateMethod.VeiculoParaReparo;

public class ReparaVeiculoComumService {
    private VeiculoParaReparo veiculoParaReparo;

    public  ReparaVeiculoComumService(VeiculoParaReparo veiculoParaReparo){
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        }
        else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para seguradora...");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para seguradora...");
    }

    private void repararVeiculo() {
        System.out.println("Reparando veiculo...");
    }

    private void analisarDanos() {
        System.out.println("Analisando Dano...");
    }

    private void entradaOficina() {
        System.out.println("Veiculo entrando Oficina...");
    }
}
