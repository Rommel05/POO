package Clase;

import java.util.HashSet;
import java.util.Set;

public class Facultad {
    private int numfacultad;
    private String nombre;
    private Set<Catedra> catedras;

    public Facultad(int numfacultad, String nombre) {
        this.numfacultad = numfacultad;
        this.nombre = nombre;
        this.catedras = new HashSet<>();
    }

    public int getNumfacultad() {
        return numfacultad;
    }

    public void setNumfacultad(int numfacultad) {
        this.numfacultad = numfacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(Set<Catedra> catedras) {
        this.catedras = catedras;
    }
    public void addCatedras(Catedra catedra) {
        this.catedras.add(catedra);
    }
}
