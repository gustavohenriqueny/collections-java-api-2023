package main.java.set.ordenacao;

public class MainSetOrdenacao {

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Produto 1", 1, 15d, 5);
        cadastroProduto.adicionarProduto("Produto 2", 2, 20d, 30);
        cadastroProduto.adicionarProduto("Produto 3", 1, 26d, 2);
        cadastroProduto.adicionarProduto("Produto 4", 9, 2d, 16);

//        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutorPorPreco());
//        System.out.println(cadastroProduto.getProdutos());
    }

}
