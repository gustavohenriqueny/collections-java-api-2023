package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        getListaPessoas().add(new Pessoa(nome, idade, altura));
    }

    public void ordernarPorIdade() {
    }

    public void ordenarPorAltura() {
    }


    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
}
