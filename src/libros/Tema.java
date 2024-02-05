package libros;

import java.util.HashSet;
import java.util.Set;

public class Tema {
    private String nombreTema;
    private int cod_t;
    private Set<Tema> temas;

    public Tema(String nombreTema, int cod_t) {
        this.nombreTema = nombreTema;
        this.cod_t = cod_t;
        this.temas = new HashSet<>();
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
    }

    public Set<Tema> getTemas() {
        return temas;
    }

    public void setTemas(Set<Tema> temas) {
        this.temas = temas;
    }
    public void addTemas(Tema tema) {
        this.temas.add(tema);
    }

    @Override
    public String toString() {
        return this.nombreTema + " - " + this.cod_t;
    }
}
