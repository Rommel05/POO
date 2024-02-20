package network1;

public class Comentario {
    private static int cuenta = 0;
    private int id;
    private Publicacion publicacion;
    private Usuario usuario;
    private String texto;

    public Comentario(Publicacion publicacion, Usuario usuario, String texto) {
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.id = cuenta++;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.usuario + ": " + this.texto;
    }
}
