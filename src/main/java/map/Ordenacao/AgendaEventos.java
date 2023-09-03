package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private HashMap<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        getEventosMap().put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda() {
        System.out.println(new TreeMap<>(getEventosMap()));
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(getEventosMap());
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecera na data " + proximaData);
                break;
            }
        }
    }

    public HashMap<LocalDate, Evento> getEventosMap() {
        return eventosMap;
    }

    public void setEventosMap(HashMap<LocalDate, Evento> eventosMap) {
        this.eventosMap = eventosMap;
    }
}
