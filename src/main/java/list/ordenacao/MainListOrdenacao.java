package main.java.list.ordenacao;

public class MainListOrdenacao {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Gustavo", 19, 1.82);
        ordenacaoPessoa.adicionarPessoa("Juninho", 20, 1.85);
        ordenacaoPessoa.adicionarPessoa("Macedo", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Douglas", 18, 1.90);
        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
