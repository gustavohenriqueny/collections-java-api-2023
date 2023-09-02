package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Gustavo", 19, 1.82);
        ordenacaoPessoa.adicionarPessoa("Juninho", 20, 1.85);
        ordenacaoPessoa.adicionarPessoa("Macedo", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Douglas", 18, 1.90);


        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        getListaPessoas().add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(getListaPessoas());
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(getListaPessoas());
        Collections.sort(pessoasPorAltura, new ComparadorPorAltura());
        return pessoasPorAltura;
    }


    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
}
