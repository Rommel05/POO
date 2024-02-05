package libros;

import java.util.HashSet;
import java.util.Set;

public class Autor {
    private String nombre;
    private int codAut;
    private Set<Libro> libros;
    public Autor(String nombre, int codAut) {
        this.nombre = nombre;
        this.codAut = codAut;
        this.libros = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodAut() {
        return codAut;
    }

    public void setCodAut(int codAut) {
        this.codAut = codAut;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }
    public void addlibros(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.codAut;
    }
}
