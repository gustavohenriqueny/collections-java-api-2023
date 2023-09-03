package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigoProduto, String nome, Integer quantidade, Double preco) {
        getEstoqueProdutosMap().put(codigoProduto, new Produto(nome, quantidade, preco));
    }

    public void exibirProtudos() {
        System.out.println(getEstoqueProdutosMap());
    }

    public Double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!getEstoqueProdutosMap().isEmpty()) {
            for (Produto produto : getEstoqueProdutosMap().values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!getEstoqueProdutosMap().isEmpty()) {
            for (Produto produto : getEstoqueProdutosMap().values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Map<Long, Produto> getEstoqueProdutosMap() {
        return estoqueProdutosMap;
    }

    public void setEstoqueProdutosMap(Map<Long, Produto> estoqueProdutosMap) {
        this.estoqueProdutosMap = estoqueProdutosMap;
    }
}
