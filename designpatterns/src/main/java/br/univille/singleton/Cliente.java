package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
        var segredo = "Dale Gremio";

        var singleton = Singleton.getInstance();
        singleton.setSegredo(segredo);

        System.out.println(
            Singleton.getInstance().getSegredo()
        );

    }
}
