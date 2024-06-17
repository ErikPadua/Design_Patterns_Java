package DesignPatterns.Singleton.Problem;

//Cria várias instancias, nunca salvando o comando anterior
public class TestAgenda {
    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sabado");
    }

    public static void  reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
