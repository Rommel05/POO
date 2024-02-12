package SIstemasSubastas;

import java.util.HashSet;
import java.util.Set;

public class Subastas {
    private String dia;
    private Set<Lote> lotes;

    public Subastas(String dia) {
        this.dia = dia;
        this.lotes = new HashSet<>();
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

    @Override
    public String toString() {
        return this.dia;
    }
}
