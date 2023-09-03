package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, Integer numeroTelefone) {
        getContatos().add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        System.out.println(getContatos());
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : getContatos()) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, Integer novoNumeroTelefone) {
        Contato contatoAtualizado = null;
        for (Contato contato : getContatos()) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumeroTelefone(novoNumeroTelefone);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public Set<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(Set<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "AgendaContatos{" +
                "contatos=" + contatos +
                '}';
    }

}
