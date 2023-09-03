package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numeroTelefone) {
        getAgendaContatoMap().put(nome, numeroTelefone);
    }

    public void removerContato(String nome) {
        if (!getAgendaContatoMap().isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroTelefonePorNome = null;
        if (!getAgendaContatoMap().isEmpty()) {
            numeroTelefonePorNome = getAgendaContatoMap().get(nome);
        }
        return numeroTelefonePorNome;
    }

    public Map<String, Integer> getAgendaContatoMap() {
        return agendaContatoMap;
    }

    public void setAgendaContatoMap(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = agendaContatoMap;
    }
}
