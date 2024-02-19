package network;

public class Mensaje extends Publicacion{
    private String texto;
    public Mensaje(String id, String autor, String texto) {
        super(id, autor);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
