package SIstemasSubastas;

import java.util.HashSet;
import java.util.Set;

public class Subastas {
    private String dia;
    private Set<Lote> lotes;

    private Set<Puja> pujas;

    public Subastas(String dia) {
        this.dia = dia;
        this.lotes = new HashSet<>();
        this.pujas = new HashSet<>();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }

    public void addLotes(Lote lote) {
        this.lotes.add(lote);
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
        return this.dia;
    }
}
