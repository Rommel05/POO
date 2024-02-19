package network1;

public class Texto extends Publicacion {
    private String texto;
    public Texto(Usuario usuario, String texto) {
        super(usuario);
        this.texto = texto;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.texto;
    }
}
