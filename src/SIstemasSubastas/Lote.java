package SIstemasSubastas;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private String nombre;
    private Subastas subasta;

    private Set<Articulo> articulos;

    public Lote(String nombre, Subastas subasta) {
        this.nombre = nombre;
        this.subasta = subasta;
        this.articulos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Subastas getSubasta() {
        return subasta;
    }

    public void setSubasta(Subastas subasta) {
        this.subasta = subasta;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addArticulos(Articulo articulo) {
        this.articulos.add(articulo);
    }



    @Override
    public String toString() {
        return this.nombre;
    }
}
