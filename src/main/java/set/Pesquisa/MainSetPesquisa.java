package main.java.set.Pesquisa;

public class MainSetPesquisa {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Gustavo", 123456);
        agendaContatos.adicionarContato("Gustavo", 1234567);
        agendaContatos.adicionarContato("Geferson", 1234);
        agendaContatos.adicionarContato("Douglas", 11111111);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Gustavo"));
        System.out.println("Contato atualizado : " + agendaContatos.atualizarNumeroContato("Gustavo", 999999999));
        agendaContatos.exibirContatos();
    }

}
