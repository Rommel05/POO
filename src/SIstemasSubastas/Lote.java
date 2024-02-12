package SIstemasSubastas;

import java.util.HashSet;
import java.util.Set;

public class Lote {
    private String nombre;

    private String cod;
    private Subastas subasta;

    private Set<Articulo> articulos;

    public Lote(String nombre, String cod,Subastas subasta) {
        this.nombre = nombre;
        this.cod = cod;
        this.subasta = subasta;
        this.articulos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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

    public double getPrecioSalida() {
        return this.getArticulos().stream().map(Articulo::getPrecio).mapToDouble(Double::valueOf).sum();
    }

    public Lote (String cod) {
        this.cod = cod;
        this.articulos = new HashSet<>();
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
