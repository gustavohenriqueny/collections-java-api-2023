package main.java.list.exercicios.operacoesBasicas;

import main.java.list.exercicios.operacoesBasicas.carrinhoDeCompras.CarrinhoDeCompras;
import main.java.list.exercicios.operacoesBasicas.listaTarefas.ListaTarefas;

public class MainListOperacoesBasicas {

    public static void main(String[] args) {
//        Testando os metódos das operações básicas.
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.exibirNumeroTotalTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.exibirNumeroTotalTarefas();
        listaTarefas.removerTarefa("Tarefa 3");
        listaTarefas.exibirNumeroTotalTarefas();
        listaTarefas.obterDescricoesTarefas();

//        Exercicio : fazer um carrinho de compras.
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Produto 1", 10.0, 10);
        carrinhoDeCompras.adicionarItem("Produto 2", 15.0, 15);
        carrinhoDeCompras.adicionarItem("Produto 3", 20.0, 20);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.exibiValorTotal();
        carrinhoDeCompras.removerItem("Produto 2");
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.exibiValorTotal();
    }

}
