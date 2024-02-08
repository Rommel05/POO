package SIstemasSubastas;

import java.util.HashSet;
import java.util.Set;

public class Subastas {
    private int cod_subasta;
    private Set<Puja> pujas;

    public Subastas(int cod_subasta) {
        this.cod_subasta = cod_subasta;
        this.pujas = new HashSet<>();
    }

    public int getCod_subasta() {
        return cod_subasta;
    }

    public void setCod_subasta(int cod_subasta) {
        this.cod_subasta = cod_subasta;
    }

    public Set<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(Set<Puja> pujas) {
        this.pujas = pujas;
    }
    public void addPujas(Puja puja) {
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return this.cod_subasta +  "";
    }
}
