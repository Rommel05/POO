package libros;

import java.util.HashSet;
import java.util.Set;

public class Ejemplar {
    private String nombre;
    private int n_reg;
    private Libro libro;
    private Set<Historico> historicos;

    public Ejemplar(String nombre, int n_reg, Libro libro) {
        this.nombre = nombre;
        this.n_reg = n_reg;
        this.libro = libro;
        this.historicos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Set<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(Set<Historico> historicos) {
        this.historicos = historicos;
    }
    public void addHistoricos(Historico historico) {
        this.historicos.add(historico);
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.n_reg;
    }
}
