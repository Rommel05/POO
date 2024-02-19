package network;

public class Foto extends Publicacion{
    private String titulo;
    public Foto(String id, String autor, String titulo) {
        super(id, autor);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
