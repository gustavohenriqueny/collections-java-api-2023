package main.java.map.OperacoesBasicas;

public class MainMapOperacoesBasicas {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gustavo", 12345);
        agendaContatos.adicionarContato("Gustavo", 2312312);
        agendaContatos.adicionarContato("Douglas", 123123123);
        agendaContatos.adicionarContato("Junin", 1231231);
        agendaContatos.adicionarContato("MIB", 123123123);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Douglas");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Gustavo"));
    }

}
