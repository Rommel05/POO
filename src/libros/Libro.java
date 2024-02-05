package libros;

import java.util.HashSet;
import java.util.Set;

public class Libro {
    private String titulo;
    private String isbn;
    private Set<Autor> autores;
    private Tema tema;
    private Editorial editorial;
    private Set<Ejemplar> ejemplares;

    public Libro(String titulo, String isbn, Tema tema, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = new HashSet<>();
        this.tema = tema;
        this.editorial = editorial;
        this.ejemplares = new HashSet<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }
    public void addAutores(Autor autor) {
        this.autores.add(autor);
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Set<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Set<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
    public void addEjemplares(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return this.titulo + " - " + this.isbn;
    }
}
