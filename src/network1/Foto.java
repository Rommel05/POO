package network1;

public class Foto extends Publicacion{
    private String imagen;
    private String titulo;
    public Foto(Usuario usuario, String imagen, String titulo) {
        super(usuario);
        this.imagen = imagen;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.imagen + " " + this.titulo;
    }
}
