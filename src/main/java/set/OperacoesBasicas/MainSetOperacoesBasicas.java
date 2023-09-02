package main.java.set.OperacoesBasicas;

public class MainSetOperacoesBasicas {

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Gustavo", 1234);
        conjuntoConvidados.adicionarConvidado("Juninho", 1235);
        conjuntoConvidados.adicionarConvidado("Macedo", 1235);
        conjuntoConvidados.adicionarConvidado("Douglas", 1236);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");
        conjuntoConvidados.exibirConvidados();
    }

}
