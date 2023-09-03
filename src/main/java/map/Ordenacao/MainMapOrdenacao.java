package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;

public class MainMapOrdenacao {

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 2), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

}
