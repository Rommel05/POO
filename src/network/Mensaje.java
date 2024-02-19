package network;

public class Mensaje extends Publicacion{
    private String texto;
    public Mensaje(String id, String autor, String texto, String marcaTemporal, int likes) {
        super(id, autor, marcaTemporal, likes);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
