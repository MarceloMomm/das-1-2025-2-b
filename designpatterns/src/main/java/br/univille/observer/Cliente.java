package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        //publicador
        var grupoFamilia = new Publisher();

        var marcelo = new ConcreteSubscriber();
        var joao = new ConcreteSubscriber();
        var tia = new ConcreteSubscriber();

        //entrou no grupo da familia
        grupoFamilia.subscribe(marcelo);
        grupoFamilia.subscribe(joao);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("BOM DIA GALERA");
        //botao de envio
        grupoFamilia.notifySubscribers();

    }
}
