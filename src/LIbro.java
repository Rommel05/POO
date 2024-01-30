import java.util.List;

public class LIbro {
    private String titulo;
    private Autor autor;
    private List<Tema> temas;

    public LIbro(String titulo, Autor autor, List<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.temas = temas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        return getAutor() + " - " + getTitulo() + " - " + getTemas();
    }
}
