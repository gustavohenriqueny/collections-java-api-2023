package main.java.list.exercicios.operacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        getTarefas().add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        if (!getTarefas().isEmpty()) {
            getTarefas().forEach(tarefa -> {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasARemover.add(tarefa);
                }
            });
            getTarefas().removeAll(tarefasARemover);
        }
    }

    public Integer obterNumeroTotalTarefas() {
        return getTarefas() != null ? getTarefas().size() : null;
    }

    public void exibirNumeroTotalTarefas() {
        System.out.println("O número total de elementos na lista é: ".concat(obterNumeroTotalTarefas().toString()));
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
