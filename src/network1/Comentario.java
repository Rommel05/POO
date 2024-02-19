package network1;

public class Comentario {
    private static int cuenta = 0;
    private int id;
    private Publicacion publicacion;

    public Comentario(Publicacion publicacion) {
        this.publicacion = publicacion;
        this.id = cuenta++;
    }
}
