package main.java.list.exercicios.pesquisa.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros() {
        setNumeros(new ArrayList<>());
    }

    public void adicionarNumero(int numero) {
        if (getNumeros() != null) {
            getNumeros().add(numero);
        }
    }

    public Integer calcularSoma() {
        Integer valorSoma = 0;
        if (!getNumeros().isEmpty()) {
            for (Integer numero : getNumeros()) {
                valorSoma += numero;
            }
        }
        return valorSoma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = Integer.MIN_VALUE;
        if (!getNumeros().isEmpty()) {
            for (Integer numero : getNumeros()) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero() {
        Integer menorNumero = Integer.MAX_VALUE;
        if (!getNumeros().isEmpty()) {
            for (Integer numero : getNumeros()) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(!getNumeros().isEmpty() ? getNumeros() : null);
    }


    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
}
