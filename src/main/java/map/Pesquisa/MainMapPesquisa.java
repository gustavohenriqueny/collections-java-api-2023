package main.java.map.Pesquisa;

public class MainMapPesquisa {

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProtudos();
        estoque.adicionarProduto(1L, "Produto 1", 10, 5.0);
        estoque.adicionarProduto(2L, "Produto 2", 5, 10.0);
        estoque.adicionarProduto(3L, "Produto 3", 2, 15.0);
        estoque.exibirProtudos();
        System.out.println("Valor Total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro do estoque: R$" + estoque.obterProdutoMaisCaro());
    }

}
