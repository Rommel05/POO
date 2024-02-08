package SIstemasSubastas;

import java.util.HashSet;
import java.util.Set;

public class Pujador {
    private String nombre;
    private String dni;
    private Set<Puja> pujas;

    public Pujador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.pujas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
        return this.nombre + this.dni;
    }
}
