package SIstemasSubastas;

import java.util.Set;

public class Pujador {
    private String nombre;

    private Set<Puja> pujas;

    public Pujador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
