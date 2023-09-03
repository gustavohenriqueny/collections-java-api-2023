package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, Integer codigo, Double preco, Integer quantidade) {
        getProdutos().add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(getProdutos());
    }

    public Set<Produto> exibirProdutorPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(getProdutos());
        return produtosPorPreco;
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }


}
