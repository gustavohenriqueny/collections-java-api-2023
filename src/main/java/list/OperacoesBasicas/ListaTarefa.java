package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    List<Tarefa> tarefas;

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        getTarefas().add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        getTarefas().forEach(tarefa -> {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasARemover.add(tarefa);
            }
        });
        getTarefas().removeAll(tarefasARemover);
    }

    public int obterNumeroTotalTarefas() {
        return getTarefas().size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(getTarefas());
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }


}
