package libros;

import java.util.HashSet;
import java.util.Set;

public class Editorial {
    private String nombreEd;
    private int cod_ed;
    private Set<Libro> libros;

    public Editorial(String nombreEd, int cod_ed) {
        this.nombreEd = nombreEd;
        this.cod_ed = cod_ed;
        this.libros = new HashSet<>();
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
    }

    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }
    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return this.nombreEd + " - " + this.cod_ed;
    }
}
