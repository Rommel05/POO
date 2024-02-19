package network;

public class Foto extends Publicacion{
    private String titulo;
    public Foto(String id, String autor, String titulo, String marcaTemporal, int likes) {
        super(id, autor, marcaTemporal, likes);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
