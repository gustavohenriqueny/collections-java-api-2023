package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome,Integer codigoConvite) {
        getConvidados().add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(Integer codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado convidado : getConvidados()) {
            if (convidado.getCodigoConvite().equals(codigoConvite)) {
                convidadoRemover = convidado;
                break;
            }
        }
        getConvidados().remove(convidadoRemover);
    }

    public Integer contarConvidados() {
        return getConvidados().size();
    }

    public void exibirConvidados() {
        System.out.println(getConvidados());
    }


    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }

    @Override
    public String toString() {
        return "ConjuntoConvidados{" +
                "convidados=" + convidados +
                '}';
    }

}
