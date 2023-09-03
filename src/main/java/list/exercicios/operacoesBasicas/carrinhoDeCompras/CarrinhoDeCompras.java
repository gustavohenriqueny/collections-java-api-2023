package main.java.list.exercicios.operacoesBasicas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade) {
        getItens().add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensARemover = new ArrayList<>();
        if (!getItens().isEmpty()) {
            getItens().forEach(item -> {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensARemover.add(item);
                }
            });
        }
        getItens().removeAll(itensARemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!getItens().isEmpty()) {
            for (Item item : getItens()) {
                valorTotal += item.getQuantidade() * item.getPreco();
            }
        }
        return valorTotal;
    }

    public void exibiValorTotal() {
        System.out.println("O valor total do carrinho é: " + calcularValorTotal());
    }

    public void exibirItens() {
        System.out.println(getItens());
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
